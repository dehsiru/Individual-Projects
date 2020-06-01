package functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.Trainer;

public class GetDataFromDB {
    
    
    public static ArrayList<Student> getStudentsFromDB(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("select * from students");
        ArrayList<Student> arrayListOfStudents = new ArrayList<>();
        int id;
        String firstName;
        String lastName;
        String dateOfBirth;
        double tuitionFees;
        
        while (result.next()) {
            id = result.getInt("st_id");
            firstName = result.getString("st_firstname");
            lastName = result.getString("st_lastname");
            dateOfBirth = result.getString("st_dateofbirth");
            tuitionFees = result.getDouble("st_tuitionfees");
            arrayListOfStudents.add(new Student(id, firstName, lastName, dateOfBirth, tuitionFees));
        }
    
        return arrayListOfStudents;
    }
    
    public static ArrayList<Trainer> getTrainersFromDB(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("select * from trainers");
        ArrayList<Trainer> arrayListOfTrainers = new ArrayList<>();
        int id;
        String firstName;
        String lastName;
        String subject;
        while (result.next()) {
            id = result.getInt("tr_id");
            firstName = result.getString("tr_firstname");
            lastName = result.getString("tr_lastname");
            subject = result.getString("tr_subject");
            arrayListOfTrainers.add(new Trainer(id, firstName, lastName, subject));
        }
        return arrayListOfTrainers;
    }
    
    public static ArrayList<Assignment> getAssignmentsFromDB(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("select * from assignments");
        ArrayList<Assignment> arrayListOfAssignments = new ArrayList<>();
        int id;
        String title;
        String description;
        String subDateTime;
        double oralmark;
        double writtenmark;
        double totalmark;
        
        while (result.next()) {
            id = result.getInt("as_id");
            title = result.getString("as_title");
            description = result.getString("as_description");
            subDateTime = result.getString("as_subdatetime");
            oralmark = result.getDouble("as_oralmark");
            writtenmark = result.getDouble("as_writtenmark");
            totalmark = result.getDouble("as_totalmark");
            arrayListOfAssignments.add(new Assignment(id, title, description, subDateTime, oralmark, writtenmark, totalmark));
        }
        return arrayListOfAssignments;
    }
    
   
       public static ArrayList<Course> getCoursesFromDB(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("select * from courses");
        ArrayList<Course> arrayListOfCourses = new ArrayList<>();
        int id;
        String title;
        String stream;
        String type;
        String start_date;
        String end_date;
        while (result.next()) {
            id = result.getInt("cs_id");
            title = result.getString("cs_title");
            stream = result.getString("cs_stream");
            type = result.getString("cs_type");
            start_date = result.getString("cs_startdate");
            end_date = result.getString("cs_enddate");
            arrayListOfCourses.add(new Course(id, title, stream, type, start_date, end_date));
        }
        return arrayListOfCourses;
    }
       
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
   