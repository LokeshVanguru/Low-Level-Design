package org.lokesh.BehaviouralPatterns.ObserverPattern;

public class WithoutObserverPattern {

}


class Device
{
    public void showTemparature(float temp)
    {
        System.out.println("Current Temparature "+temp);
    }
}

class WeatherStation
{
    private float temparature;
    private Device device1;

    WeatherStation(Device d)
    {
        this.device1=d;
    }
    public void setTemparature(float temp)
    {
        temparature=temp;
        notifyDevice(temparature);
    }
    public void notifyDevice(float temparature)
    {
        device1.showTemparature(temparature);
    }
}