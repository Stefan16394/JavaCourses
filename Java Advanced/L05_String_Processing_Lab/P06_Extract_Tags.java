package L05_String_Processing_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_Extract_Tags {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            String input=sc.nextLine();
            if(input.equals("END"))
            {
                break;
            }
            Pattern patern=Pattern.compile("<.+?>");
            Matcher matcher= patern.matcher(input);
            while (matcher.find())
            {
                System.out.println(matcher.group());
            }
        }
    }
}
