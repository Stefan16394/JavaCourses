package P01_Jar_of_T;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("Some");
        jar.add("Hello");

        Jar<Integer> jar1 = new Jar<>();
        jar1.add(2);
        jar1.add(23);
        for (String jars : jar.getStuff()) {
            System.out.println(jars);
        }
        for (Integer jars : jar1.getStuff()) {
            System.out.println(jars);
        }
    }
}
