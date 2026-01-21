package org.lokesh.BehaviouralPatterns.StrategyPattern;

public class WithStrategyPattern {

    public static void main(String[] args) {
        PaymentServiceI psI=new PaymentServiceI();
        psI.setPaymentStrategy(new CreditCard());
        psI.processPayment();
    }

}

class PaymentServiceI
{
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy)
    {
        this.strategy=strategy;
    }

    public void processPayment()
    {
        strategy.pay();
    }
}


interface PaymentStrategy
{
    void pay();
}

class CreditCard implements PaymentStrategy
{

    @Override
    public void pay() {
        System.out.print("Payment Via Credit Card");
    }
}

class DebitCard implements PaymentStrategy
{

    @Override
    public void pay() {
        System.out.println("Payment Via Debit Card");
    }
}

class PayPal implements PaymentStrategy
{

    @Override
    public void pay() {
        System.out.println("Payment Via PayPal");
    }
}