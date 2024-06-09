package org.gfg.notification;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {

    public SMSGateway() {
        System.out.println("SMSGateway constructor");
    }

    public void sendMessage(String message) {
        System.out.println(" I am printing message: "+ message);
    }
}
