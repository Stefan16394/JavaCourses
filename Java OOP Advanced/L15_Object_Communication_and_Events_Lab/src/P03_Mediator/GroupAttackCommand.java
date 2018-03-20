package P03_Mediator;


public class GroupAttackCommand implements Command {
    private AttackGroup attacker;

    public GroupAttackCommand(AttackGroup attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        attacker.groupAttack();
    }
}
