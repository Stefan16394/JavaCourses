package P04_Company_Roster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        HashMap<String,Department> map=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            String name=input[0];
            double salary=Double.parseDouble(input[1]);
            String position=input[2];
            String department=input[3];
            String email="n/a";
            int age=-1;

            if (input.length==5)
            {
                try {
                    age=Integer.parseInt(input[4]);
                }
                catch (NumberFormatException e)
                {
                     email=input[4];
                }
            }
            else if(input.length==6)
            {
                 email=input[4];
                 age=Integer.parseInt(input[5]);
            }



            Employee employee=new Employee(name,salary,position,department,email,age);
            if (!map.containsKey(department))
            {
                List<Employee> list=new ArrayList<>();
                list.add(employee);
                Department department1=new Department(department,list);
                map.put(department,department1);
            }
            else
            {
                map.get(department).getList().add(employee);
            }

        }
        String largestTeam="";
        double largest=0;
        for (Map.Entry<String, Department> department:map.entrySet())
        {
            String departmen=department.getKey();
            double salary=0;
            for (Employee employees:department.getValue().getList())
            {
                salary+=employees.getSalary();
            }
            salary=salary/department.getValue().getList().size();
            if (salary>largest)
            {
                largest=salary;
                largestTeam=departmen;
            }
        }
       //Highest Average Salary: Development
      //  Ivan 840.20 ivan@ivan.com -1
       // Pesho 120.00 pesho@abv.bg 28
        System.out.println("Highest Average Salary: "+largestTeam);
        map.get(largestTeam).getList().sort((a,b)->Double.compare(b.getSalary(),a.getSalary()));
        map.get(largestTeam).getList().forEach(x->{
            System.out.printf("%s %.2f %s %d\n",x.getName(),x.getSalary(),x.getEmail(),x.getAge());
        });

    }
}
