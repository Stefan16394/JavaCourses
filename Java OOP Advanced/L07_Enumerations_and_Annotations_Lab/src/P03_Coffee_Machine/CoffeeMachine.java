package P03_Coffee_Machine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private int currentCoints;
    private List<Coffee> coffees;

    public CoffeeMachine() {
        this.currentCoints=0;
        this.coffees=new ArrayList<>();
    }

    public void clearCoins()
    {
        this.currentCoints=0;
    }

    public void insertCoin(String value) {
        this.currentCoints += Coin.valueOf(value).getValue();
    }

    public void buyCoffee(String coffeeSize,String coffeeType)
    {
        double prize=CoffeeSize.valueOf(coffeeSize).getPrize();
        if (currentCoints>=prize)
        {
            this.coffees.add(new Coffee(CoffeeSize.valueOf(coffeeSize),CoffeeType.valueOf(coffeeType)));
            clearCoins();
        }

    }

    public Iterable<Coffee> coffeesSold()
    {
        return this.coffees;
    }
}
