package P10_Inferno_Infinity;

public enum  WeaponEnum {

    AXE(5,10,4), SWORD(4,6,3),KNIFE(3,4,2);

    private int minDamage;
    private int maxDamage;
    private Gems[] sockets;

    WeaponEnum(int minDamage, int maxDamage, int n) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.sockets = new Gems[n];
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public Gems[] getSockets() {
        return sockets;
    }
}
