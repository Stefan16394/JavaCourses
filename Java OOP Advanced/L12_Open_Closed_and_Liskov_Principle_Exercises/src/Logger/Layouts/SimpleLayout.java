package Logger.Layouts;

import Logger.Interfaces.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String getLayout() {
       return "%s - %s - %s";
    }
}
