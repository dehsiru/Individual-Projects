package functions;

import java.util.ArrayList;
import java.util.Set;
import privateschool.Course;
import privateschool.Student;

public class Find {
    
    public static  ArrayList<Student> findHowManyStudentsAreOnCourses(ArrayList<Student> allStudents, ArrayList<Course> allCourses){
         ArrayList <Student> studentsOnCourses=new ArrayList<>();
        for (Student s: allStudents){   
            int size = allCourses.size(); 
            for (int i = 0; i < size; i++) {
                for (Student a: allCourses.get(i).getStudentsPerCourse()){
                     a.getMapCoursesPerStudent().put(allCourses.get(i),a);
                }
            }
           Set <Course> keys = s.getMapCoursesPerStudent().keySet();           // to keys einai ena Set me Strings, mesa apothikeuei ta key tou map
           int counter=0;
           for(Course key : keys){
               counter++;
               if(counter>1&&counter==s.getMapCoursesPerStudent().size()){     
                   studentsOnCourses.add(s);
               }
           }
        }
        return studentsOnCourses;    
    }
    

}
