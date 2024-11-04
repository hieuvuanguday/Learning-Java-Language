package data;

public class StudentV1 {
    private String id;
    private String firstName;
    private String lastName;
    private double score;

    public StudentV1(String id, String firstName, String lastName, double score) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public void showInfor(){
        String str = String.format("%10s|%15s|%15s|%5.2f", 
                                id, firstName, lastName, score);
        System.out.println(str);
    }
}