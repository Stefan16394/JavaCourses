package pr0304Barracks.core.factories;

import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;
import pr0304Barracks.models.units.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		Unit unit=null;
		switch (unitType)
		{
			case "Archer":
				unit=new Archer();
				break;
			case "Pikeman":
				unit=new Pikeman();
				break;
			case "Swordsman":
				unit=new Swordsman();
				break;
			case "Gunner":
				unit=new Gunner();
				break;
			case "Horseman":
				unit=new Horseman();
				break;
		}

		return unit;

	}
}
