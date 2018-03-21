package pr0304Barracks.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 30;
    private static final int GUNNER_DAMAGE = 15;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
