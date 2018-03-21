package L09_Objects_Classes_and_Collections_Lab;

import java.util.*;

public class P06_Academy_Graduation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<String,List<Double>> students=new TreeMap<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            double[] grades= Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            List<Double> gradeList=new ArrayList<>();
            for(int j=0;j<grades.length;j++)
            {
                gradeList.add(grades[j]);
            }
            students.put(name,gradeList);
        }
        for (String student:students.keySet()) {
            double average=0;
            for (Double grade:students.get(student)) {
                average+=grade;
            }
            average=average/students.get(student).size();
            System.out.printf("%s is graduated with %s\n",student,average);
        }
    }
}
