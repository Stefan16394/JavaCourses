package P10_MooD_3;

public class Demon extends Character implements IDemon {
    double energy;


    public Demon(String username, int level, double energy) {
        super(username, level);
        this.energy = energy;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public String setHashedPassword() {
        return String.valueOf(getUsername().length()*217);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s\n" +
                "%s\n",super.getUsername(),super.getHashedPassword(),"Demon",this.energy*super.getLevel());
    }
}
