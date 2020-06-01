package functions;
import java.time.LocalDate;
import java.util.*;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.Trainer;
import static functions.Find.findHowManyStudentsAreOnCourses;
import static functions.Validations.isThisAnInteger;
import static functions.Validations.isThisOkForBuildSchoolInput;
import static functions.Validations.vadidationDate;
import static functions.GiveAssignments.giveAssignmentsToStudents;
import static functions.Validations.isThisOkForMenuInput;


public class MenuOptions {
   
    static String input2;
    static Scanner scanner = new Scanner(System.in);

    public static void Menu(){
       String input=null;
       
       Data d= new Data();
        
       giveAssignmentsToStudents(d.allStudents, d.allAssignments,d.allCourses);
        
        do{
            System.out.println("____________________________________________________________________________________");
            System.out.println("For adding data to our school structure------------------------------------- type 0");
            System.out.println("For printing a list of all the students------------------------------------- type 1");
            System.out.println("For printing a list of all the trainers--------------------------------------type 2");
            System.out.println("For printing a list of all the assignments-----------------------------------type 3");
            System.out.println("For printing a list of all the courses---------------------------------------type 4");
            System.out.println("For printing  students per course--------------------------------------------type 5");
            System.out.println("For printing  trainers per course--------------------------------------------type 6");
            System.out.println("For printing assignments per course------------------------------------------type 7");
            System.out.println("For printing assignments per student,----------------------------------------type 8");
            System.out.println("For printing the list of students that belong to more than one courses------ type 9");
            System.out.println("For printing the list of students who need to submit one or more assignments       ");
            System.out.println("on the same calendar week as the date that you give--------------------------type 10");
            System.out.println("Quit,------------------------------------------------------------------------type 11");
            System.out.println("____________________________________________________________________________________");

            input = scanner.nextLine();
            input=isThisOkForMenuInput(input);
            
            switch(input){
                case "0":
                    buildSchool(d.allStudents, d.allAssignments,d.allCourses,d.allTrainers);
                case "1":
                    Print.printAll(d.allStudents);
                    break;
                case "2":
                    Print.printAll(d.allTrainers);
                    break;
                case "3":
                    Print.printAll(d.allAssignments);
                    break;
                case "4":
                    Print.printAll(d.allCourses);  
                    break;
                case "5":
                    Print.printAll(d.allCourses);
                    System.out.println("Give the number of the course: ");
                    input = scanner.nextLine();
                    Print.printAll(d.allCourses.get((Integer.parseInt(input)-1)).getStudentsPerCourse());    
                    break;
                case "6":
                    Print.printAll(d.allCourses);
                    System.out.println("Give the number of the course: ");
                    input = scanner.nextLine();
                    Print.printAll(d.allCourses.get((Integer.parseInt(input)-1)).getTrainersPerCourse());  
                    break;
                case "7":
                    Print.printAll(d.allCourses);
                    System.out.println("Give the number of the course: ");
                    input = scanner.nextLine();
                    Print.printAll(d.allCourses.get((Integer.parseInt(input)-1)).getAssignmentsPerCourse());  
                    break;
                case "8":
                    Print.printAll(d.allStudents);
                    System.out.println("Give the number of the student: ");
                    input = scanner.nextLine();
                    Print.printAll(d.allStudents.get((Integer.parseInt(input)-1)).getAssignementsPerStudent());
                    break;    
                case "9":
                    d.studentsOnCourses=findHowManyStudentsAreOnCourses(d.allStudents,d.allCourses);    //students that belong to more than one courses
                    Print.printAll(d.studentsOnCourses);
                    break;
                case "10":
                    LocalDate validateInputDate=vadidationDate();
                    Print.printStudentsToSubmit(d.allStudents,validateInputDate );
                    break;  
            }
        }while (!"11".equals(input));
    }

    
    
    
    public static void buildSchool(ArrayList<Student> allStudents,ArrayList<Assignment> allAssignments,ArrayList<Course> allCourses,ArrayList<Trainer>allTrainers){
        int howMany;
        
        
        do{
            System.out.println("___________________________________________________________________________________");
            System.out.println("Give students----------------------------------------------------------------type 1");
            System.out.println("Give trainers----------------------------------------------------------------type 2");
            System.out.println("Give assignments-------------------------------------------------------------type 3");
            System.out.println("Give courses-----------------------------------------------------------------type 4");
            System.out.println("Go back on main menu---------------------------------------------------------type 5");
            System.out.println("___________________________________________________________________________________");
            input2 = scanner.nextLine();
            
            input2= isThisOkForBuildSchoolInput(input2);

            switch(input2){
                case "1":
                    System.out.println("How many students;");
                    howMany=isThisAnInteger();  
                    InputsFromKeyboard.addStudents(howMany,allStudents,allCourses);
                    break;
                case "2":
                    System.out.println("How many trainers;");
                    howMany=isThisAnInteger();  
                    InputsFromKeyboard.addTrainers(howMany,allTrainers);
                    break;
                case "3":
                    System.out.println("How many assignments;");
                    howMany=isThisAnInteger(); 
                    InputsFromKeyboard.addAssignments(howMany,allAssignments);
                    break;
                case "4":
                    System.out.println("How many courses;");
                    howMany=isThisAnInteger(); 
                    InputsFromKeyboard.addCourses(howMany,allCourses);
                    break;  
            }           
        }while (!"5".equals(input2));
    }
}
