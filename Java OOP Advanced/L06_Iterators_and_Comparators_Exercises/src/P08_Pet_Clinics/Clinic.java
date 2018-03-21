package P08_Pet_Clinics;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private int rooms;
    List<Object> pets;

    public Clinic(String name, int rooms) {
        this.name = name;
        setRooms(rooms);
        this.pets=new ArrayList<>();
        this.setPets();
    }

    public void setRooms(int rooms) {
        if (rooms%2==0 || rooms<1 || rooms>101)
        {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms=rooms;
    }

    public void setPets() {
       for (int i=0;i<rooms;i++)
       {
           pets.add("null");
       }
    }

    public boolean addPet(Pet pet)
    {   int startRoom=rooms/2;
        if (pets.get(startRoom)=="null")
        {
            pets.set(startRoom,pet);
            return true;
        }
        for (int i=1;i<=rooms/2;i++)
        {
            if (pets.get(startRoom-i)=="null")
            {
                pets.set(startRoom-i,pet);
                return true;
            }
            if (pets.get(startRoom+i)=="null")
            {
                pets.set(startRoom+i,pet);
                return true;
            }
        }
        return false;
    }

    public boolean release()
    {
        int startRoom=rooms/2;
        if (pets.get(startRoom)!="null")
        {
            pets.set(startRoom,"null");
            return true;
        }
        for (int i=1;i<=rooms/2;i++)
        {
            if (pets.get(startRoom-i)!="null")
            {
                pets.set(startRoom-i,"null");
                return true;
            }
            if (pets.get(startRoom+i)=="null")
            {
                pets.set(startRoom+i,"null");
                return true;
            }
        }
        return false;
    }

    public boolean hasEmptyRooms()
    {
        return pets.contains("null");
    }



    public void printRooms()
    {
        int startRoom=rooms/2;
        if (pets.get(startRoom)=="null")
        {
            System.out.println("Room empty");
        }
        else {
            System.out.println(pets.get(startRoom).toString());
        }
        for (int i=1;i<=rooms/2;i++)
        {
            if (pets.get(startRoom-i)!="null")
            {
                System.out.println(pets.get(startRoom-i).toString());
            }
            else
            {
                System.out.println("Room empty");
            }
            if (pets.get(startRoom+i)!="null")
            {
                System.out.println(pets.get(startRoom+i).toString());
            }
            else
            {
                System.out.println("Room empty");
            }
        }
    }
    public void printRoom(int num)
    {
        if (pets.get(num-1)=="null")
        {
            System.out.println("Room empty");
        }
        else
        {
            System.out.println(pets.get(num-1).toString());;
        }
    }
}
