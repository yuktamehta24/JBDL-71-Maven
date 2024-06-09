package org.gfg.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
//
//    @Autowired
//    EmailGateway emailGateway;

//    @Autowired
    SMSGateway smsGateway;

    @Autowired
    public NotificationService(SMSGateway smsGateway) {
        System.out.println("Notification Service constructor");
        this.smsGateway = smsGateway;
    }

    @Autowired
    public void setSmsGateway(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    public void sendSMS(String message) {
        smsGateway.sendMessage(message);
    }
}
