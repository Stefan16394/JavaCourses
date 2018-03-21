package P04_DetailPrinter;

import java.util.List;

public class Manager extends Employee {

    private List<String> documents;

    public Manager(String name, List<String> documents) {
        super(name);
        this.documents = documents;
    }

    @Override
    public String toString() {
        return super.toString() + this.documents.toString();
    }
}
