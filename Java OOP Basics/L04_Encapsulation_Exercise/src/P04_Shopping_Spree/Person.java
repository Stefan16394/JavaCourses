package P04_Shopping_Spree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    List<String> productList;

    public void setName(String name) {
        if (name==null ||name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else
        {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
       if (money<0)
       {
           throw new IllegalArgumentException("Money cannot be negative");
       }
       else
       {
           this.money=money;
       }
    }

    public void buyThis(double cost,String product)
    {   this.productList.add(product);
        this.money-=cost;
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.productList = new ArrayList<>();
    }

    @Override
    public String toString()
    {
        if (this.productList.size()==0)
        {
            return this.getName()+" - Nothing bought";
        }
        return this.getName()+" - "+String.join(", ",this.productList.stream().map(Object::toString).collect(Collectors.toList()));
    }
}
