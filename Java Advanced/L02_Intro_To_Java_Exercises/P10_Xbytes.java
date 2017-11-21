package L02_Intro_To_Java_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10_Xbytes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<8;i++)
        {
            int num=sc.nextInt();
            list.add(num);
        }
        int start=0;
        int matches=0;
        for(int x=0;x<6;x++)
        {
            for(int j=31;j>=2;j--)
            {
                int num1=list.get(start);
                int num2=list.get(start+1);
                int num3=list.get(start+2);
                int searchIndex=j;
                if(One(num1,searchIndex)&& (!One(num1, searchIndex - 1))&&(One(num1,searchIndex-2)))
                {
                    if((!One(num2, searchIndex)) && One(num2,searchIndex-1)&& (!One(num2, searchIndex-2)))
                    {
                        if(One(num3,searchIndex)&& (!One(num3, searchIndex - 1))&&(One(num3,searchIndex-2)))
                        {
                            matches++;
                        }
                    }
                }

            }
            start++;
        }

        System.out.println(matches);
    }

    public static boolean One(int num,int searchIndex)
    {
        int mask=1<<searchIndex;
        int result=mask&num;
        if(mask==result)
        {
            return true;
        }
        return false;
    }


}