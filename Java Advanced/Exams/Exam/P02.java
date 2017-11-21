package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stones=new ArrayDeque<>();
        ArrayDeque<Integer> gold=new ArrayDeque<>();
        String[] stone=sc.readLine().split(" ");
        for (String x:stone)
        {
            stones.addLast(Integer.parseInt(x));
        }
        while (true)
        {
            String[] input=sc.readLine().split(" ");
            if(input[0].equals("Revision"))
            {
                break;
            }
            String command=input[0];
            int amount=Integer.parseInt(input[2]);
            if(command.equals("Apply")) {
                if (stones.size() > 0) {
                    for (int i = 0; i < amount; i++) {
                        try {
                            int getStone = stones.pollFirst() - 1;
                            if (getStone == 0) {
                                gold.addLast(getStone);
                            } else {
                                stones.addLast(getStone);
                            }
                        } catch (NullPointerException e) {
                            break;
                        }
                    }
                }
            }
            else if(command.equals("Air"))
            {
                if (gold.size()>0)
                {
                    int goldElement=gold.pollFirst()+amount;
                    stones.addLast(goldElement);
                }
            }
        }
        for (Integer x:stones)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(gold.size());
    }
}
