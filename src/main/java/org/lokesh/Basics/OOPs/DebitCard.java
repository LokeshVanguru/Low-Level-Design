package org.lokesh.Basics.OOPs;

public class DebitCard extends Card{

    DebitCard(int cardNo, String cardName) {
        super(cardNo, cardName);
    }

    @Override
   public  void pay() {
        System.out.println("Paymeny Via Debit Card"+getCardNo());

    }

}
