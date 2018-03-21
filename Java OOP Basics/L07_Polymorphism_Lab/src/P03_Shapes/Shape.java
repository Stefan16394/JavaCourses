package P03_Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public Shape() {

    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
}
