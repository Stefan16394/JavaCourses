package P00_Shapes_Drawing;

public class Rectangle implements Drawable{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i=0;i<height;i++)
        {
            System.out.print("* ");
            for (int j=0;j<width-2;j++)
            {
                if (i==0 || i==height-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("*");
            System.out.println();

        }
    }
}
