package P08_Military_Elite.Interfaces;

import P08_Military_Elite.Privates.SpecialisedSoldiers.Repairs;

import java.util.List;

public interface IEngineer extends ISpecialisedSoldier {
    List<Repairs> getRepairs();
}
