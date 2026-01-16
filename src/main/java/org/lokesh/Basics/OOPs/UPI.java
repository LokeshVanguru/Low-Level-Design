package org.lokesh.Basics.OOPs;

public class UPI implements PaymentMethod{
    private int upiID;

    UPI(int id)
    {
        upiID=id;
    }
    public int getUPIid()
    {
        return upiID;
    }


    @Override
    public void pay() {
        System.out.println("payment Via UPi"+getUPIid());
    }
}
