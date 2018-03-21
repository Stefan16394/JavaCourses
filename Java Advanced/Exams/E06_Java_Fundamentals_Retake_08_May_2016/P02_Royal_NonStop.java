package E06_Java_Fundamentals_Retake_08_May_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class P02_Royal_NonStop {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] dimensions = Arrays.stream(sc.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = dimensions[0];
        int m = dimensions[1];
        double[] prices = Arrays.stream(sc.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        int customers = 0;
        BigDecimal total = new BigDecimal(0);

        while (true) {
            String command = sc.readLine();
            if (command.equals("Royal Close")) {
                break;
            }
            int[] coordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int startRow = coordinates[0];
            int startCol = coordinates[1];

            if (startRow >= startCol) {

                for (int i=startCol;i>=0;i--)
                {
                    BigDecimal price=new BigDecimal(prices[startRow%2]);
                    BigDecimal row=new BigDecimal(startRow+1);
                    BigDecimal col=new BigDecimal(i+1);

                   total=total.add(price.multiply(row).multiply(col));
                }
                for (int i=startRow-1;i>0;i--)
                {
                    BigDecimal price=new BigDecimal(prices[i%2]);
                    BigDecimal row=new BigDecimal(i+1);
                    BigDecimal col=new BigDecimal(1);

                    total=total.add(price.multiply(row).multiply(col));
                }


            }
            else
            {


                for (int i=startRow;i>=0;i--)
                {
                    BigDecimal price=new BigDecimal(prices[i%2]);
                    BigDecimal row=new BigDecimal(i+1);
                    BigDecimal col=new BigDecimal(startCol+1);

                    total=total.add(price.multiply(row).multiply(col));

                }

                for (int i=startCol-1;i>0;i--)
                {
                    BigDecimal price=new BigDecimal(prices[0]);
                    BigDecimal row=new BigDecimal(1);
                    BigDecimal col=new BigDecimal(i+1);

                    total=total.add(price.multiply(row).multiply(col));
                }
            }

            customers++;

        }
        System.out.printf("%.6f\n", total);
        System.out.println(customers);
    }

}
