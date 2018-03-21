package E04_Java_Advanced_Exam_19_June_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class P04_Cubic_Assault {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,LinkedHashMap<String,Long>> meteors=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.readLine().split(" -> ");
            if(input[0].equals("Count em all"))
            {
                break;
            }
            String region=input[0];
            String meteorType=input[1];
            long quantity=Long.parseLong(input[2]);

            if(!meteors.containsKey(region))
            {
                LinkedHashMap<String,Long> map=new LinkedHashMap<>();
                map.put("Red",0L);
                map.put("Black",0L);
                map.put("Green",0L);
                meteors.put(region,map);

            }
            LinkedHashMap<String,Long> x=meteors.get(region);
            x.put(meteorType,meteors.get(region).get(meteorType)+quantity);
            meteors.put(region,x);
            LinkedHashMap<String,Long> map=meteors.get(region);

            long red=meteors.get(region).get("Red");
            long black=meteors.get(region).get("Black");
            long green=meteors.get(region).get("Green");



            long redFromGreen=green/1000000;
            green=green%1000000;

            red=red+redFromGreen;
            long blackFromRed=red/1000000;
            red=red%1000000;

            black=black+blackFromRed;

            map.put("Red",red);
            map.put("Black",black);
            map.put("Green",green);
            meteors.put(region,map);

        }
        meteors.entrySet().stream().sorted((a,b)->
        {
            long value1=a.getValue().get("Black");
            long value2=b.getValue().get("Black");
            if(value1!=value2)
            {
                return Long.compare(value2,value1);
            }
            else
            {
                int region1=a.getKey().length();
                int region2=b.getKey().length();
                if(region1!=region2)
                {
                    return Integer.compare(region1,region2);
                }
                return a.getKey().compareTo(b.getKey());

            }
        }).forEach(x->{
            System.out.println(x.getKey());
            x.getValue().entrySet().stream().sorted((a,b)->{
                long value1=a.getValue();
                long value2=b.getValue();
                if(value1!=value2)
                {
                    return Long.compare(value2,value1);
                }

                    return a.getKey().compareTo(b.getKey());


            }).forEach(y->{
                System.out.printf("-> %s : %d\n",y.getKey(),y.getValue());
            });
        });
    }
}
