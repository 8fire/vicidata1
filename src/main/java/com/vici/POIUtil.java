package com.vici;
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vici.response.ViciException;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;  
public class POIUtil {
	   private static Logger logger  = Logger.getLogger(POIUtil.class);  
	    private final static String xls = "xls";  
	    private final static String xlsx = "xlsx";  
	      
	    /** 
	     * 读入excel文件，解析后返回 
	     * @param file 
	     * @throws IOException  
	     */  
	    public static List<String[]> readExcel(MultipartFile file,String[] standardFieldsArr) throws IOException{
	        //检查文件  
	        checkFile(file);  
	        //获得Workbook工作薄对象  
	        Workbook workbook = getWorkBook(file);
			CellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setWrapText(false);
			//创建返回对象，把每行中的值作为一个数组，所有行作为一个集合返回
			List<String> strings = validateNewData(workbook, standardFieldsArr);
			logger.info("========错误的头标题====="+strings);
			List<String[]> list = new ArrayList<String[]>();

	        if(workbook != null){  
	            for(int sheetNum = 0;sheetNum < workbook.getNumberOfSheets();sheetNum++){  
	                //获得当前sheet工作表  
	                Sheet sheet = workbook.getSheetAt(sheetNum);  
	                if(sheet == null){  
	                    continue;  
	                }  
	                //获得当前sheet的开始行  
	                int firstRowNum  = sheet.getFirstRowNum();  
	                //获得当前sheet的结束行  
	                int lastRowNum = sheet.getLastRowNum();  
	                //循环除了第一行的所有行  
	                for(int rowNum = firstRowNum+1;rowNum <= lastRowNum;rowNum++){  
	                    //获得当前行  
	                    Row row = sheet.getRow(rowNum);  
	                    if(row == null){  
	                        continue;  
	                    }
						//getPhysicalNumberOfCells 是获取不为空的列个数。
						//getLastCellNum 是获取最后一个不为空的列是第几个。
					    //同样，HSSFSheet获取行也有类似两个办法，若是excel数据中存在空行或空列，必须用getLastRow的办法才干完全读取数据。
	                    //获得当前行的开始列  
	                    int firstCellNum = row.getFirstCellNum();  
	                    //获得当前行的列数  
	                    //int lastCellNum = row.getPhysicalNumberOfCells();
						int lastCellNum = standardFieldsArr.length;
						String[] cells = new String[standardFieldsArr.length];
	                    //循环当前行  
	                    for(int cellNum = firstCellNum; cellNum < lastCellNum;cellNum++){  
	                        Cell cell = row.getCell(cellNum);
	                        //Excel有换行读取的时候转为空格怼成一行
	                        cells[cellNum] = getCellValue(cell).replaceAll("\r\n|\r|\n","");
	                        logger.info("=======读取的前台数据========>"+cells[cellNum]);
	                    }

	                    list.add(cells);
	                }  
	            }  
	            workbook.close();  
	        }  
	        return list;
	    }

	 /**
	 * 校验是否是标准模板
	 * @param workbook
	 */
	 public static List<String> validateNewData(Workbook workbook,String[] standardFieldsArr){
		 Map<String,Object> fieldsMap=new HashMap<>();
		 List<String> list=new ArrayList();
		  //获取第一行的sheet对象
		  Sheet sheet = workbook.getSheetAt(0);
		  Row firstRow = sheet.getRow(0);
		  for (int i = 0; i < firstRow.getPhysicalNumberOfCells(); i++) {
			  Cell cell= firstRow.getCell(i);
			  String field= getCellValue(cell);
			 // fieldsMap.put(field, i);
			  if (!standardFieldsArr[i].equals(field)) {
				  logger.info("==========不是标准模板");
				  list.add(field);
				  throw new ViciException("不是标准模板,请检查您的【"+field+"】是否与标准模板的【"+standardFieldsArr[i]+"】一致");
			  }
		  }
           return list;
	  }

	/**
	 * 检查文件
	 * @param file
	 * @throws IOException
	 */
	public static void checkFile(MultipartFile file) throws IOException{  
	        //判断文件是否存在  
	        if(null == file){  
	            logger.error("文件不存在！");  
	            throw new FileNotFoundException("文件不存在！");  
	        }  
	        //获得文件名  
	        String fileName = file.getOriginalFilename();  
	        //判断文件是否是excel文件  
	        if(!fileName.endsWith(xls) && !fileName.endsWith(xlsx)){  
	            logger.error(fileName + "不是excel文件");  
	            throw new IOException(fileName + "不是excel文件");  
	        }  
	    }

	/**
	 * 根据文件后缀名获取不同的Workbook工作薄对象
	 * @param file
	 * @return
	 */
	public static Workbook getWorkBook(MultipartFile file) {  
	        //获得文件名  
	        String fileName = file.getOriginalFilename();  
	        //创建Workbook工作薄对象，表示整个excel  
	        Workbook workbook = null;  
	        try {  
	            //获取excel文件的io流  
	            InputStream is = file.getInputStream();  
	            //根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象  
	            if(fileName.endsWith(xls)){  
	                //2003  
	                workbook = new HSSFWorkbook(is);  
	            }else if(fileName.endsWith(xlsx)){  
	                //2007  
	                workbook = new XSSFWorkbook(is);  
	            }  
	        } catch (IOException e) {
	        	String message= e.getMessage();
	        	if(message.contains("Invalid header signature; read 0x16DA89006D5A7E6E")){
	        		logger.info("文件已加密请先解密！");
				}
	            logger.info(e.getMessage());  
	        }  
	        return workbook;  
	    }

	/**
	 * 根据传入的cell对象获取值
	 * @param cell
	 * @return
	 */
	public static String getCellValue(Cell cell){  
	        String cellValue = "";  
	        if(cell == null){  
	            return cellValue;  
	        }  
	        //把数字当成String来读，避免出现1读成1.0的情况  
	        if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){  
	            cell.setCellType(Cell.CELL_TYPE_STRING);  
	        }  
	        //判断数据的类型  
	        switch (cell.getCellType()){  
	            case Cell.CELL_TYPE_NUMERIC: //数字  
	                cellValue = String.valueOf(cell.getNumericCellValue());  
	                break;  
	            case Cell.CELL_TYPE_STRING: //字符串  
	                cellValue = String.valueOf(cell.getStringCellValue());  
	                break;  
	            case Cell.CELL_TYPE_BOOLEAN: //Boolean  
	                cellValue = String.valueOf(cell.getBooleanCellValue());  
	                break;  
	            case Cell.CELL_TYPE_FORMULA: //公式  
	               /* cellValue = String.valueOf(cell.getCellFormula());*/
                    cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
                    cellValue = String.valueOf(cell.getNumericCellValue());
	                break;  
	            case Cell.CELL_TYPE_BLANK: //空值   
	                cellValue = "";  
	                break;  
	            case Cell.CELL_TYPE_ERROR: //故障  
	                cellValue = "非法字符";  
	                break;  
	            default:  
	                cellValue = "未知类型";  
	                break;  
	        }  
	        return cellValue;  
	    }  
}
