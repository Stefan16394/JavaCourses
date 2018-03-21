package P01_Define_a_Class_Person;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Person perso=new Person();
        perso.setName("Pesho");
        perso.setAge(24);
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }

}
