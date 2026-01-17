package org.lokesh.Basics.UML;
import java.util.*;

public class CompositionExample {
    public static void main(String[] args) {
        House h=new House();
        h.getRoom();
    }
}

class Room
{
    private String r_name;

    Room(String name)
    {
        this.r_name=name;
    }

    public String getName()
    {
        return r_name;
    }

}

class House
{
    private ArrayList<Room> rooms;

    House()
    {
       rooms=new ArrayList<>();
       rooms.add(new Room("bed room"));
       rooms.add(new Room("kitchen"));
    }

    public void getRoom()
    {
        System.out.println("rooms");
        for(Room r:rooms)
        {
           System.out.println(r.getName());
        }
    }
}
