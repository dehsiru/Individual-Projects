package functions;

import static functions.MenuOptions.scanner;
import static functions.Validations.isThisABirthDate;
import static functions.Validations.isThisADouble;
import static functions.Validations.isThisAName;
import static functions.Validations.isThisASubject;
import static functions.Validations.vadidationDate;
import java.time.LocalDate;
import java.util.ArrayList;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.Trainer;

public class InputsFromKeyboard {
    
    public static void addStudents(int counter,ArrayList<Student> allStudents, ArrayList<Course> allCourses){
        
        for (int i = 0; i < counter; i++) {
            
            if(i>0){System.out.println("Lets registrate the next one!");}
            
            System.out.println("Give  the first name:");
            String firstName=isThisAName();
            
            System.out.println("Give  the last name:");
            String lastName=isThisAName();
            
            System.out.println("Give the birthday");
            LocalDate dateOfBirth=isThisABirthDate();
            
            System.out.println("Give the  tuition fees");
            double tuitionFees=isThisADouble();
            
            Student s1=new Student(firstName,lastName, dateOfBirth, tuitionFees);
            allStudents.add(s1);
            
//            System.out.println("Perfect! "+firstName+" have been registrated in our school.");
//            
//            System.out.println("In which course you want to add " +firstName);
//            Print.printAll(allCourses);
//            System.out.println("Please give the number of the course: ");
//            input2 = scanner.nextLine();
//            allCourses.get((Integer.parseInt(input2)-1)).getStudentsPerCourse().add(s1);
        }
    }
        
    public static void addTrainers(int counter,ArrayList <Trainer> allTrainers ){
       
        for (int i = 0; i < counter; i++) {
            
            if(i>1){System.out.println("Lets registrate the next one!");}
            
            System.out.println("Give  the first name:");
            String firstName=isThisAName();
            
            System.out.println("Give  the last name:");
            String lastName=isThisAName();
            
            System.out.println("Give the subject:");
            String subject=isThisASubject();
            
            Trainer t1=new Trainer(firstName,lastName, subject);
            allTrainers.add(t1);
            System.out.println("Perfect! The "+firstName+" have been registrated in our school.");
        }
    } 
        
  public static void addAssignments(int counter, ArrayList <Assignment> allAssignments){
        
         for (int i = 0; i < counter; i++) {
             
             if(i>1){System.out.println("Lets registrate the next one!");}
             
             System.out.println("Give  the title:");
             String title=scanner.nextLine();
             
             System.out.println("Give  the description:");
             String description=scanner.nextLine();
             
             System.out.println("Give the submission date:");
             LocalDate subDateTime=vadidationDate();
             
             Assignment a1= new Assignment(title, description, subDateTime);
             allAssignments.add(a1);
             System.out.println("Perfect! The "+title+" assignment is ready.");
         }
        
   }
    
    public static void addCourses(int counter, ArrayList <Course> allCourses){     //Not ready. :(
        System.out.println("Ok!");
   }

}