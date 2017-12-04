package P13_Create_Custom_Class_Annotations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        WeaponManager m=new WeaponManager();
        while (true)
        {
            String[] input=sc.nextLine().split(";");
            if (input[0].equals("END"))
            {
                break;
            }
            switch (input[0]){
                case "Create":
                    m.create(WeaponEnum.valueOf(input[1]),input[2]);
                    break;

                case "Add":
                    m.add(input[1],Integer.valueOf(input[2]), Gems.valueOf(input[3]));
                    break;
                case "Remove":
                    m.remove(input[1],Integer.valueOf(input[2]));
                    break;
                case "Print":
                    m.print(input[1]);
                    break;
                case "Compare":
                    m.printCompare(input[1],input[2]);
                    break;
                case "Author":
                    m.anotationPrint(input[0]);
                    break;
                case "Revision":
                    m.anotationPrint(input[0]);
                    break;
                case "Description":
                    m.anotationPrint(input[0]);
                    break;
                case "Reviewers":
                    m.anotationPrint(input[0]);
                    break;
            }
        }

    }
}
