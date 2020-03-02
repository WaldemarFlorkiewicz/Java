package SkladoweStatyczne;

import PetleCwiczenie2.Patient;

public class University {
    public static void main(String[] args) {

        Student student1 = new Student("Tomasz", "Nowak", 14);
        Student student2 = new Student("Adam", "Kozlowski", 15);
        Student student3 = new Student("Joanna", "Kowalczyk", 1);

        System.out.println(Student.getNumbersOfStudents());


    }
}
