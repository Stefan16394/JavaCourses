package L02_Intro_To_Java_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P09_Byte_Party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            int num=Integer.parseInt(sc.nextLine());
            list.add(num);
        }
        while (true)
        {
            String[] command=sc.nextLine().split(" ");
            if(command[0].equals("party"))
            {
                break;
            }
            int bitCommand=Integer.parseInt(command[0]);
            int position=Integer.parseInt(command[1]);
            if(bitCommand==-1)
            {
               list=Flip(list,position);
            }
            else if(bitCommand==0)
            {
                list=Unset(list,position);
            }
            else if(bitCommand==1)
            {
                list=Set(list,position);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }

    public static List<Integer> Flip(List<Integer> list,int position)
    {
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);
            int mask=1<<position;
            int bit=num^mask;
            list2.add(bit);
        }
        return list2;
    }
    public static List<Integer> Unset(List<Integer> list,int position)
    {
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);
            int mask=~(1<<position);
            int bit=num&mask;
            list2.add(bit);
        }
        return list2;
    }

    public static List<Integer> Set(List<Integer> list,int position)
    {
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);
            int mask=1<<position;
            int bit=num|mask;
            list2.add(bit);
        }
        return list2;
    }
}