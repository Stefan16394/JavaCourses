package P02_OverrideMethod;

 class Rectangle {
    private double a;
    private double b;

     Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

     double area()
    {
        return a*b;
    }

     public double getA() {
         return a;
     }

     public double getB() {
         return b;
     }
 }
