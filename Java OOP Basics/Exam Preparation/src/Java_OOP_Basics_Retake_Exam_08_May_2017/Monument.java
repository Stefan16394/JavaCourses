package Java_OOP_Basics_Retake_Exam_08_May_2017;

public abstract class Monument {
    private String name;

    public Monument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int afinity();

}
