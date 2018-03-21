package pr0304Barracks.core.commands;

import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

public class Add extends Command {
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ReflectiveOperationException {
        String unitType=getData()[1];
        Unit unit=this.getUnitFactory().createUnit(unitType);
        this.getRepository().addUnit(unit);
        return unitType+ " added!";
    }
}
