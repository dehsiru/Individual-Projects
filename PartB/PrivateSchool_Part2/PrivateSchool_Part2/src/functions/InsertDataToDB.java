package functions;

import static functions.GetDataFromDB.getCoursesFromDB;
import static functions.GetDataFromDB.getStudentsFromDB;
import static functions.MenuOptions.scanner;
import static functions.Print.printAll;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Course;
import privateschool.Student;

public class InsertDataToDB {

    
    public static void insertStudent(Statement st) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String studentFirstName=null;
        String studentLastName=null;
        String dateOfBirth=null;
        String tuition_fees=null;
        double tuitionFees=0;
        
        System.out.println("Type student's first name: ");
        studentFirstName = sc.nextLine();
        
        System.out.println("Type student's last Name: ");
        studentLastName = sc.nextLine();
        
        System.out.println("Type student's birthday: ( in format: '1945-02-28')");
        dateOfBirth = sc.nextLine();
        
        System.out.println("Type student's tuition fees: ");
        tuition_fees = sc.nextLine();
        
        int rowsAffected = st.executeUpdate("INSERT INTO students VALUES (NULL,'" + studentFirstName + "','" + studentLastName + "','" + dateOfBirth + "','" + tuitionFees + "')");
        
        if (rowsAffected == 0) {
            System.out.println("Wrong inputs, please try again!");
        } else {
            System.out.println("The student has been added!");
        }
        System.out.println("____________________________________________________________________________________");
    }
    
     public static void insertTrainer(Statement st) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String trainerFirstName;
        String trainerLastName;
        String subjectFinal;
        
        System.out.println("Type trainer's first name: ");
        trainerFirstName = sc.nextLine();

        System.out.println("Type trainer's last name: ");
        trainerLastName = sc.nextLine();

        System.out.println("Type trainer's subject: ");
        subjectFinal = sc.nextLine();

        int rowsAffected = st.executeUpdate("INSERT INTO trainers VALUES (NULL,'" + trainerFirstName + "','" + trainerLastName + "','" + subjectFinal + "')");
        if (rowsAffected == 0) {
            System.out.println("Wrong inputs, please try again!");
        } else {
            System.out.println("The trainer has been added!");
        }
        System.out.println("____________________________________________________________________________________");
    }
     
     public static void insertAssignment(Statement st) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String assignmentTitle;
        String assignmentDescription;
        String subDateTime;
        
        System.out.println("Type title: ");
        assignmentTitle = sc.nextLine();

        System.out.println("Type description: ");
        assignmentDescription = sc.nextLine();

        System.out.println("Type subDateTime: ( in format: '1945-02-28')");
        subDateTime = sc.nextLine();

        int rowsAffected = st.executeUpdate("INSERT INTO assignments VALUES (NULL,'" + assignmentTitle + "','" + assignmentDescription + "','" + subDateTime + "',0 ,0 , 0)");
        if (rowsAffected == 0) {
            System.out.println("Wrong inputs, please try again!");
        } else {
            System.out.println("The assignment has been added!");
        }
        System.out.println("____________________________________________________________________________________");
    }
     
    
    public static void insertStudentPerCourse(Statement st) throws SQLException {  
        
        Scanner sc = new Scanner(System.in);
        String studentFirstName=null;
        String studentLastName=null;
        String dateOfBirth=null;
        String tuition_fees=null;
        double tuitionFees=0;
        int lastStudent_id;
        ArrayList<Course> allCourses = new ArrayList<>();
        int courseNumber;
        
        System.out.println("Type student's first name: ");
        studentFirstName = sc.nextLine();
        
        System.out.println("Type student's last Name: ");
        studentLastName = sc.nextLine();
        
        System.out.println("Type student's birthday: ( in format: '1945-02-28')");
        dateOfBirth = sc.nextLine();
        
        System.out.println("Type student's tuition fees: ");
        tuition_fees = sc.nextLine();
        
        int rowsAffected = st.executeUpdate("INSERT INTO students VALUES (NULL,'" + studentFirstName + "','" + studentLastName + "','" + dateOfBirth + "','" + tuitionFees + "')");
        
        if (rowsAffected == 0) {
            System.out.println("Wrong inputs, please try again!");
        } else {
            System.out.println("The student has been added!");
        }
        
        ResultSet result= st.executeQuery("SELECT MAX(st_id) as st_id  FROM students;");
        result.next();
        lastStudent_id=result.getInt("st_id");
        
        System.out.println("Now, in which of these courses you want to add the student;");
        allCourses= getCoursesFromDB(st); 
        printAll(allCourses); 
        System.out.println("Please type the number:");
        courseNumber = scanner.nextInt();
        
        int rowsAffected2 = st.executeUpdate("INSERT INTO students_per_course VALUES ('" + lastStudent_id +"','" + courseNumber+ "')");
        if (rowsAffected2 == 0) {
            System.out.println("Something went wrong, please try again!");
        } else {
            System.out.println("The student has been added in the course!");
        }
    }
    
    public static void insertTrainerPerCourse(Statement st) throws SQLException {  
        
        Scanner sc = new Scanner(System.in);
        String trainerFirstName;
        String trainerLastName;
        String subjectFinal;
        int lastTrainer_id;
        ArrayList<Course> allCourses = new ArrayList<>();
        int courseNumber;
        
        System.out.println("Type trainer's first name: ");
        trainerFirstName = sc.nextLine();

        System.out.println("Type trainer's last name: ");
        trainerLastName = sc.nextLine();

        System.out.println("Type trainer's subject: ");
        subjectFinal = sc.nextLine();

        int rowsAffected = st.executeUpdate("INSERT INTO trainers VALUES (NULL,'" + trainerFirstName + "','" + trainerLastName + "','" + subjectFinal + "')");
        if (rowsAffected == 0) {
            System.out.println("Wrong inputs, please try again!");
        } else {
            System.out.println("The trainer has been added!");
        }
        
        ResultSet result= st.executeQuery("SELECT MAX(tr_id) as tr_id  FROM trainers;");
        result.next();
        lastTrainer_id=result.getInt("tr_id");
        
        System.out.println("Now, in which of these courses you want to add the trainer;");
        allCourses= getCoursesFromDB(st); 
        printAll(allCourses); 
        System.out.println("Please type the number:");
        courseNumber = scanner.nextInt();
        
      
        int rowsAffected2 = st.executeUpdate("INSERT INTO trainers_per_course VALUES ('" + lastTrainer_id +"','" + courseNumber+ "')");
        if (rowsAffected2 == 0) {
            System.out.println("Something went wrong, please try again!");
        } else {
            System.out.println("The trainer has been added in the course!");
        }
    }
    
    public static void insertAssignmentPerStudentPerCourse(Statement st) throws SQLException {  
       
       int lastAssignment_id;
       ArrayList<Student> allStudents = new ArrayList<>();  
       ArrayList<Course> allCourses = new ArrayList<>();
       
       insertAssignment(st);
       ResultSet result= st.executeQuery("SELECT MAX(as_id) as as_id  FROM assignments;");
       result.next();
       lastAssignment_id=result.getInt("as_id");
       
       System.out.println("In which student you want to give this assignment;");
       allStudents= getStudentsFromDB(st); 
       printAll(allStudents);
       System.out.println("Type the number:");
       int studentNumber = scanner.nextInt();
       
       System.out.println("In which course the student with this assignment will participate;");
        allCourses= getCoursesFromDB(st); 
        printAll(allCourses); 
        System.out.println("Please type the number:");
        int courseNumber = scanner.nextInt();
        
        int rowsAffected3 = st.executeUpdate("INSERT INTO assignments_per_student_per_course VALUES ('" + lastAssignment_id +"','" + studentNumber+ "','"+ courseNumber + "')");
        if (rowsAffected3 == 0) {
            System.out.println("Something went wrong, please try again!");
        } else {
            System.out.println("Perfect!");
        }
    }
}
