package L06_String_Processing_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P15_Valid_Usernames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words=sc.nextLine();
        Pattern pattern=Pattern.compile("\\b[A-Za-z][A-Za-z0-9_]*\\b");
        Matcher matcher=pattern.matcher(words);
        List<String> list=new ArrayList<>();
        while (matcher.find())
        {  String match=matcher.group();
           if(match.length()>=3 && match.length()<=25)
           {
               list.add(matcher.group());

           }
        }
        int bigestSum=0;
        StringBuilder toPrint=new StringBuilder();
        for(int i=0;i<list.size()-1;i++)
        {
            int lenght=list.get(i).length()+list.get(i+1).length();
            if(lenght>bigestSum)
            {
                toPrint=new StringBuilder();
                toPrint.append(list.get(i));
                toPrint.append("\n");
                toPrint.append(list.get(i+1));
                bigestSum=lenght;
            }
        }
        System.out.println(toPrint.toString());
    }
}