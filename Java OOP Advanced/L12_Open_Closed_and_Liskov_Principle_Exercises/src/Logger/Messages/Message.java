package Logger.Messages;

import Logger.ReportLevels.ReportLevel;

public class Message {
    private ReportLevel reportLevel;
    private String date;
    private String message;

    public Message(ReportLevel reportLevel, String date, String message) {
        this.reportLevel = reportLevel;
        this.date = date;
        this.message = message;
    }

    public ReportLevel getReportLevel() {
        return reportLevel;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
