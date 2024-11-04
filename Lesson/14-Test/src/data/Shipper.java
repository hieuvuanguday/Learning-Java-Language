package data;

public class Shipper extends Worker{
    private String modelMotor;
    public static final int MONEY_PER_OVERTIME = 27_000;//7k tiền xăng :))

    public Shipper(String id, String name, int yob, String gender,
            int salaryBase, int overTime, String modelMotor) {
        super(id, name, yob, gender, salaryBase, overTime);
        this.modelMotor = modelMotor;
    }

    @Override
    public int getSalary() {
        return salaryBase + (overTime * MONEY_PER_OVERTIME);
    }

    @Override
    public void showInfor() {
        String str = String.format("|%-10s|%-15s|%4d|%-3s|%5d|%-15s|%9d",
                                    id, name, yob, gender, overTime, modelMotor, getSalary());
        System.out.println(str);
    }
    
    
    
}