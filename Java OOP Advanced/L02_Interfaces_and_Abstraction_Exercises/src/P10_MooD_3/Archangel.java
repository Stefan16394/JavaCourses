package P10_MooD_3;

public class Archangel extends Character implements IArchangel {
    private int mana;

    public Archangel(String username, int level, int mana) {
        super(username, level);
        this.mana = mana;
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public String setHashedPassword() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.getUsername());
        sb.reverse();
        sb.append(super.getUsername().length()*21);
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s\n" +
                "%d\n",super.getUsername(),super.getHashedPassword(),"Archangel",this.mana*super.getLevel());
    }
}
