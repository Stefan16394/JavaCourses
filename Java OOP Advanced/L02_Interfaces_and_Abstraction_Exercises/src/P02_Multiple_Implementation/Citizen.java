package P02_Multiple_Implementation;

class Citizen implements Birthable,Identifiable{
    private String name;
    private int age;
    private String id;
    private String birthdate;

     Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
