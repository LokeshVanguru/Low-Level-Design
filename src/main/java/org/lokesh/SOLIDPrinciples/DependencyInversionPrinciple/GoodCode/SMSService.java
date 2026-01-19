package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class SMSService implements NotificationChannel{

    @Override
    public void send(String msg) {
        System.out.println("Sending sms "+msg);
    }

}
