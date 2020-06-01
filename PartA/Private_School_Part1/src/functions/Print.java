//2020-02-01 2020-02-02 2020-02-03
package functions;

import java.time.LocalDate;
import java.util.ArrayList;
import privateschool.Student;


public class Print {

    public static <Χ> void printAll(ArrayList <Χ> all){
        for (int i = 0; i < all.size(); i++) {
            System.out.println((i+1)+". " +all.get(i));
        }
        System.out.println("____________________________________________________________________________");
    }

    public static  void printStudentsToSubmit(ArrayList <Student> allStudents, LocalDate inputDate){
        
        int howManyStudents=0;
        java.time.DayOfWeek enumOfInputDay = inputDate.getDayOfWeek();
     

        LocalDate sundayOfTheInputWeek= inputDate.minusDays(enumOfInputDay.getValue());    // vrisko tin imerominia tis kiriakis tis proigoumenis evdomadas ap autin pou edose o xristis
        LocalDate mondayOfTheInputWeek= sundayOfTheInputWeek.plusDays(8);                  // antistoixa, vrisko tin imerominia tis deuteras ap tin epomeni evdomada.
     
    
        for( Student s :allStudents){
            for (int i = 0; i < s.getAssignementsPerStudent().size(); i++) {
                if( (sundayOfTheInputWeek.isBefore(s.getAssignementsPerStudent().get(i).getSubDateTime()) )&&(mondayOfTheInputWeek.isAfter(s.getAssignementsPerStudent().get(i).getSubDateTime())) ){     
                    
                    System.out.println("The student "+ s.getFirstName() + " "+ s.getLastName() + "has to submit one or more assignment!");
                    howManyStudents++;
                    break;
                } 
            }
        }
        if(howManyStudents==0){
            System.out.println("No student has to submit this week!");
        }
    }
}
