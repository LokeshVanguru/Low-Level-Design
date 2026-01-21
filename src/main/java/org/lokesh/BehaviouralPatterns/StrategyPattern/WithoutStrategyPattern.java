package org.lokesh.BehaviouralPatterns.StrategyPattern;

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        {
            PaymentService paymentService=new PaymentService();
            paymentService.processPayment("Credit Card");
            paymentService.processPayment("Debit Card");
        }
    }


}


class PaymentService
{
    public void processPayment(String paymentMethod)
    {
        if(paymentMethod.equals("Credit Card"))
        {
            System.out.println("Payment via Credit Card");
        }
        else if(paymentMethod.equals("Debit Card"))
        {
            System.out.println("Payment via Debit Card");
        }
        else {
            System.out.println("Unsupported PaymentMethod");
        }
    }
}


//this is a bad code
// for example we can add new paymentMethod we can modify the code
//it violates Open Closed Principle