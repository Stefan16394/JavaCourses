package L05_String_Processing_Lab;

import java.util.Scanner;

public class P03_Parse_Tags {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int firstIndex=1;
        int secondIndex=1;
        while (true)
        {
            firstIndex=text.indexOf("<upcase>");
            if(firstIndex==-1)
            {
                break;
            }
            secondIndex=text.indexOf("</upcase>");
            if(secondIndex==-1)
            {
                break;
            }
            String replacement=text.substring(firstIndex,secondIndex+9);
            String upperReplacement=replacement.toUpperCase();
            text=text.replace(replacement,upperReplacement).replace("<UPCASE>","").replace("</UPCASE>","");
        }
        System.out.println(text);

    }
}
