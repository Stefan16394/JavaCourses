package Logger.Appenders;

import Logger.Interfaces.Appender;
import Logger.Interfaces.Layout;
import Logger.ReportLevels.ReportLevel;

public abstract class BaseAppender implements Appender {
    private Layout layoutType;
    private int messagesAppended;
    private ReportLevel level;

    public BaseAppender(Layout layoutType) {
        this.layoutType = layoutType;
        this.messagesAppended=0;
    }

    public void setLevel(ReportLevel level) {
        this.level = level;
    }

    @Override
    public void increaseNumofMessagesAppended() {
       this.messagesAppended++;
    }

    public ReportLevel getLevel() {
        return level;
    }

    public Layout getLayoutType() {
        return layoutType;
    }

    public int getMessagesAppended() {
        return messagesAppended;
    }


}
