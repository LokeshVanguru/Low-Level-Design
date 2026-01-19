package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService(new SMSService());
        notificationService.sendNotification("hello");
    }
}
