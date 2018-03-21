package E01_Java_Advanced_Retake_Exam_03_May_2017;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.Collectors;

public class P01_Hand_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cards = new ArrayList<>();
        cards = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        int sum = 0;
        int startIndex = 0;
        List<Integer> list = new ArrayList<>();
        while (startIndex<cards.size()-1) {
            String firstCard = cards.get(startIndex);
            Integer firstPower = calculatePower(firstCard);
            String firstType = calculateType(firstCard);

            String secondCard = cards.get(startIndex + 1);
            Integer secondPower = calculatePower(secondCard);
            String secondType = calculateType(secondCard);

            if(list.size()==0) {
                list.add(firstPower);
            }
            if (firstType.equals(secondType)) {
                list.add(secondPower);
                if(startIndex==cards.size()-2)
                {
                    sum += list.stream().mapToInt(Integer::valueOf).sum() * list.size();

                }
            }
            else {
                if(startIndex==cards.size()-2)
                {
                    list.add(secondPower);
                    sum += list.stream().mapToInt(Integer::valueOf).sum();
                }
                else {
                    sum += list.stream().mapToInt(Integer::valueOf).sum() * list.size();
                    list = new ArrayList<>();
                }

            }
            startIndex++;
        }

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
