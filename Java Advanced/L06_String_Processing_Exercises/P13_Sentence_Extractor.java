package L06_String_Processing_Exercises;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P13_Sentence_Extractor {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String word=sc.nextLine();
       String text=sc.nextLine();
       String patern=String.format("(?<=\\s|^)([^.!?]+\\b%s\\b[^.!?]+)([.!?])",word);
        Pattern paternCompiled=Pattern.compile(patern);
        Matcher matcher=paternCompiled.matcher(text);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }


        }
}