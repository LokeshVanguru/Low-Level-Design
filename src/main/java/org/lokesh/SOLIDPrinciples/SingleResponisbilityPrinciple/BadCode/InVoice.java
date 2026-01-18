package org.lokesh.SOLIDPrinciples.SingleResponisbilityPrinciple.BadCode;

public class InVoice {

    private int amount;

    InVoice(int amount)
    {
        this.amount=amount;
    }

            //    other funcnalities
    public void genarateInVoice(int amount)
    {
        System.out.println("Invoice genarated sucessfully for amount"+amount);
    }

    public void saveTODatabase()
    {
        System.out.println("invoice saved to database succesfully");
    }

    public void sendNotifications()
    {
        System.out.println("sending notifications succesfully");
    }
}

//saveToDatabse and sendNotifications are violating srp principle.
