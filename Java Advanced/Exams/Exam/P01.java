package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] in=sc.readLine().split(", ");
        int[] input=new int[in.length];
        int counter=0;
        for (String x:in)
        {
            input[counter]=Integer.valueOf(x);
            counter++;
        }

        for (int i = 0; i <= 15; i++) {
            boolean movedBit=true;

            while (movedBit) {
                movedBit=false;
                for (int j = input.length - 1; j >= 1; j--) {

                    int last = input[j];
                    int last2 = input[j - 1];
                    int bit1 = (last >> i) & 1;
                    int bit2 = (last2 >> i) & 1;
                    if (bit1 == 0 && bit2 == 1) {
                        last = last | 1 << i;
                        last2 = last2 ^ 1 << i;
                        input[j] = last;
                        input[j - 1] = last2;
                        movedBit=true;
                    }

                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        System.out.println(sb);

    }
}

