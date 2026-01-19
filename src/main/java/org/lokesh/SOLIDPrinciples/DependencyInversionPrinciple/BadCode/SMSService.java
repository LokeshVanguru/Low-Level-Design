package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

public class SMSService {

    public void sendSMS(String message)
    {
        System.out.println("Sending notification via SMS"+message);
    }

}
