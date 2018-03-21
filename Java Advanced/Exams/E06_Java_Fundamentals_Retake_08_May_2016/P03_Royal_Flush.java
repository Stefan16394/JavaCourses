package E06_Java_Fundamentals_Retake_08_May_2016;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Royal_Flush {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("s", new ArrayList<>());
        map.put("d", new ArrayList<>());
        map.put("h", new ArrayList<>());
        map.put("c", new ArrayList<>());
        String[] flush = {"10", "J", "Q", "K", "A"};
        StringBuilder cards = new StringBuilder();
        int counter = 0;
        int n = Integer.parseInt(sc.readLine());
        Pattern pattern = Pattern.compile("(?<num>2|3|4|5|6|7|8|9|10|J|Q|K|A)(?<suit>[cdhs])");

        for (int i = 0; i < n; i++) {
            cards.append(sc.readLine());

        }
        Matcher matcher = pattern.matcher(cards);
        while (matcher.find()) {
            String num = matcher.group("num");
            String suit = matcher.group("suit");
            if (map.get(suit).size() == 0) {
                if (num.equals("10")) {
                    List<String> list = new ArrayList<>();
                    list.add(num);
                    map.put(suit, list);
                }
            } else {
                int size = map.get(suit).size();
                if (num.equals(flush[size])) {
                    map.get(suit).add(num);
                } else {
                    map.put(suit, new ArrayList<>());
                    if(num.equals(flush[0]))
                    {
                        map.get(suit).add(num);
                    }
                }
            }
            if (map.get(suit).size() == 5) {
                counter++;
                switch (suit) {
                    case "s":
                        System.out.println("Royal Flush Found - Spades");
                        break;
                    case "d":
                        System.out.println("Royal Flush Found - Diamonds");
                        break;
                    case "c":
                        System.out.println("Royal Flush Found - Clubs");
                        break;
                    case "h":
                        System.out.println("Royal Flush Found - Hearts");
                        break;
                }
                map.put(suit, new ArrayList<>());
            }

        }
        System.out.printf("Royal's Royal Flushes - %d.",counter);

    }
}
