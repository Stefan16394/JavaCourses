package Logger;

import Logger.Interfaces.Logger;
import Logger.Loggers.MessageLogger;
import Logger.Messages.Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Controller controller=new Controller();
        controller.read();
        Logger logger=new MessageLogger(controller.getAppenders());
        for (Message message:controller.getMessages())
        {
            switch (message.getReportLevel())
            {
                case INFO:
                    logger.logInfo(message);
                    break;
                case ERROR:
                    logger.logError(message);
                    break;
                case WARNING:
                    logger.logWarning(message);
                    break;
                case CRITICAL:
                    logger.logCritical(message);
                    break;
                case FATAL:
                    logger.logFatal(message);
                    break;
                default:break;
            }
        }
        System.out.println(logger.loggerInfo());
    }
}
