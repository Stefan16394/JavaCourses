package E03_Java_Advanced_Retake_Exam_22_August_2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_NMS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder text=new StringBuilder();
        while (true)
        {
            String input=sc.nextLine();
            if(input.equals("---NMS SEND---"))
            {
                break;
            }
            text.append(input);
        }

        String delimeter=sc.nextLine();
        char firstLetter='a';
        List<String> stuff=new ArrayList<>();
        StringBuilder newStuff=new StringBuilder();
        boolean result=true;
        for(char letter:text.toString().toCharArray())
        {
            if((int)Character.toLowerCase(letter)>=(int)Character.toLowerCase(firstLetter))
            {
                newStuff.append(letter);
                result=true;
            }
            else
            {
                stuff.add(newStuff.toString());
                newStuff=new StringBuilder();
                newStuff.append(letter);
                result=false;
            }
            firstLetter=letter;
        }
        if(result)
        {
            stuff.add(newStuff.toString());
        }

        System.out.println(String.join(delimeter,stuff));
    }
}
