package L05_String_Processing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P07_Valid_Usernames_Compete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int invalidCounter=0;
        while (true)
        {
            String input=sc.nextLine();
            if(input.equals("END"))
            {
                break;
            }
            Pattern patern=Pattern.compile("^[\\w-_]{3,16}$");
            Matcher matcher= patern.matcher(input);
            String result="";
            if (matcher.find())
            {
                result="valid";
                list.add(result);
            }
            else
            {
                result="invalid";
                list.add(result);
            }

        }
        if(list.contains("valid"))
        {
            System.out.println(String.join("\n",list));
        }
    }
}
