package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String text=sc.readLine();
        while (true)
        {
            String matchThis=sc.readLine();
            if (matchThis.length()!=0) {
                if (matchThis.equals("Print")) {
                    break;
                }

                    matchThis = matchThis.replace("%", "\\S*");

                if (matchThis.contains(".")) {
                    matchThis = matchThis.replace(".", "\\.");
                }
                Pattern pattern = Pattern.compile(matchThis);
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {

                    StringBuilder reversed = new StringBuilder(matcher.group()).reverse();
                    text = text.replaceAll(matcher.group(), reversed.toString());
                }
            }

        }
        System.out.println(text);
    }
}