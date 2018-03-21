package P03_Shapes;

import sun.security.provider.SHA;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Rectangle(12,3);
        Shape shape1=new Circle(3);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape1.calculateArea());
        System.out.println(shape1.calculatePerimeter());
    }
}
