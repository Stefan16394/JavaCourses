package L08_Data_Representation_and_Manipulation_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class P06_Overlaping_Intervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Double[] array=new Double[n];
        for(int i=0;i<n;i++)
        {   String s=sc.nextLine().replace(",",".");
            array[i]=Double.parseDouble(s);
        }
        Arrays.sort(array);
        System.out.println(s(array));
    }

    private static boolean s(Double[] array)
    {
        for(int i=0;i<array.length-1;i++)
        {
            String[] num=String.valueOf(array[i]).split("\\.");
            int first=Integer.parseInt(num[0]);
            int second=Integer.parseInt(num[1]);

            String[] num2=String.valueOf(array[i+1]).split("\\.");
            int third=Integer.parseInt(num2[0]);
            int fourth=Integer.parseInt(num2[1]);

            if((third>=first && third<=second))
            {
                 return true;
            }

        }
        return false;
    }

}
