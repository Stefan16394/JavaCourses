package P08_Military_Elite.Interfaces;

import P08_Military_Elite.Privates.SpecialisedSoldiers.Missions;

import java.util.List;

public interface ICommando extends ISpecialisedSoldier {
    List<Missions> getMissions();
}
