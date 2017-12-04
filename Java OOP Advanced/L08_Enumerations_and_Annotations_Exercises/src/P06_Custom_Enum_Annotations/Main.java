package P06_Custom_Enum_Annotations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Class<?> clas=null;
        Anotation a=null;
        switch (input)
        {
            case "Rank":
                clas=RankPowers.class;
                a=clas.getAnnotation(Anotation.class);
                break;
            case "Suit":
                clas=SuitPowers.class;
                a=clas.getAnnotation(Anotation.class);
               break;
                default:
                    return;
        }
        System.out.printf("Type = %s, Description = %s\n",a.Type(),a.Description());

    }
}
