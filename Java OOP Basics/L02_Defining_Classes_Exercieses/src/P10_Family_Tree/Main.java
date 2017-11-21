package P10_Family_Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> persons=new ArrayList<>();
        List<String> family=new ArrayList<>();
        String personx=sc.nextLine();
        while (true)
        {
            String input=sc.nextLine();
            if (input.equals("End"))
            {
                break;
            }
            if (input.contains(" - "))
            {
                family.add(input);
            }
            else
            {   String name=input.split(" ")[0]+" "+input.split(" ")[1];
                String birthday=input.split(" ")[2];
                Person person=new Person(name,birthday);
                persons.add(person);
            }
        }
        Person xy=  persons.stream().filter(x->x.getName().equals(personx)||x.getBirthday().equals(personx)).findFirst().get();
        Family family1=new Family();
        family1.setName(xy.getName());
        family1.setBirthday(xy.getBirthday());
        for (String fa:family)
        {
            String[] splited=fa.split(" - ");
            String parent=splited[0];
            String child=splited[1];
            if (parent.equals(xy.getName())||parent.equals(xy.getBirthday()))
            {
                Person childX= persons.stream().filter(x->x.getName().equals(child)||x.getBirthday().equals(child)).findFirst().get();
                family1.getChildren().add(childX);
            }
            else if (child.equals(xy.getName())||child.equals(xy.getBirthday()))
            {
                Person childX= persons.stream().filter(x->x.getName().equals(parent)||x.getBirthday().equals(parent)).findFirst().get();
                family1.getParents().add(childX);
            }
        }
        System.out.println(xy.getName()+" "+xy.getBirthday());
        System.out.println("Parents:");
        for (Person parent:family1.getParents())
        {
            System.out.println(parent.getName()+" "+parent.getBirthday());
        }
        System.out.println("Children:");
        for (Person child:family1.getChildren())
        {
            System.out.println(child.getName()+" "+child.getBirthday());
        }


    }
}
