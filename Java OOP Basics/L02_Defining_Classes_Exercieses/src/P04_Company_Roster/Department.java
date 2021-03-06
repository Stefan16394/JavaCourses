package P04_Company_Roster;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public Department(String name, List<Employee> list) {
        this.name = name;
        this.list = list;
    }
}
