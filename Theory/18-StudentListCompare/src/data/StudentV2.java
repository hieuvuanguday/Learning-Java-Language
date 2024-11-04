package data;

public class StudentV2 implements Comparable<StudentV2>{
    private String id;
    private String firstName;
    private String lastName;
    private double score;

    public StudentV2(String id, String firstName, String lastName, double score) {
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

    @Override
    public int compareTo(StudentV2 that) {
        //this: chính nó so sánh với ai đó là that
        if(this.getId().compareTo(that.getId()) > 0) return 1;//nghĩa là this so sánh với that | this là thg ban đầu that là thg bị so sánh
        return -1;
    }
}