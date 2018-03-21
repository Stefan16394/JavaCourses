package P03_Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

 class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String driver=sc.readLine();
        Ferrari ferrari=new Ferrari(driver);
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }
        else
        {
            System.out.println(ferrari.toString());
        }


    }
}
