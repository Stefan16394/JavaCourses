package P06_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            String animal=sc.nextLine();
            if (animal.equals("Beast!"))
            {
                break;
            }
            String[] stuff=sc.nextLine().split("\\s+");
            try {
                switch (animal)
                {
                    case "Cat":
                    Cat cat=new Cat(stuff[0],Integer.valueOf(stuff[1]),stuff[2]);
                        System.out.println(cat.toString());
                    break;
                    case "Dog":
                        Dog dog=new Dog(stuff[0],Integer.valueOf(stuff[1]),stuff[2]);
                        System.out.println(dog.toString());
                        break;
                    case "Frog":
                        Frog frog=new Frog(stuff[0],Integer.valueOf(stuff[1]),stuff[2]);
                        System.out.println(frog.toString());
                        break;
                    case "Kitten":
                        if (stuff[2].equals("Male"))
                        {
                            System.out.println("Invalid input!");
                            break;
                        }
                        Kitten kitten =new Kitten(stuff[0],Integer.valueOf(stuff[1]));
                        System.out.println(kitten.toString());
                        break;
                    case "Tomcat":
                        if (stuff[2].equals("Female"))
                        {
                            System.out.println("Invalid input!");
                            break;
                        }
                        Tomcat tomcat=new Tomcat(stuff[0],Integer.valueOf(stuff[1]));
                        System.out.println(tomcat.toString());
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
}
