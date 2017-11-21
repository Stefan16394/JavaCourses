package L05_String_Processing_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_Vowel_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine().toLowerCase();
        int counter=0;
        Pattern pattern=Pattern.compile("[aeiouy]");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find())
        {
            counter++;
        }
        System.out.println("Vowels: "+counter);
    }
}
