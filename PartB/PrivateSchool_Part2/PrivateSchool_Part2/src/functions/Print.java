package functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import privateschool.Student;


public class Print {

    public static <Χ> void printAll(ArrayList <Χ> all){
        
        for (int i = 0; i < all.size(); i++) {
            System.out.println((i+1)+". " +all.get(i));
        }
        all.clear();
        System.out.println("____________________________________________________________________________");
    }
    
    
    public static void printStudentsPerCoursesfromDB(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT s.st_firstname, s.st_lastname, c.cs_title, c.cs_stream, c.cs_type\n" +
                                           "FROM students as s, courses as c, students_per_course as spc\n" +
                                           "WHERE s.st_id = spc.student_id AND c.cs_id = spc.course_id\n" +
                                           "ORDER BY c.cs_stream,cs_type;" );
        String firstname;
        String lastname;
        String title;
        String stream;
        String type;
        
        while (result.next()) {
            firstname = result.getString("st_firstname");
            lastname = result.getString("st_lastname");
            title = result.getString("cs_title");
            stream = result.getString("cs_stream");
            type = result.getString("cs_type");
            System.out.printf(" The student %s %s is on %s course with %s stream!\n", firstname, lastname, title, stream, type);
        }
        System.out.println("____________________________________________________________________________");
    } 
    
    public static void printTrainersPerCourses(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT t.tr_firstname, t.tr_lastname, t.tr_subject, c.cs_title, c.cs_stream, c.cs_type\n" +
                                           "FROM trainers as t INNER JOIN trainers_per_course\n" +
                                           "ON t.tr_id = trainers_per_course.trainer_id INNER JOIN courses as c \n" +
                                           "ON c.cs_id = trainers_per_course.course_id\n" +
                                           "ORDER BY cs_stream;");
        
        String firstname;
        String lastname;
        String subject;
        String title;
        String stream;
        String type;
        while (result.next()) {
            firstname = result.getString("tr_firstname");
            lastname = result.getString("tr_lastname");
            subject = result.getString("tr_subject");
            title = result.getString("cs_title");
            stream = result.getString("cs_stream");
            type = result.getString("cs_type");
            System.out.printf("The trainer %s %s is instructing %s on %s course with %s stream!\n", firstname, lastname, subject, title, stream, type);
        }
        System.out.println("____________________________________________________________________________");
    }
    
    public static void printAssignmentsPerCourse(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT GROUP_CONCAT(DISTINCT assi.as_title) as Assignments_Titles, GROUP_CONCAT(assi.as_description) as Assignments_Descriptions, c.cs_title as CourseTitle, c.cs_type as CourseType , c.cs_stream as Stream\n" +
                                           "FROM courses as c, assignments as assi, assignments_per_student_per_course as apspc\n" +
                                           "WHERE c.cs_id=apspc.course_id AND assi.as_id=apspc.assignment_id \n" +
                                           "GROUP BY cs_title;");
        String title;
        String stream;
        String type;
        String assignmentsTitles;
        String assignmentsDescriptions;
       
        while (result.next()) {
            assignmentsTitles = result.getString("Assignments_Titles");
            assignmentsDescriptions = result.getString("Assignments_Descriptions");
            title = result.getString("CourseTitle");
            type = result.getString("CourseType");
            stream = result.getString("Stream");
            System.out.printf("The %s course with %s stream has these assignements: %s \n", title, stream,assignmentsTitles );
        }
        System.out.println("____________________________________________________________________________");
    }
    
     public static void printAssignmentsPerCoursePerStudent(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT  assi.as_title, c.cs_title , c.cs_type , s.st_firstname , s.st_lastname\n" +
                                           "FROM courses as c, assignments as assi, students as s, assignments_per_student_per_course as apspc\n" +
                                           "WHERE s.st_id = apspc.student_id AND c.cs_id = apspc.course_id AND assi.as_id=apspc.assignment_id\n" +
                                           "ORDER by c.cs_title");
        String assignmentTitle;

        String firstname;
        String lastname;
        String title;
        String stream;
        String type;
        String assignmentsDescriptions;
        while (result.next()) {
            assignmentTitle = result.getString("assi.as_title");
            title = result.getString("cs_title");
            type = result.getString("cs_type");
            firstname = result.getString("st_firstname");
            lastname = result.getString("st_lastname");
            System.out.printf("The student %s %s on %s course has the %s! \n", firstname, lastname, title,assignmentTitle);
        }
        System.out.println("____________________________________________________________________________");
    }
     
      public static void printStudentsThatBelongToMoreThanOneCourse(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT s.st_firstname, s.st_lastname,COUNT(spc.student_id) as Courses\n" +
                                            "FROM students_per_course as spc\n" +
                                            "LEFT JOIN students as s\n" +
                                            "On spc.student_id = s.st_id\n" +
                                            "GROUP BY spc.student_id HAVING COUNT(spc.student_id)>1 ;");
        String firstname;
        String lastname;
        int courses=0;
        while (result.next()) {
            firstname = result.getString("st_firstname");
            lastname = result.getString("st_lastname");
            courses = result.getInt("Courses");
            System.out.printf("The student %s %s is attending %s courses!\n", firstname, lastname, courses);
            if(courses==1){
                System.out.println("We dont have students that belongs to more than one courses yet!");
            }
        }
        
        System.out.println("____________________________________________________________________________");
    }


}
