package privateschool;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    private int id;
    private String title;
    private String stream;
    private String type;
    private String start_date;
    private String end_date;
   
    
    public Course(int id, String title, String stream, String type, String start_date, String end_date) {
        this.id=id;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }

    

}