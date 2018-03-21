package L14_Stream_API_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P13_Little_John {
    private static String small=">----->";
    private static String medium=">>----->";
    private static String large=">>>----->>";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> arrows=new LinkedHashMap<>();
        arrows.put(">----->",0);
        arrows.put(">>----->",0);
        arrows.put(">>>----->>",0);
        for(int i=0;i<4;i++)
        {
         String input=sc.nextLine();
         checkArrow(input,arrows);
        }
        String number=String.valueOf(arrows.get(">----->"))+String.valueOf(arrows.get(">>----->")
                +String.valueOf(arrows.get(">>>----->>")));
        int numDecimal=Integer.parseInt(number);
        String initialBinary=Integer.toBinaryString(numDecimal);
        String reversedBinary=new StringBuilder(initialBinary).reverse().toString();
        String finalBinary=initialBinary+reversedBinary;
        int finalNumber=Integer.parseInt(finalBinary,2);
        System.out.println(finalNumber);


        System.out.println();
    }

    private static void checkArrow(String input, LinkedHashMap<String,Integer> arrows) {
        StringBuilder input1=new StringBuilder(input);
        int index=0;
        while(index!=-1 && input1.length()>6)
        {
            index=input1.indexOf(large);
            if(index!=-1)
            {
               input1.delete(index,index+11);
                arrows.put(large,arrows.get(large)+1);
            }
            if(index==-1)
            {
                index=input1.indexOf(medium);
                if(index!=-1)
                {
                    input1=input1.delete(index,index+9);
                    arrows.put(medium,arrows.get(medium)+1);
                }
                else
                {
                    index=input1.indexOf(small);
                    if(index!=-1)
                    {
                        input1=input1.delete(index,index+8);
                        arrows.put(small,arrows.get(small)+1);
                    }
                    else
                        index=-1;
                }
            }


        }
    }


}
