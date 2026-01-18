package org.lokesh.SOLIDPrinciples.SingleResponisbilityPrinciple.GoodCode;

public class InVoice {

    private int amount;

    InVoice(int amount)
    {
        this.amount=amount;
    }

    public void genarateInvoice()
    {
        System.out.println("Invoice genarated succesfully for amount"+amount);
    }
}
