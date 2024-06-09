package org.gfg.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("org.gfg.notification");
//
//        SMSGateway gateway = (SMSGateway)
//                applicationContext.getBean("sMSGateway");
//
//        System.out.println("gateway is :" + gateway);

        NotificationService service = (NotificationService)
                applicationContext.getBean("notificationService");

        service.sendSMS("This is my message");

    }
}
