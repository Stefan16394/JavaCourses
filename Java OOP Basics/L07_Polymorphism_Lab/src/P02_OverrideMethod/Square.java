package P02_OverrideMethod;

public class Square extends Rectangle {

    private double c;

    public Square(double a, double b) {
        super(a, b);
    }

    public Square(double a)
    {
        super(a,0);
    }

    @Override
    double area()
    {
        return this.getA()*this.getA();
    }
}
