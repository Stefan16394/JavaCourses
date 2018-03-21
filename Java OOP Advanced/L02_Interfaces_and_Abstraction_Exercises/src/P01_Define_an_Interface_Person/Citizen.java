package P01_Define_an_Interface_Person;

class Citizen implements Person{
    private String name;
    private int age;

     Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
