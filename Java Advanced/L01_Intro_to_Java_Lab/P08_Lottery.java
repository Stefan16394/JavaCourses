package L01_Intro_to_Java_Lab;

public class P08_Lottery {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            for(int j=i+1;j<=10;j++)
            {
                for (int c=j+1;c<=10;c++)
                {
                    System.out.printf("%d %d %d%n",i,j,c);
                }
            }
        }
    }
}
