package org.lokesh.SOLIDPrinciples.OpenClosePrinciple.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod,int amount)
    {
        if(paymentMethod.equals("CreditCard"))
        {
            System.out.println("payment via Credit Card");
        }
        else if(paymentMethod.equals("DebitCard"))
        {
            System.out.println("Payment via Debit Card");
        }
        else if(paymentMethod.equals("Paypal"))
        {
            System.out.println("Payment via Paypal");
        }
        else{
            System.out.println("unsupported payment method");
        }
    }
}


// we can add any paymentMethod after testing complete.
//we can modify the existing code
// it violates open closed principle.