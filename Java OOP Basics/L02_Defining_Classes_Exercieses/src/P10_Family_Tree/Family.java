package P10_Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String name;
    private String birthday;
    private List<Person> parents=new ArrayList<>();
    private List<Person> children=new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getParents() {
        return parents;
    }

    public List<Person> getChildren() {
        return children;
    }
}
