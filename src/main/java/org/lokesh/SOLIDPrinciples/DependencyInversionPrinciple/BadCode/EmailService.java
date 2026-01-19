package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

public class EmailService {

    public void sendEmail(String message)
    {
        System.out.println("Sending notification via Email"+message);
    }

}
