package com.csjscm.mysqldata.service.impl;

import com.vici.response.MsgResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * 邮件发送
 *
 * @author csjscm
 * create 2018-05-25 下午 1:16
 **/
@Slf4j
@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${mail.fromMail.addr}")
    private String from;

    /**
     * 发送HTML邮件
     * @param to
     * @param subject
     * @param content
     */
   public void sendHtmlMail(String to,String subject,String content){
       MimeMessage message=mailSender.createMimeMessage();
       try {
           MimeMessageHelper helper=new MimeMessageHelper(message);
           helper.setFrom(from);
           helper.setTo(to);
           helper.setSubject(subject);
           helper.setText(content,true);
           mailSender.send(message);
           log.info("html邮件发送成功");
       }catch (MessagingException e){
           log.error("发送html邮件时发生异常！", e);
       }
   }
    /**
     * 发送HTML邮件
     * @param to
     * @param subject
     * @param content
     */
    public MsgResponse sendReturnHtmlMail(String to, String subject, String content){
        MimeMessage message=mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper=new MimeMessageHelper(message);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            mailSender.send(message);
            log.info("html邮件发送成功");
            return MsgResponse.success();
        }catch (MessagingException e){
            log.error("发送html邮件时发生异常！", e);
            return MsgResponse.fail();
        }
    }
    /**
     * 发送带附件邮件
     * 添加多个附件可以使用多条 helper.addAttachment(fileName, file)
     * @param to
     * @param subject
     * @param content
     * @param filePath
     */
    public void sendAttachmentsMail(String to, String subject, String content, String filePath){
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
            helper.addAttachment(fileName, file);
            mailSender.send(message);
            log.info("带附件的邮件已经发送。");
        } catch (MessagingException e) {
            log.error("发送带附件的邮件时发生异常！", e);
        }
    }

    /**
     * 发送带静态资源的邮件
     * @param to
     * @param subject
     * @param content
     * @param rscPath
     * @param rscId
     */
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId){
        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            FileSystemResource res = new FileSystemResource(new File(rscPath));
            helper.addInline(rscId, res);
            mailSender.send(message);
            log.info("嵌入静态资源的邮件已经发送。");
        } catch (MessagingException e) {
            log.error("发送嵌入静态资源的邮件时发生异常！", e);
        }
    }
}
