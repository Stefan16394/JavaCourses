package E06_Java_Fundamentals_Retake_08_May_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04_Royal_Accounting {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        List<String> employees=new ArrayList<>();
        String stringPattern = "^([a-zA-Z]+)\\;(\\-?\\d+)\\;(\\-?\\d+\\.?\\d*)\\;([a-zA-Z]+)$";
        LinkedHashMap<String, LinkedHashMap<String, Double[]>> map = new LinkedHashMap<>();
        Pattern regexPattern = Pattern.compile(stringPattern);
        String inputLine = sc.readLine();

        while (!inputLine.equals("Pishi kuf i da si hodim")) {

            Matcher matcher = regexPattern.matcher(inputLine);

            if (matcher.find()) {

                String teamName = matcher.group(4);
                String employeeName = matcher.group(1);
                Double workHoursPerDay = Double.parseDouble(matcher.group(2));
                Double dailyPayment = Double.parseDouble(matcher.group(3));
                if(!employees.contains(employeeName))
                {
                if (!map.containsKey(teamName)) {
                    LinkedHashMap<String, Double[]> x = new LinkedHashMap<>();
                    Double[] c = {workHoursPerDay, dailyPayment};
                    x.put(employeeName, c);
                    map.put(teamName, x);
                } else {
                    LinkedHashMap<String, Double[]> x = map.get(teamName);
                    Double[] c = {workHoursPerDay, dailyPayment};
                    x.put(employeeName, c);
                    map.put(teamName, x);
                }

            }
            employees.add(employeeName);
            }
            inputLine = sc.readLine();
        }
        LinkedHashMap<String, LinkedHashMap<String, Double[]>> sortedEmployeeDatabase =  map.entrySet().stream().sorted((a,b)->{
            Double firstTeam=a.getValue().values().stream()
                    .collect(Collectors.summingDouble(employeeCredentials -> ((employeeCredentials[0].doubleValue() * employeeCredentials[1].doubleValue()) / 24) * 30));
            Double secondTeam=b.getValue().values().stream()
                    .collect(Collectors.summingDouble(employeeCredentials -> ((employeeCredentials[0].doubleValue() * employeeCredentials[1].doubleValue()) / 24) * 30));

            return secondTeam.compareTo(firstTeam);

        }).collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                )
        );

        for (Map.Entry<String, LinkedHashMap<String, Double[]>> team:sortedEmployeeDatabase.entrySet())
        {
            System.out.printf("Team - %s\n",team.getKey());
            team.getValue().entrySet().stream().sorted((a,b)->{
                Double workingA=a.getValue()[0];
                Double workingB=b.getValue()[0];
                int value=workingB.compareTo(workingA);
                if(value!=0)
                {
                    return workingB.compareTo(workingA);
                }

                Double paymentA=(a.getValue()[0]*a.getValue()[1])/24;
                Double paymentB=(b.getValue()[0]*b.getValue()[1])/24;
                value=paymentB.compareTo(paymentA);
                if(value!=0)
                {
                    return paymentB.compareTo(paymentA);
                }
                return a.getKey().compareTo(b.getKey());
            }).forEach(x->{
                System.out.printf("$$$%s - %.0f - %.6f\n",x.getKey(),x.getValue()[0],(x.getValue()[0]*x.getValue()[1])/24);
            });
        }
    }
}