package L06_String_Processing_Exercises;

import java.util.Scanner;

public class P01_Count_Substring_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text =new StringBuilder(sc.nextLine().toLowerCase());
        String search = sc.nextLine().toLowerCase();
        int counter = 0;
        int index=text.indexOf(search);
        if(index==-1)
        {
            System.out.println(0);
        }
        else
        {   counter=1;
            while(true)
            {

                index=text.indexOf(search,index+1);
                if(index==-1)
                {
                    break;
                }

                counter++;

            }
        }


        System.out.println(counter);


    }
}
