package P03_Mediator;

import P03_Mediator.Skeleton.Attacker;
import P03_Mediator.Skeleton.Target;

public interface AttackGroup {
    void addMember(Attacker attacker);
    void groupTarget(Target target);
    void groupAttack();
}
