package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class Paypal implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment via Paypal");
    }
}
