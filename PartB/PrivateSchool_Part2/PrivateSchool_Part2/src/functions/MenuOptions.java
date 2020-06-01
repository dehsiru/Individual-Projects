package functions;
import static functions.ConnectionToDatabase.openConnection;
import java.util.*;
import privateschool.*;
import static functions.Print.*;
import static functions.GetDataFromDB.*;
import static functions.InsertDataToDB.*;
import static functions.Validation.isThisOkForMenuInput;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class MenuOptions {
   
    static String input;
    static Scanner scanner = new Scanner(System.in);

    public static void start() throws SQLException{
        
        ArrayList<Student> allStudents = new ArrayList<>(); 
        ArrayList<Trainer> allTrainers = new ArrayList<>();
        ArrayList<Assignment> allAssignments = new ArrayList<>();
        ArrayList<Course> allCourses = new ArrayList<>();
        Connection conn=openConnection(); 
        Statement st = conn.createStatement();

        String input;
        
        do{   
            System.out.println("Type 1 to print a list of all students.");
            System.out.println("Type 2 to print a list of all trainers.");
            System.out.println("Type 3 to print a list of all assignments.");
            System.out.println("Type 4 to print a list of all courses");
            System.out.println("Type 5 to print a list of students per course.");
            System.out.println("Type 6 to print a list of trainers per course.");
            System.out.println("Type 7 to print a list of assignments per course.");
            System.out.println("Type 8 to print a list of assignments per course per student.");
            System.out.println("Type 9 to print the students that belongs to more than one courses.");
            System.out.println("Type 10 to insert a student.");
            System.out.println("Type 11 to insert a trainer.");
            System.out.println("Type 12 to insert an assignment.");
            System.out.println("Type 13 to insert student per course.");
            System.out.println("Type 14 to insert a trainer per course.");
            System.out.println("Type 15 to insert assignment per course per student.");
            System.out.println("Type 16 to quit!");
            System.out.println("____________________________________________________________________________________");
            input = scanner.nextLine();
            input=isThisOkForMenuInput(input);
            System.out.println("____________________________________________________________________________________");
            switch(input){
                case "1":
                    allStudents= getStudentsFromDB(st); 
                    printAll(allStudents);
                    break;
                case "2":
                    allTrainers= getTrainersFromDB(st); 
                    printAll(allTrainers);
                    break;
                case "3":
                    allAssignments= getAssignmentsFromDB(st); 
                    printAll(allAssignments);
                    break;
                case "4":
                    allCourses= getCoursesFromDB(st); 
                    printAll(allCourses);  
                    break;
                case "5":
                     printStudentsPerCoursesfromDB(st);
                    break;
                case "6":
                    printTrainersPerCourses(st);
                    break;
                case "7":
                    printAssignmentsPerCourse(st);    
                    break;
                case "8":
                    printAssignmentsPerCoursePerStudent(st);
                    break;    
                case "9":
                   printStudentsThatBelongToMoreThanOneCourse(st);
                    break;
                case "10":
                    insertStudent(st);
                    break;  
                case "11":
                    insertTrainer(st);
                    break; 
                case "12":
                    insertAssignment(st);
                    break; 
                case "13":
                    insertStudentPerCourse(st);
                    break; 
                case "14":
                    insertTrainerPerCourse(st);
                    break; 
                case "15":
                    insertAssignmentPerStudentPerCourse(st);
                    break; 
            }
        }while (!"16".equals(input));
        
        conn.close();
    
    }
}
    
  
    
    

