package E04_Java_Advanced_Exam_19_June_2016;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Cubics_Messages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder message=new StringBuilder();
        Pattern pattern=Pattern.compile("^(?<numbers1>[0-9]+)(?<letters>[A-Za-z]+)(?<numbers2>[^A-Za-z]*)$");
        while (true)
        {
            String encryptedMessage=sc.nextLine();
            if(encryptedMessage.equals("Over!"))
            {
                break;
            }
            int length=Integer.parseInt(sc.nextLine());
            Matcher matcher=pattern.matcher(encryptedMessage);
            if(matcher.find())
            {
                if(matcher.group("letters").length()==length)
                {
                  StringBuilder encrypt=new StringBuilder();
                  String letters=matcher.group("letters");
                  String numbers=matcher.group("numbers1")+matcher.group("numbers2");
                    Predicate<Integer> validIndex=x->x>=0 && x<=letters.length()-1;
                  for(char x:numbers.toCharArray())
                  {
                      int index=x-'0';
                      if(validIndex.test(index))
                      {
                          encrypt.append(letters.charAt(index));
                      }
                      else
                      {
                          encrypt.append(" ");
                      }
                  }
                  message.append(String.format("%s == %s\n",letters,encrypt.toString()));
                }


            }

        }
        System.out.println(message);
    }
}
