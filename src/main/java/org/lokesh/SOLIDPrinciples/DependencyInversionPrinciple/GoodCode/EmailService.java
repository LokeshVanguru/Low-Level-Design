package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending email "+msg);
    }
}
