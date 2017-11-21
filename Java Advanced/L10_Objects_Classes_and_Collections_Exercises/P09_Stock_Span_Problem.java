package L10_Objects_Classes_and_Collections_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_Stock_Span_Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        int[] array=new int[n];
        StringBuilder print=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            array[i]=Integer.parseInt(sc.readLine());
        }
        print.append(1).append("\n");
        for(int i=1;i<n;i++)
        {
            int span=1;
            for(int j=i-1;j>=0 && array[i]>=array[j];j--)
            {
                span++;
            }
            print.append(span).append("\n");
        }
        System.out.println(print.toString());
    }

}
