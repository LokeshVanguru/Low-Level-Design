package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class PaymentService {

    public void paymentProcessor(PaymentMethod pm)
    {
        pm.pay();
    }
}
