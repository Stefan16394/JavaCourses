package L14_Stream_API_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P11_Students_Joined_to_Specialties {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<StudentSpeciality> students=new ArrayList<>();
        List<StudentSpeciality> studentSpecialities=new ArrayList<>();
        while (true)
        {
            String[] line=sc.nextLine().split("\\s+");
            if("Students:".equalsIgnoreCase(line[0]))
            {
                break;
            }
            studentSpecialities.add(new StudentSpeciality(line[0]+" "+line[1],line[2]));
        }
        while (true)
        {
            String[] line=sc.nextLine().split("\\s+");
            if("END".equalsIgnoreCase(line[0]))
            {
                break;
            }
            students.add(new StudentSpeciality(line[1]+" "+line[2],line[0]));
        }
        List<String> results=new ArrayList<>();
        students.stream().sorted(Comparator.comparing(StudentSpeciality::getName))
                         .forEach(student-> {
                             studentSpecialities.stream().filter((spec) -> spec.getNumbers().equalsIgnoreCase(student.getNumbers()))
                                     .forEach(studentSpeciality -> {
                                         System.out.printf("%s %s %s\n", student.getName().trim(), student.getNumbers(), studentSpeciality.getName());
                                     });

                         });

                             }

    }



class StudentSpeciality{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    private String numbers;

    StudentSpeciality(String _name,String num){
        this.setName(_name);
        this.setNumbers(num);
    }
}