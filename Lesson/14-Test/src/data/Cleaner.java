package data;

public class Cleaner extends Worker{
    private String tool; 
    public static final int MONEY_PER_OVERTIME = 20_000;

    public Cleaner(String id, String name, int yob, String gender,
                int salaryBase, int overTime, String tool) {
        super(id, name, yob, gender, salaryBase, overTime);
        this.tool = tool;
    }

    
    @Override
    public int getSalary() {
        return salaryBase + (overTime * MONEY_PER_OVERTIME);
    }

    @Override
    public void showInfor() {
        String str = String.format("|%-10s|%-15s|%4d|%-3s|%5d|%-15s|%9d",
                                    id, name, yob, gender, overTime, tool, getSalary());
        System.out.println(str);
    }
    
}