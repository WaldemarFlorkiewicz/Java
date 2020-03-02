package SkladoweStatyczne;

public class Student {

    private String firstName;
    private String lastName;
    private int studentIndex;
    public static int NUMBERS_OF_STUDENTS;

    public Student(String firstName, String lastName, int studentIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndex = studentIndex;
        NUMBERS_OF_STUDENTS++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public static int getNumbersOfStudents() {
        return NUMBERS_OF_STUDENTS;
    }
}
