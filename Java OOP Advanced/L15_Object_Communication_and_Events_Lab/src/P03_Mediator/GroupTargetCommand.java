package P03_Mediator;


import P03_Mediator.Skeleton.Target;

public class GroupTargetCommand implements Command {
    private AttackGroup group;
    private Target target;

    public GroupTargetCommand(AttackGroup group, Target target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        group.groupTarget(target);
    }
}
