package P09_Google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private Company company;
    private List<Pokemon> pokemons=new ArrayList<>();
    private List<Parents> parents=new ArrayList<>();
    private List<Children> children=new ArrayList<>();
    private Car car;

    public Company getCompany() {
        return company;
    }

    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(pokemons);
    }

    public List<Parents> getParents() {
        return Collections.unmodifiableList(parents);
    }

    public List<Children> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Car getCar() {
        return car;
    }

    private class Company{
        private String name;
        private String department;
        private double salary;

        public Company(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

    }

    private class Pokemon{
        private String name;
        private String type;

        public Pokemon(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    private class Parents{
        private String name;
        private String birthday;

        public Parents(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }
    }

    private class Children{
        private String name;
        private String birthday;

        public Children(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }
    }

    private class Car{
        private String model;
        private String speed;

        public Car(String model, String speed) {
            this.model = model;
            this.speed = speed;
        }
    }

    public void createCompany(String name,String department,double salary)
    {
        Company company=new Company(name,department,salary);
        this.company=company;
    }

    public void createPokemon(String name,String type)
    {
        Pokemon pokemon=new Pokemon(name,type);
        this.pokemons.add(pokemon);
    }

    public void createParent(String name,String birthday)
    {
        Parents parent=new Parents(name,birthday);
        this.parents.add(parent);
    }

    public void createChildren(String name,String birthday)
    {
        Children child=new Children(name,birthday);
        this.children.add(child);
    }

    public void createCar(String model,String speed)
    {
        Car car=new Car(model,speed);
        this.car=car;
    }

    public void printResults()
    {
        System.out.println("Company:");
        if (company!=null) {
            System.out.printf("%s %s %.2f\n", company.name, company.department, company.salary);
        }

        System.out.println("Car:");
        if (car!=null)
        {
            System.out.printf("%s %s\n",car.model,car.speed);
        }
        System.out.println("Pokemon:");
        if (pokemons.size()!=0)
        {
            for (Pokemon pokemon:pokemons)
            {
                System.out.println(pokemon.name+" "+pokemon.type);
            }
        }
        else
            System.out.println();
        System.out.println("Parents:");
        if (parents.size()!=0)
        {
            for (Parents parent:parents)
            {
                System.out.println(parent.name+" "+parent.birthday);
            }
        }

        System.out.println("Children:");
        if (children.size()!=0)
        {
            for (Children child:children)
            {
                System.out.println(child.name+" "+child.birthday);
            }
        }

    }


}
