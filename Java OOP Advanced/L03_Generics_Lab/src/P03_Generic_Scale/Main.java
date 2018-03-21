package P03_Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale=new Scale<>("a","b");
        Scale<Integer> scale2=new Scale<>(3,123);
        Scale<Double> scale3=new Scale<>(12.32,41.32);
        System.out.println(scale.getHeavier());
        System.out.println(scale2.getHeavier());
        System.out.println(scale3.getHeavier());

    }
}
