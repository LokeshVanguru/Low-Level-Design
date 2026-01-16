package org.lokesh.Basics.OOPs;

abstract class Card implements PaymentMethod {

    private int cardNo;
    private String cardName;

    public Card(int cardNo,String cardName)
    {
        this.cardNo=cardNo;
        this.cardName=cardName;
    }

    public int getCardNo()
    {
        return cardNo;
    }

    public String getCardName()
    {
        return cardName;
    }

    public abstract void pay();
}
