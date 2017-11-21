package P06_Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.isEmpty())
        {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name=name;
    }

    public void setAge(int age) {
        if (age<0)
        {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age=age;
    }

    public void setGender(String gender) {
        if (gender.isEmpty())
        {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    boolean isValid(String something)
    {
        return something.trim().length()==0;
    }


    public String produceSound()
    {
        return "Not implemented!";
    }

    @Override
    public String toString()
    {
        return String.format("%s\n" +
                "%s %d %s\n" +
                "%s",getClass().getSimpleName(),getName(),getAge(),getGender(),produceSound());
    }
}
