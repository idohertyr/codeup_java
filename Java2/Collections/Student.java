/**
 * Compiliation: javac Student.java
 * Execution: java Student
 *
 * Create an applicatino for tracking student grades.
 */

import java.util.ArrayList;

public class Student {

    /* Properties */
    private String name;
    private ArrayList<Integer> grades;

    /* Contructor */
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        /* Main */
        Student ian = new Student("Ian");
        ian.addGrade(82);
        ian.addGrade(99);
        ian.addGrade(49);
        ian.printStudent();
    }

    public String getName() {
        /* Return Student name */
        return this.name;
    }

    public void addGrade(int grade) {
        /* Adds the given grade to the grades property */
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        /* Returns average student grade */
        double total = 0;
        for (int grade : this.grades) {
            total += grade;
        }
        return total / this.grades.toArray().length;
    }

    public void printStudent() {
        /* Prints Student */
        String info = String.format("Student:\n Name: %s\n Grades: %s\n Average: %f",
                this.name,
                this.grades,
                this.getGradeAverage());
        System.out.println(info);
    }

}