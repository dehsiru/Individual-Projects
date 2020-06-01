package privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Student {

private int id;
private String firstName;
private String lastName;
private String dateOfBirth; 
private double tuitionFees;
private ArrayList<Assignment> assignementsPerStudent;
private Map<Course, Student> mapCoursesPerStudent= new HashMap<>();  // using a Map with key Course and value Student
                                                                     

    public Student(int id, String firstName, String lastName, String dateOfBirth, double tuitionFees) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }

    
    
}
