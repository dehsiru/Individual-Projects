package privateschool;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;
    private ArrayList<Trainer> trainersPerCourse;
    private ArrayList<Student> studentsPerCourse;
    private ArrayList<Assignment> assignmentsPerCourse;
    
    public Course(String title, String stream, String type, LocalDate start_date, LocalDate end_date, ArrayList<Trainer> trainersPerCourse, ArrayList<Student> studentsPerCourse, ArrayList<Assignment> assignmentsPerCourse) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
        this.trainersPerCourse= trainersPerCourse;
        this.studentsPerCourse= studentsPerCourse;
        this.assignmentsPerCourse=assignmentsPerCourse;
    }

    public ArrayList<Assignment> getAssignmentsPerCourse() {
        return assignmentsPerCourse;
    }

    public void setAssignmentsPerCourse(ArrayList<Assignment> assignmentsPerCourse) {
        this.assignmentsPerCourse = assignmentsPerCourse;
    }

    
    public ArrayList<Student> getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public void setStudentsPerCourse(ArrayList<Student> studentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
    }

    public ArrayList<Trainer> getTrainersPerCourse() {
        return trainersPerCourse;
    }

    public void setTrainersPerCourse(ArrayList<Trainer> trainersPerCourse) {
        this.trainersPerCourse = trainersPerCourse;
    }
    
    public String getTitle() {
        return title;
    }
    public String getStream() {
        return stream;
    }
    public String getType() {
        return type;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
    public void setType(String type) {
        this.type = type;
    }
    public LocalDate getStart_date() {
        return start_date;
    }
    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }
    public LocalDate getEnd_date() {
        return end_date;
    }
    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
    
    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }

    

}