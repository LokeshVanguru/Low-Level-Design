package org.lokesh.Basics.OOPs;

public class Client {
    public static void main(String []args)
    {
        PaymentService paymentService=new PaymentService();

        paymentService.addPaymentMethod("lokeshcreditcard",new CreditCard(123456,"lokeshcreditcard"));
        paymentService.addPaymentMethod("lokeshdebitcard",new DebitCard(123456,"lokeshdebitcard"));
        paymentService.addPaymentMethod("lokeshupi",new UPI(123456));
        paymentService.addPaymentMethod("lokeshwallet",new Wallet(12345689));
        paymentService.makePayment("lokeshcreditcard");
        paymentService.makePayment("lokeshdebitcard");
        paymentService.makePayment("lokeshupi");
        paymentService.makePayment("lokeshwallet");

    }
}
