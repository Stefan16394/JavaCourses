package E05;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        StringBuilder text=new StringBuilder();
        List<String> jedis=new ArrayList<>();
        List<String> messages=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           text.append(sc.readLine());
        }


        String namePattern = sc.readLine();
        String nameRegex = String.format("%s(?<name>[a-zA-Z]{%d}(?!([a-zA-Z])))", namePattern, namePattern.length());
        Pattern namePat = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePat.matcher(text.toString());

        String messagePattern = sc.readLine();
        String messageRegex = String.format("%s(?<message>[a-zA-Z0-9]{%d}(?![a-zA-Z0-9]))", messagePattern, messagePattern.length());
        Pattern messagePat = Pattern.compile(messageRegex);
        Matcher messageMatcher = messagePat.matcher(text.toString());
        List<Integer> digits= Arrays.stream(sc.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (nameMatcher.find()) {
            jedis.add(nameMatcher.group("name"));
        }

        while (messageMatcher.find()) {
            messages.add(messageMatcher.group("message"));
        }


        while (digits.size()>0 && jedis.size()>0) {

                int index = digits.get(0);
                String jeday = jedis.get(0);
                String mes = "";
                try {
                    mes = messages.get(index - 1);
                    System.out.println(jeday + " - " + mes);
                    jedis.remove(0);
                    digits.remove(0);
                }
                catch (IndexOutOfBoundsException e) {
                    digits.remove(0);
                }

            }
        }

    }
