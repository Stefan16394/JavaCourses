package L08_Data_Representation_and_Manipulation_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09_Phone_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        while (true)
        {
            String input = sc.nextLine();
            if (input.equals("END"))
            {
                break;
            }
            text.append(input);
        }        Pattern patern=Pattern.compile("(?<name>[A-Z][A-Za-z]*)(?<thrash>[^A-Za-z+0-9]*)(?<phone>[+]?[0-9][0-9(,)\\/.\\- ]*[0-9])");
        Matcher matcher=patern.matcher(text);
        LinkedHashSet<String> catalogue=new LinkedHashSet<>();
        while (matcher.find())
        {
            String name=matcher.group("name")+" ";
            String phone=matcher.group("phone").replaceAll("[\\(\\)\\/.\\- ]","");
            catalogue.add(name+phone);
        }
        if(catalogue.isEmpty())
        {
            System.out.println("<p>No matches!</p>");
        }
        else
        {
            System.out.print("<ol>");
            for (String phoneEntry:catalogue) {
                String[] entry=phoneEntry.split(" ");
                String name=entry[0];
                String phone=entry[1];
                System.out.printf("<li><b>%s:</b> %s</li>",name,phone);

            }
            System.out.print("</ol>");
        }

    }
}
