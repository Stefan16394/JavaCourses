package P03_Coffee_Machine;

public class Coffee {
    private CoffeeSize coffeeSize;
    private CoffeeType coffeeType;

    public Coffee(CoffeeSize coffeeSize, CoffeeType coffeeType) {
        this.coffeeSize = coffeeSize;
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        String coffeeSiz=coffeeSize.name().substring(1);
        coffeeSiz=coffeeSize.name().charAt(0)+coffeeSiz.toLowerCase();

        String coffeeTyp=coffeeType.name().substring(1);
        coffeeTyp=coffeeType.name().charAt(0)+coffeeTyp.toLowerCase();
        return coffeeSiz+" "+coffeeTyp;
    }
}
