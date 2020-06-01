package privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Student {

private String firstName;
private String lastName;
private LocalDate dateOfBirth; 
private double tuitionFees;
private ArrayList<Assignment> assignementsPerStudent;
private Map<Course, Student> mapCoursesPerStudent= new HashMap<>();  // using a Map with key Course and value Student

    


    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees, ArrayList<Assignment> assignementsPerStudent,Map<Course, Student> mapCoursesPerStudent ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.assignementsPerStudent=assignementsPerStudent;
        this.mapCoursesPerStudent=mapCoursesPerStudent;
    }

    public Map<Course, Student> getMapCoursesPerStudent() {
        return mapCoursesPerStudent;
    }

    public void setMapCoursesPerStudent(Map<Course, Student> mapCoursesPerStudent) {
        this.mapCoursesPerStudent = mapCoursesPerStudent;
    }

    
    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public ArrayList<Assignment> getAssignementsPerStudent() {
        return assignementsPerStudent;
    }

    public void setAssignementsPerStudent(ArrayList<Assignment> assignementsPerStudent) {
        this.assignementsPerStudent = assignementsPerStudent;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getFees() {
        return tuitionFees;
    }

    public void setFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }

    
    
}
