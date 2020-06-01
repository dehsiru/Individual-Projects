package functions;

import java.time.LocalDate;
import java.util.ArrayList;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;

public  class GiveAssignments {
    
    
    
   public static void giveAssignmentsToStudents(ArrayList<Student> allStudents, ArrayList<Assignment> allAssignments, ArrayList<Course> allCourses){
       java.util.Random random = new java.util.Random();
       LocalDate today = LocalDate.now();
       
       for (Course c: allCourses) {
            if(c.getType().equals("Full time")){            
                    for(Student s: c.getStudentsPerCourse()){    //prosvasi se kathe enan mathiti tis listas StudentsPerCourse 
                       
                       int numOfAssign=0;
                       LocalDate nextAssignmentDate=c.getStart_date();
                       
                       while(numOfAssign<6) {
                           nextAssignmentDate=nextAssignmentDate.plusDays(15);           // ta assignments sta full time course anatithonte ana 15 meres
                           s.getAssignementsPerStudent().add(allAssignments.get(numOfAssign));
                           
                           if(nextAssignmentDate.isBefore(today)){                      //vazw vathmous stis ergasies pou exei perasei to subDate
                                s.getAssignementsPerStudent().get(numOfAssign).setDateAndWrittenOralMarks(nextAssignmentDate, random.nextInt(10),random.nextInt(10));
                            }
                            else{
                                s.getAssignementsPerStudent().get(numOfAssign).setSubDateTime(nextAssignmentDate);
                            }
                           numOfAssign++;
                        }  
                    }      
            }
            else{    //Part time course
                   for(Student s: c.getStudentsPerCourse()){    //prosvasi se kathe enan mathiti tis listas StudentsPerCourse 
                       
                       int numOfAssign=0;
                       LocalDate nextAssignmentDate=c.getStart_date();
                       
                       while(numOfAssign<6) {
                           nextAssignmentDate=nextAssignmentDate.plusDays(28);           // ta assignments sta part time course anatithonte ana 28 meres
                           s.getAssignementsPerStudent().add(allAssignments.get(numOfAssign));
                           
                           if(nextAssignmentDate.isBefore(today)){                      //vazw vathmous stis ergasies pou exei perasei to subDate
                                s.getAssignementsPerStudent().get(numOfAssign).setDateAndWrittenOralMarks(nextAssignmentDate, random.nextInt(10),random.nextInt(10));
                            }
                            else{
                                s.getAssignementsPerStudent().get(numOfAssign).setSubDateTime(nextAssignmentDate);
                            }
                           numOfAssign++;
                        }  
                    }
            }
        }
    }
}

   
   
   
   
   

            
           
       
   
   
   


