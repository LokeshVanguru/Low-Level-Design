package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService()
    {
        this.emailService=new EmailService();
        this.smsService=new SMSService();
    }

    public void sendByEmail(String msg)
    {
        emailService.sendEmail(msg);
    }
    public void sendBySMS(String msg)
    {
        smsService.sendSMS(msg);
    }

}


//This High level Module Depend on Low level modules
//this violates dependency inversion principle
//Tight Coupling
//Less Flexible
//we want to add any new service ,
//     make changes in Notification service.