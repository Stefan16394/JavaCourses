package L05_String_Processing_Lab;

import java.util.Scanner;

public class P02_Parse_URL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String URL=sc.nextLine();
        String[] protocol=URL.split("://");
        if(protocol.length!=2)
        {
            System.out.println("Invalid URL");
        }
        else
        {
            int index=protocol[1].indexOf("/");
            if(index==-1)
            {
                System.out.println("Invalid URL");
            }
            else
            {
                String server=protocol[1].substring(0,index);
                String resourse=protocol[1].substring(server.length()+1,protocol[1].length());
                System.out.printf("Protocol = %s\n" + "Server = %s\n" + "Resources = %s ",
                        protocol[0],server,resourse);
            }
        }
    }
}
