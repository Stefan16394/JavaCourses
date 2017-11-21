package L06_String_Processing_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P12_Extract_Emails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String emails=sc.nextLine();
        Pattern pattern = Pattern.compile("((?<=\\s)|^)([a-z0-9][a-z0-9\\-._]*[a-z0-9])@([a-z0-9][a-z0-9\\-]*[a-z0-9]\\.)+[a-z0-9]+");
        Matcher matcher=pattern.matcher(emails);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}