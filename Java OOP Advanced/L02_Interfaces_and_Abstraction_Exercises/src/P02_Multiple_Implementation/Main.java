package P02_Multiple_Implementation;

import com.sun.corba.se.spi.ior.Identifiable;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(P02_Multiple_Implementation.Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            methods = P02_Multiple_Implementation.Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            P02_Multiple_Implementation.Identifiable identifiable = new Citizen(name,age,id,birthdate);
            Birthable birthable = new Citizen(name,age,id,birthdate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
        }
    }

}
