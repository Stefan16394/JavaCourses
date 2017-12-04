package Logger.Loggers;

import Logger.Interfaces.Appender;
import Logger.Interfaces.Logger;
import Logger.Messages.Message;
import Logger.ReportLevels.ReportLevel;

import java.util.List;

public class MessageLogger implements Logger {
    private List<Appender> appenders;

    public MessageLogger(List<Appender> appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(Message message) {
        for (Appender appender:appenders)
        {
           ReportLevel apenderReportLevel =appender.getLevel();
           if (apenderReportLevel.ordinal()<=ReportLevel.INFO.ordinal())
           {
               appender.append(message);
           }
        }
    }

    @Override
    public void logWarning(Message message) {
        for (Appender appender:appenders)
        {
            ReportLevel apenderReportLevel =appender.getLevel();
            if (apenderReportLevel.ordinal()<=ReportLevel.WARNING.ordinal())
            {
                appender.append(message);
            }
        }
    }

    @Override
    public void logError(Message message) {
        for (Appender appender:appenders)
        {
            ReportLevel apenderReportLevel =appender.getLevel();
            if (apenderReportLevel.ordinal()<=ReportLevel.ERROR.ordinal())
            {
                appender.append(message);
            }
        }
    }

    @Override
    public void logCritical(Message message) {
        for (Appender appender:appenders)
        {
            ReportLevel apenderReportLevel =appender.getLevel();
            if (apenderReportLevel.ordinal()<=ReportLevel.CRITICAL.ordinal())
            {
                appender.append(message);
            }
        }
    }

    @Override
    public void logFatal(Message message) {
        for (Appender appender:appenders)
        {
            ReportLevel apenderReportLevel =appender.getLevel();
            if (apenderReportLevel.ordinal()<=ReportLevel.FATAL.ordinal())
            {
                appender.append(message);
            }
        }
    }

    public String loggerInfo()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Logger info\n");
        for (Appender appender:appenders)
        {
            sb.append(appender.getInfo());
        }
        return sb.toString();
    }
}
