package Logger.Layouts;

import Logger.Interfaces.Layout;

public class XmlLayout implements Layout {
    @Override
    public String getLayout() {
        return "<log>\n" +
                "<date>%s</date>\n" +
                "<level>%s</level>\n" +
                "<message>%s</message>\n" +
                "</log>";
    }
}
