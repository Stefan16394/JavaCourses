package P11_Cat_Lady;

public class Siamese extends Cat {

    private double earSize;

    public Siamese(String name, double earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString()
    {
        return String.format("Siamese %s %.2f\n",super.getName(),this.earSize);
    }
}
