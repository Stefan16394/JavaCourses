package E05;

import sun.security.krb5.internal.PAData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,List<String>>methods=new LinkedHashMap<>();
        int n=Integer.parseInt(sc.readLine());
        Pattern methodsPattern=Pattern.compile("static[\\sa-z]+(?<method>[A-Za-z]+)");
        Pattern calls= Pattern.compile("(?<call>[A-Z][a-zA-z\\s]+)\\(");
        String method="";
        for(int i=0;i<n;i++)
        {
            String input=sc.readLine();
            Matcher methodMatcher=methodsPattern.matcher(input);
            Matcher callMatcher=calls.matcher(input);

            while (methodMatcher.find())
            {
                 method=methodMatcher.group("method");
                if(!methods.containsKey(method))
                {
                    List<String> x=new ArrayList<>();
                    methods.put(method,x);
                }
                else
                {
                   methods.get(method).add(method);
                }
            }
            while (callMatcher.find())
            {
                String call=callMatcher.group("call");


            }

        }
        System.out.println();

    }
}
