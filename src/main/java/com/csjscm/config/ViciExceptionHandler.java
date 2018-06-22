package com.csjscm.config;

import com.google.common.collect.Maps;
import com.vici.response.MsgResponse;
import com.vici.response.ViciException;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 全局异常处理器
 *
 * @author csjscm
 * create 2018-05-23 下午 2:51
 **/
/*@ControllerAdvice*/
@Slf4j
public class ViciExceptionHandler {
    public static final String IMOOC_ERROR_VIEW = "/commons/error";
    public static final String UNAUTHORIZED_ERROR_VIEW = "/commons/403";
    public static final String UNAUTHORIZED_ERROR_MSG="对不起，您没有操作权限";
    public static final String IMOOC_ERROR_MSG="对不起，您没有操作权限";

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object errorHandler(HttpServletRequest reqest,
                               HttpServletResponse response, Exception ex) throws Exception {
        MsgResponse msgResponse=new MsgResponse();
        ModelAndView mav = new ModelAndView();
        if (isAjax(reqest)) {
            if(ex instanceof UnauthorizedException){
                Map<String,Object> map= Maps.newHashMap();
                map.put("errmsg",ex.getMessage());
                msgResponse.setCode(403);
                msgResponse.setMsg(UNAUTHORIZED_ERROR_MSG);
                msgResponse.setExtend(map);
                return msgResponse;
            }else if( ex instanceof ViciException){
                //自定义异常
                ViciException viciException=(ViciException) ex;
                Map<String,Object> map= Maps.newHashMap();
                map.put("errmsg",ex.getMessage());
                msgResponse.setCode(1000);
                msgResponse.setMsg(viciException.getMessage());
                msgResponse.setExtend(map);
                return msgResponse;
            }else {
                Map<String,Object> map= Maps.newHashMap();
                map.put("errmsg",ex.getMessage());
                msgResponse.setCode(500);
                msgResponse.setMsg(IMOOC_ERROR_MSG);
                msgResponse.setExtend(map);
                return msgResponse;
            }

        }else if(ex instanceof UnauthorizedException){
            //如果是shiro无权操作，因为shiro 在操作auno等一部分不进行转发至无权限url
            mav.addObject("exception", ex);
            mav.addObject("url", reqest.getRequestURL());
            mav.setViewName(UNAUTHORIZED_ERROR_VIEW);
            return mav;
        } else {
            mav.addObject("exception", ex);
            mav.addObject("url", reqest.getRequestURL());
            mav.setViewName(IMOOC_ERROR_VIEW);
            return mav;
        }
    }

    // 判断是否是ajax请求
    private static boolean isAjax(HttpServletRequest httpRequest){
        return  (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals( httpRequest.getHeader("X-Requested-With").toString()) );
    }
}

