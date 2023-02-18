package cn.zengchen233;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Springboot07SwaggerApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("测试");
        message.setText("你好，世界");
        message.setTo("1239571995@qq.com");
        message.setFrom("noreply@zengchen233.cn");
        mailSender.send(message);
    }

}
