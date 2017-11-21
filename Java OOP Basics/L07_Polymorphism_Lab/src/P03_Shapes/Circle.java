package P03_Shapes;

public  class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI*radius*radius;
    }
}
