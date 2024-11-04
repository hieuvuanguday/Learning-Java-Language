package data;

public abstract class Staff {
    protected String id;
    protected String name;
    protected int yob;
    protected String gender;
    protected int salaryBase;
    
    //constructor

    public Staff(String id, String name, int yob, String gender, int salaryBase) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.salaryBase = salaryBase;
    }
    public Staff() {
    }
    
    //getter/setter

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getSalaryBase() {
        return salaryBase;
    }
    public void setSalaryBase(int salaryBase) {
        this.salaryBase = salaryBase;
    }
    
    //abstract getSalary
    public abstract int getSalary();
    //abstract showInfor
    public abstract void showInfor();
}