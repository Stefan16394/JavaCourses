package Paw;

public abstract class Animal {
    private String name;
    private int age;
    private String cleansingStatus= "UNCLEANSED";
    private String originalCenter;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus() {
        this.cleansingStatus = "CLEANSED";
    }

    public String getOriginalCenter() {
        return originalCenter;
    }

    public void setOriginalCenter(String originalCenter) {
        this.originalCenter = originalCenter;
    }

    public String getName() {
        return name;
    }
}
