package E01_Java_Advanced_Retake_Exam_03_May_2017;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Letter_Expresion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        Pattern pattern=Pattern.compile("(?<number>[0-9]+|[A-Za-z \\W]+)");
        Matcher matcher=pattern.matcher(text);
       StringBuilder ex=new StringBuilder();
        while (matcher.find())
        {

            try {
                Integer number=Integer.parseInt(matcher.group("number"));
               ex.append(number).append(" ");
            }
            catch (NumberFormatException e)
            {   String operator=matcher.group("number");
               if(operator.length()%2==0)
               {
                   ex.append("+").append(" ");
               }
               else
                   ex.append("-").append(" ");
            }

        }
        String[] s=ex.toString().split(" ");
        int sum=Integer.valueOf(s[0]);
        for(int i=1;i<s.length-1;i+=2)
        {
            String operator=s[i];
            Integer number=Integer.parseInt(s[i+1]);
            if(operator.equals("+"))
            {
                sum+=number;
            }
            else
                sum-=number;
        }
        System.out.println(sum);



    }
}
