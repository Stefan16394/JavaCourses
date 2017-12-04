package Logger.Interfaces;

import Logger.Messages.Message;

public interface Logger {
    void logInfo(Message message);
    void logWarning(Message message);
    void logError(Message message);
    void logCritical(Message message);
    void logFatal(Message message);
    String loggerInfo();
}
