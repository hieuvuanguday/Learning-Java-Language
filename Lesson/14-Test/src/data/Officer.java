package data;

public abstract class Officer extends Staff{
    protected int productPerMonth;

    public Officer(String id, String name, int yob, String gender,
                int salaryBase, int productPerMonth) {
        super(id, name, yob, gender, salaryBase);
        this.productPerMonth = productPerMonth;
    }
}