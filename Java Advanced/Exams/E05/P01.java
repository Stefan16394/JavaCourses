/*
package E05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

public class P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> jedisM = new ArrayDeque<>();
        ArrayDeque<String> jedisK = new ArrayDeque<>();
        ArrayDeque<String> jedisP = new ArrayDeque<>();
        ArrayDeque<String> jedisST = new ArrayDeque<>();

        int n = Integer.parseInt(sc.readLine());
        boolean yodaPresent = false;
        for (int i = 0; i < n; i++) {
            String[] line = sc.readLine().split(" ");
            for (String x : line) {
                switch (x.charAt(0)) {
                    case 'm':
                        jedisM.offerLast(x);
                        break;
                    case 'k':
                        jedisK.offerLast(x);
                        break;
                    case 'p':
                        jedisP.offerLast(x);
                        break;
                    case 'y':
                        yodaPresent = true;
                        break;
                    default:
                        jedisST.offerLast(x);
                }
            }
        }
        StringBuilder print=new StringBuilder();
        if(yodaPresent)
        {
            print(jedisM,print);
            print(jedisK,print);
            print(jedisST,print);
            print(jedisP,print);
            System.out.println(print);
            return;
        }
        print(jedisST,print);
        print(jedisM,print);
        print(jedisK,print);
        print(jedisP,print);
        System.out.println(print);


    }
    private static void print(ArrayDeque<String> jedis,StringBuilder print)
    {
        int size=jedis.size();
        for(int i=0;i<size;i++)
        {
           print.append(jedis.pollFirst()).append(" ");
        }
    }


}

*/
package E05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> jedis=new ArrayDeque<>();
        int n=Integer.parseInt(sc.readLine());
        for (int i=0;i<n;i++)
        {
            String[] line=sc.readLine().split(" ");
            for(String x:line)
            {
                jedis.offer(x);
            }
        }

        int size=jedis.size();
        boolean yoda= yodaPresent(jedis);
        if(!yoda)
        {   searchSlav(jedis,'s');
            search(jedis,'m');
            search(jedis,'k');
            search(jedis,'p');
            return;
        }
        search(jedis,'m');
        search(jedis,'k');
        searchSlav(jedis,'s');
        search(jedis,'p');

    }
    private static boolean yodaPresent(ArrayDeque<String> jedis)
    {
        int size=jedis.size();
        boolean result=false;
        while (size>0)
        {
            String element=jedis.pollFirst();
            if(element.charAt(0)=='y')
            {
                result=true;
            }
            else {
                jedis.offerLast(element);
            }
            size--;

        }
        return result;
    }

    private static void search(ArrayDeque<String> jedis,char s)
    {
        int size=jedis.size();
        while (size>0)
        {
            String element=jedis.pollFirst();
            if(element.charAt(0)==s)
            {
                System.out.print(element+" ");
            }
            else {
                jedis.offerLast(element);
            }
            size--;

        }
    }
    private static void searchSlav(ArrayDeque<String> jedis,char s)
    {
        int size=jedis.size();
        while (size>0)
        {
            String element=jedis.pollFirst();
            if(element.charAt(0)=='s' || element.charAt(0)=='t')
            {
                System.out.print(element+" ");
            }
            else {
                jedis.offerLast(element);
            }
            size--;

        }
    }

}

