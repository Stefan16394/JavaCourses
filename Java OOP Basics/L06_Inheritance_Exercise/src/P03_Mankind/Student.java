package P03_Mankind;

public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
       setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length()<4 ||facultyNumber.length()>10)
        {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString(){
        return String.format("First Name: %s\n" +
                "Last Name: %s\n" +
                "Faculty number: %s\n",getFirstName(),getLastName(),getFacultyNumber());
    }
}
