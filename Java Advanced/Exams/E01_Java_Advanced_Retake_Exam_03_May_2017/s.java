package E01_Java_Advanced_Retake_Exam_03_May_2017;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.Collectors;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cards = new ArrayList<>();
        cards = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        ArrayDeque<String> check = new ArrayDeque<>();
        int sum = 0;
        check.addFirst(cards.get(0));

        for (int i = 1; i < cards.size(); i++) {
            String firstCard = check.pop();
            String firstType = calculateType(firstCard);

            String secondCard = cards.get(i);
            String secondType = calculateType(secondCard);

            if (firstType.equals(secondType)) {
                check.addLast(secondCard);
                check.addLast(firstCard);

            } else {
                check.addLast(firstCard);
                int mult=check.size();
                int initialSum=0;
                while (check.size()>0)
                {
                     firstCard = check.pop();
                     Integer firstPower = calculatePower(firstCard);
                     initialSum+=firstPower;

                }
                initialSum=initialSum*mult;
                sum+=initialSum;
                check.addLast(secondCard);;
            }

        }
        int mult=check.size();
        int initialSum=0;
        while (check.size()>0)
        {
           String firstCard = check.pop();
            Integer firstPower = calculatePower(firstCard);
            initialSum+=firstPower;

        }
        initialSum=initialSum*mult;
        sum+=initialSum;


        System.out.println(sum);
    }

    private static String calculateType(String card)
    {
        String firstType=String.valueOf(card.charAt(1));
        if(card.length()==3)
        {
            return firstType=String.valueOf(card.charAt(2));
        }

        return  firstType=String.valueOf(card.charAt(1));
    }

    private static Integer calculatePower(String card) {
        String firstPower= String.valueOf(card.charAt(0));

        if(card.length()==3)
        {
            firstPower="10";
        }
        else
        {
            switch (firstPower)
            {
                case "A":firstPower="15";break;
                case "K":firstPower="14";break;
                case "Q":firstPower="13";break;
                case "J":firstPower="12";break;
                default:break;
            }
        }
        return Integer.valueOf(firstPower);


    }
}
