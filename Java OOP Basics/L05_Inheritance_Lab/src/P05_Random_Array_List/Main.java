package P05_Random_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      RandomArrayList r=new RandomArrayList<>();
      r.add("Sda");
      r.add(123);
      r.add("Stamat");
      r.add("Animal");
        System.out.println(r.getRandomElement());
        System.out.println(r.getRandomElement());
        System.out.println(r.toString());

    }
}
