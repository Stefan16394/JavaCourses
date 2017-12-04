package Logger.Interfaces;

import Logger.Messages.Message;
import Logger.ReportLevels.ReportLevel;

public interface Appender {
    void append(Message message);
    void increaseNumofMessagesAppended();
    int getMessagesAppended();
    void setLevel(ReportLevel level);
    Layout getLayoutType();
    ReportLevel getLevel();
    String getInfo();
}
