
package functions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.Trainer;


public class Data {
    
    public Student s1= new Student("Vasilis",   "  Douros  ",  LocalDate.of(2000, 12, 24) ,  210,  new ArrayList<>(), new HashMap<>());
    public Student s2= new Student("Odysseas",  " Tasoulas ",  LocalDate.of(1992, 2,  1)   , 1810,  new ArrayList<>(),new HashMap<>());
    public Student s3= new Student("Niki",      " Tasoula  ",  LocalDate.of(1993, 02, 02) ,    0,  new ArrayList<>(),new HashMap<>());
    public Student s4= new Student("Antreas",   "Galatsanos",  LocalDate.of(1982, 12, 11) , 2100,  new ArrayList<>(),new HashMap<>());
    public Student s5= new Student("Eleni",     " Agapaki  ",  LocalDate.of(1999, 3,  8)  ,    0, new ArrayList<>(), new HashMap<>());
    public Student s6= new Student("Mpampis",   " Douros   ",  LocalDate.of(1988, 05, 24) , 1400, new ArrayList<>(), new HashMap<>());
    public Student s7= new Student("Tolis",     "Mixalatos ",  LocalDate.of(1986, 9,  29)  , 2500, new ArrayList<>(),new HashMap<>());
    public Student s8= new Student("Eirini",    "Kladaki   ",  LocalDate.of(1972, 11, 18) ,   35, new ArrayList<>(),new HashMap<>());
    public Student s9= new Student("Despoina",  "Tolatou   ",  LocalDate.of(1977, 8, 13) ,   35, new ArrayList<>(),new HashMap<>());
    ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9));
    
    public Trainer t0 = new Trainer("Nikos" ,  " Nikolaidis" , "Rules of developing ");
    public Trainer t1 = new Trainer("George" , " Iraklidis " , "         OOP        ");
    public Trainer t2 = new Trainer("Nikos"  , "  Karapas  " , "         OOP        ");
    public Trainer t3 = new Trainer("George" , "Pasparakis " , "        Web         ");
    public Trainer t4 = new Trainer("Vasilis", " Vasileiou " , "        SQL         ");
    public Trainer t5 = new Trainer("Argiro" , " Argireiou " , "     Javascript     ");
    public Trainer t6 = new Trainer("Marinos" , " Xalepas  " , " How bootcamp works!");
   ArrayList<Trainer> allTrainers = new ArrayList<>(Arrays.asList(t0,t1, t2, t3, t4, t5, t6));
   
   
   Assignment a1= new Assignment("Basics OOP (Part1)      " ,"Individual" );
   Assignment a2= new Assignment("Intermediate OOP (Part2)" ,"Individual" );
   Assignment a3= new Assignment("        SQl (Part3)     " ,"Individual" );
   Assignment a4= new Assignment("     Frontend (Part4)   " ,"Individual" );
   Assignment a5= new Assignment("       Small Project    " ,"Individual" );
   Assignment a6= new Assignment("   Final Project Java   " ,"   Team   " );
   ArrayList<Assignment> allAssignments = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6));

   Course c1 = new Course("CB8  ","  Java ", "Full time", LocalDate.of(2019, 9, 9), LocalDate.of(2020, 1, 24), new ArrayList<>(Arrays.asList(t0,t1,t2,t4,t5)),new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9)),new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6)));
   Course c2 = new Course("CB9  ","  C#   ", "Full time", LocalDate.of(2019, 9, 9), LocalDate.of(2020, 1, 24),new ArrayList<>(Arrays.asList(t0,t1,t2,t3,t4,t5)), new ArrayList<>(Arrays.asList(s6,s8)),new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6)));
   Course c3 = new Course("CB10  ","  Java ", "Part time", LocalDate.of(2019, 9, 9), LocalDate.of(2020, 4, 24),new ArrayList<>(Arrays.asList(t0,t1,t2)), new ArrayList<>(Arrays.asList(s4,s5)),new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6)));
   Course c4 = new Course("CB11  ","  C# ",   "Part time", LocalDate.of(2019, 9, 9), LocalDate.of(2020, 4, 24),new ArrayList<>(Arrays.asList(t0,t1,t2)), new ArrayList<>(Arrays.asList(s2,s4,s6,s7)),new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6)));
   
   ArrayList<Course> allCourses = new ArrayList<>(Arrays.asList(c1,c2,c3,c4));
   ArrayList <Student> studentsOnCourses=new ArrayList<>(); 
}
   