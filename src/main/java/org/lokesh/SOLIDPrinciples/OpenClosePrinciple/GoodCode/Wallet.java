package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class Wallet implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment via Wallet");
    }
}
