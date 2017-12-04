package P09_Trafic_Lights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        List<TraficLightsI> lightsList=new ArrayList<>();
        for (int i=0;i<input.length;i++)
        {
            lightsList.add(new TraficLightsI(TraficLights.valueOf(input[i])));
        }
        int n=Integer.valueOf(sc.nextLine());
        for (int i=0;i<n;i++)
        {
            for (TraficLightsI light:lightsList)
            {
                System.out.print(light.next()+" ");
            }
            System.out.println();
        }

    }
}
