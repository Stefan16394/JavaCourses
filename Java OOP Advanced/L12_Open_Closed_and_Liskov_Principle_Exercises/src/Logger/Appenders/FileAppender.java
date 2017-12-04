package Logger.Appenders;

import Logger.Interfaces.File;
import Logger.Interfaces.Layout;
import Logger.Messages.Message;

public class FileAppender extends BaseAppender {

    private File file;

    public FileAppender(Layout layoutType) {
        super(layoutType);
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void append(Message message) {
        String printMessage=(String.format(this.getLayoutType().getLayout(),message.getDate(),message.getReportLevel(),message.getMessage()));
        file.write(printMessage);
       super.increaseNumofMessagesAppended();
    }

    @Override
    public String getInfo() {
         return (String.format("Appender type: FileAppender, Layout type: %s," +
                " Report level: %s, Messages appended: %d, File size: %d\n", this.getLayoutType().getClass().getSimpleName(),this.getLevel(),
                 this.getMessagesAppended(),this.file.getSize()));
    }
}
