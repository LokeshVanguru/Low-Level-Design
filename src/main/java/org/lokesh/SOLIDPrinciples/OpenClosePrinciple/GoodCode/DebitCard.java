package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Payment via Debit card");
    }
}
