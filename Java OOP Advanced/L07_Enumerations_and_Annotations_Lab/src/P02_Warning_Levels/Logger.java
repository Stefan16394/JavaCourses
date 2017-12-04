package P02_Warning_Levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Message> messages;

    public Logger() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message,Importance importance)
    {
        int result=Integer.compare(message.getImportance().ordinal(),importance.ordinal());
        if (result>=0)
        {
            messages.add(message);
        }
    }

    public Iterable<Message> getMessages()
    {
        return this.messages;
    }
}
