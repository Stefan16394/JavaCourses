package E02_Java_Fundamentals_Exam_19_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern=Pattern.compile("(?<symbol>[,_])(?<letters>[A-Za-z]+)(?<digit>[\\d])");
        LinkedHashMap<String,String> encoded=new LinkedHashMap<>();
        while (true)
        {
            String text=sc.readLine();
            if(text.equals("Ascend"))
            {
                break;
            }
            for(String s:encoded.keySet())
            {
                text=text.replaceAll(s,encoded.get(s));
            }
            Matcher match=pattern.matcher(text);
            while (match.find())
            {
                String sign=match.group("symbol");
                String letters=match.group("letters");
                Integer digit=Integer.parseInt(match.group("digit"));
                String matchedWord=sign+letters+String.valueOf(digit);

                StringBuilder endodedMessage=new StringBuilder();

                if(sign.equals(","))
                {
                    for (char letter:letters.toCharArray())
                    {
                        char x=(char)(letter+digit);
                        endodedMessage.append(x);
                    }
                }
                else if(sign.equals("_"))
                {
                    for (char letter:letters.toCharArray())
                    {
                        char x=(char)(letter-digit);
                        endodedMessage.append(x);
                    }
                }

                text= text.replace(matchedWord,endodedMessage.toString());
                encoded.put(matchedWord,endodedMessage.toString());
            }
            System.out.println(text);
        }
    }
}
