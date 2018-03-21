package Logger;

import Logger.Appenders.ConsoleAppender;
import Logger.Appenders.FileAppender;
import Logger.Files.LogFile;
import Logger.Interfaces.Appender;
import Logger.Interfaces.File;
import Logger.Interfaces.Layout;
import Logger.Interfaces.Logger;
import Logger.Layouts.SimpleLayout;
import Logger.Layouts.XmlLayout;
import Logger.Loggers.MessageLogger;
import Logger.Messages.Message;
import Logger.ReportLevels.ReportLevel;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private List<Appender> appenders;
    private List<Message> messages;

    public Controller() {
        this.appenders = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void read()
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split(" ");
            Appender appender=null;
            Layout layout=null;
            switch (input[0])
            {
                case "FileAppender":
                    layout=layoutCheck(input[1]);
                    appender=new FileAppender(layout);
                    if (input.length==3)
                    {
                        appender.setLevel(ReportLevel.valueOf(input[2].toUpperCase()));
                    }
                    else
                    {
                        appender.setLevel(ReportLevel.INFO);
                    }
                    File file = new LogFile();
                    ((FileAppender) appender).setFile(file);
                    break;

                case "ConsoleAppender":
                    layout=layoutCheck(input[1]);
                    appender=new ConsoleAppender(layout);
                    if (input.length==3)
                    {
                        appender.setLevel(ReportLevel.valueOf(input[2].toUpperCase()));
                    }
                    else
                    {
                        appender.setLevel(ReportLevel.INFO);
                    }
                    break;
            }
            appenders.add(appender);
        }
        while (true)
        {
            String[] input=sc.nextLine().split("\\|");
            if (input[0].equals("END"))
            {
                break;
            }
            Message message=new Message(ReportLevel.valueOf(input[0].toUpperCase()),input[1],input[2]);
            messages.add(message);
        }
    }

    public List<Appender> getAppenders() {
        return appenders;
    }

    private Layout layoutCheck(String layout)
    {
        Layout layout1=null;
        switch (layout) {
            case "SimpleLayout":
                layout1=new SimpleLayout();
                break;
            case "XmlLayout":
                layout1=new XmlLayout();
                break;
        }
        return layout1;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
