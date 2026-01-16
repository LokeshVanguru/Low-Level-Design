package org.lokesh.Basics.OOPs;

public class CreditCard extends Card{

    CreditCard(int cardNo, String cardName) {
        super(cardNo, cardName);
    }

    @Override
    public void pay() {
        System.out.println("Payment Via Credit Card"+getCardNo());
    }

}
