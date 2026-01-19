package org.lokesh.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel NS)
    {
        this.notificationChannel=NS;
    }

    public void sendNotification(String msg)
    {
        notificationChannel.send(msg);
    }
}


//Loose Coupling
//Notification Service not depending directly on small modules
//we can easily add new services without changeing NotificationService class
//Maintainable
//Easy for Testing
