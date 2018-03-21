package P04_Fragile_Base_Class;

public class Main {
    public static void main(String[] args) {
        Predator p=new Predator();
        p.feed(new Food());
        Food[] list={new Food(),new Food(),new Food()};
        for (int i=0;i<list.length;i++)
        {
            p.feed(list[i]);
        }
        System.out.println(p.getHealth());;
    }
}
