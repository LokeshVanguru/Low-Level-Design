package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        PaymentService ps=new PaymentService();
        ps.paymentProcessor(new CreditCard());
        ps.paymentProcessor(new DebitCard());
    }
}
