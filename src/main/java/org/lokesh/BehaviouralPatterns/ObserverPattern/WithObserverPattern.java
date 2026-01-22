package org.lokesh.BehaviouralPatterns.ObserverPattern;

import java.util.*;

public class WithObserverPattern {
    public static void main(String[] args) {
        WeatherStationIn weatherStationIn=new WeatherStationIn();
        Observer obs1=new Observer1();
        Observer obs2=new Observer2();
        weatherStationIn.attach(obs1);
        weatherStationIn.attach(obs2);
        weatherStationIn.setTemparature(25);

        weatherStationIn.detach(obs1);

        weatherStationIn.setTemparature(35);
    }
}


//Subject interface
interface Subject{

    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObserver();
}

//WeatherStationIn
class WeatherStationIn implements Subject{

    private float temparature;
    private List<Observer> observer;

    public WeatherStationIn()
    {
        this.observer=new ArrayList<>();
    }

    public void setTemparature(float temp)
    {
        this.temparature=temp;
        notifyObserver();
    }

    @Override
    public void attach(Observer obs) {
        observer.add(obs);
    }

    @Override
    public void detach(Observer obs) {
       observer.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs:observer)
        {
            obs.update(temparature);
        }
    }
}

//Observer Interface
interface Observer{

    void update(float temp);
}

//Observer classes

class Observer1 implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("observer 1 :"+temp);
    }
}

class Observer2 implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("observer 2 :"+temp);
    }
}
