package org.lokesh.Basics.OOPs;

public class Wallet implements PaymentMethod {

    private int walletId;
    Wallet(int id)
    {
        walletId=id;
    }

    public int getWalletId()
    {
        return walletId;
    }
    @Override
    public void pay() {
        System.out.println("Payment Via Wallet"+getWalletId());
    }
}
