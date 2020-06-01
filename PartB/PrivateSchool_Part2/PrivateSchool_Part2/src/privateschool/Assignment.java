package privateschool;
import java.time.LocalDate;

public class Assignment {

private int id; 
private String title; 
private String description;
private String subDateTime; 
private double oralMark; 
private double writtenMark;
private double totalMark;
private int course_id;

   

    @Override
    public String toString() {
              
    return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", writtenMark=" + writtenMark + ", totalMark=" + totalMark +  '}';
    }
    
    
    public Assignment(int id, String title, String description, String subDateTime,double writtenMark, double oralMark,double totalMark ) {
        this.id=id;
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.writtenMark = writtenMark;
        this.oralMark = oralMark;
        this.totalMark=totalMark;
    }


    
}