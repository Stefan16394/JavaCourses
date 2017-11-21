package P03_Ferrari;

public class Ferrari implements Car {
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String getModel() {
        return Car.MODEL;
    }

    @Override
    public String brake() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",Car.MODEL,this.brake(),this.gas(),this.driver);
    }
}
