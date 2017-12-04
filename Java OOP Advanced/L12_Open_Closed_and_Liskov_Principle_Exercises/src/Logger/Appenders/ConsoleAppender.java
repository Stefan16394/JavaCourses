package Logger.Appenders;

import Logger.Interfaces.Layout;
import Logger.Messages.Message;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layoutType) {
        super(layoutType);
    }

    @Override
    public void append(Message message) {
        String printMessage=(String.format(this.getLayoutType().getLayout(),message.getDate(),message.getReportLevel(),message.getMessage()));
        System.out.println(printMessage);
        increaseNumofMessagesAppended();
    }

    @Override
    public String getInfo() {
        return (String.format("Appender type: ConsoleAppender, Layout type: %s," +
                " Report level: %s, Messages appended: %d\n",this.getLayoutType().getClass().getSimpleName(),this.getLevel(),this.getMessagesAppended()));
    }


}
