package privateschool;

public class Trainer {
    
    private int id;
    private String firstName;
    private String lastName;
    private String subject;

    public Trainer(int id, String firstName, String lastName, String subject) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }

    
    
}
