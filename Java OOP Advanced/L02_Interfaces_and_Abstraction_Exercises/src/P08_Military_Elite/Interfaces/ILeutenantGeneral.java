package P08_Military_Elite.Interfaces;

import P08_Military_Elite.Privates.Private;

import java.util.List;

public interface ILeutenantGeneral extends IPrivate {
    List<Private> getPrivates();
}
