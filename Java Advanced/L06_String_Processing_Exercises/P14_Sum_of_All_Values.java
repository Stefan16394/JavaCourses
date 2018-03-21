package L06_String_Processing_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P14_Sum_of_All_Values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String key=sc.nextLine();
        String text=sc.nextLine();

        Pattern startKey=Pattern.compile("^[A-Za-z_]+(?=\\d)");
        Pattern endKey=Pattern.compile("(?<=\\d)[A-Za-z_]+$");

        Matcher matcher=startKey.matcher(key);
        Matcher matcher1=endKey.matcher(key);

        String firstKey="";
        String lastKey="";

        double sum=0.00;
        if(matcher.find())
        {
            firstKey=matcher.group();
        }
        if(matcher1.find())
        {
            lastKey=matcher1.group();
        }
        if(firstKey.equals("")||lastKey.equals(""))
        {
            System.out.println("<p>A key is missing</p>");
        }
        else
        {   String patern=firstKey+"([0-9]+[\\.]?[0-9]*[^\\.])"+lastKey;
            Pattern digit=Pattern.compile(patern);
            Matcher matcher2=digit.matcher(text);
            while(matcher2.find())
            {
                double number=Double.parseDouble(matcher2.group(1));
                sum+=number;
            }
            if (sum > 0) {
                if (sum % 1 == 0) {
                    System.out.printf("<p>The total value is: <em>%d</em></p>\n", (int) sum);
                    return;
                }
                System.out.printf("<p>The total value is: <em>%.2f</em></p>\n", sum);
            } else if (sum == 0) {
                System.out.println("<p>The total value is: <em>nothing</em></p>\n");
            }

        }

    }
}