package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("payment via Credit Card");
    }
}
