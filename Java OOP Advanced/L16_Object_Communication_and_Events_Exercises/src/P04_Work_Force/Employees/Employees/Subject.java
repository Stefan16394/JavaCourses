package P04_Work_Force.Employees.Employees;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer job)
    {
        this.observers.add(job);
    }

    public void passWeek()
    {
        List<Observer> tempList=new ArrayList<>();
        for (Observer observer:this.observers) {

            observer.update();
            if (observer.getHoursRequired()<=0)
            {
                System.out.println(String.format("Job %s done!",observer.getName()));
            }
            else
            {
                tempList.add(observer);
            }
        }
        this.observers=tempList;
    }

    public void status()
    {
        for (Observer observer:this.observers)
        {
            System.out.println(String.format("Job: %s Hours Remaining: %d",observer.getName(),observer.getHoursRequired()));
        }
    }
}
