package privateschool;
import java.time.LocalDate;

public class Assignment {

private String title; 
private String description;
private LocalDate subDateTime; 
private double oralMark; 
private double writtenMark;
private double totalMark;

static LocalDate today = LocalDate.now();



    public Assignment(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Assignment(String title, String description, LocalDate subDateTime) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
    }
    
    

    @Override
    public String toString() {
          if(subDateTime.isAfter(today)){
            return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime   +  '}';  
          }      
    return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", writtenMark=" + writtenMark + ", totalMark=" + totalMark +  '}';
    }
    
    
    public Assignment(String title, String description, LocalDate subDateTime, double oralMark, double writtenMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.writtenMark = writtenMark;
        this.totalMark = (oralMark+writtenMark)/2;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public double getWrittenMark() {
        return writtenMark;
    }

    public void setWrittenMark(double writtenMark) {
        this.writtenMark = writtenMark;
    }
    
    
    public void setDateAndWrittenOralMarks(LocalDate subDateTime,double writtenMark,double oralMark) {
        this.subDateTime = subDateTime;
        this.writtenMark = writtenMark;
        this.totalMark = (oralMark+writtenMark)/2;
        this.oralMark = oralMark;
         }
    
}