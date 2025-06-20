package com.suzuki.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmailSender {
    @Autowired
    JavaMailSender emailSender;


    public String otpGenerator(){
        Random random=new Random();
        int i = random.nextInt(999999);
        return String.format("%6d",i );
    }

    public String sendSimpleMessage(String email) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sujaykumar1302@gmail.com");
        message.setTo(email);
        message.setSubject("otp generation");
        String otp = otpGenerator();
        message.setText("Your otp is"+otp);
        emailSender.send(message);
        return otp;
    }
}
