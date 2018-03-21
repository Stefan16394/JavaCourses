package P02_Warning_Levels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Importance importance=Importance.valueOf(Importance.class,sc.nextLine());
        Logger l=new Logger();
        while (true)
        {
            String[] input=sc.nextLine().split(":");
            if (input[0].equals("END"))
            {
                break;
            }
            Message message=new Message(Importance.valueOf(Importance.class,input[0]),input[1].trim());
            l.addMessage(message,importance);
        }
        for (Message message:l.getMessages())
        {
            System.out.println(message.toString());
        }
    }
}
