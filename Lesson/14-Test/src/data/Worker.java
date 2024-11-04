package data;

public abstract class Worker extends Staff{
    protected int overTime;

    public Worker(String id, String name, int yob, String gender,
                int salaryBase, int overTime) {
        super(id, name, yob, gender, salaryBase);
        this.overTime = overTime;
    } 
}