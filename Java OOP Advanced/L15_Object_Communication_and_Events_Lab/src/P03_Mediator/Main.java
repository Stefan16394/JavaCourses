package P03_Mediator;

import P03_Mediator.Skeleton.Dragon;
import P03_Mediator.Skeleton.Warrior;

public class Main {
    public static void main(String[] args) {
        AttackGroup group=new Group();
        group.addMember(new Warrior("Pesho",12));
        group.addMember(new Warrior("Gosho",22));
        group.addMember(new Warrior("Stamat",2));

        Command groupTarget=new GroupTargetCommand(group,new Dragon("Dragon",100,2));
        groupTarget.execute();
        Command groupAttack=new GroupAttackCommand(group);
        groupAttack.execute();

    }
}
