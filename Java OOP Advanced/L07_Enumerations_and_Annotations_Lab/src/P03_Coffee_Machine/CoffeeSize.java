package P03_Coffee_Machine;

public enum CoffeeSize {
    SMALL(50,50),NORMAL(100,75),DOUBLE(200,100);

    private double dossage;
    private double prize;

    CoffeeSize(double dossage, double prize) {
        this.dossage = dossage;
        this.prize = prize;
    }

    public double getDossage() {
        return dossage;
    }

    public double getPrize() {
        return prize;
    }
}
