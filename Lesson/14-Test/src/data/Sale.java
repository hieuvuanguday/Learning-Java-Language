package data;

public class Sale extends Officer{
    private String laptopBrand;
    public static final int MONEY_PER_PRODUCT = 5000;

    public Sale(String id, String name, int yob, String gender,
            int salaryBase, int productPerMonth, String laptopBrand) {
        super(id, name, yob, gender, salaryBase, productPerMonth);
        this.laptopBrand = laptopBrand;
    }
  
    @Override
    public int getSalary() {
        if(productPerMonth < 100){
        return salaryBase + (productPerMonth * MONEY_PER_PRODUCT); 
        }
        return salaryBase + (productPerMonth *(MONEY_PER_PRODUCT + 2000));
    }

    @Override
    public void showInfor() {
        String str = String.format("|%-10s|%-15s|%4d|%-3s|%5d|%-15s|%9d",
                                    id, name, yob, gender, productPerMonth, laptopBrand, getSalary());
        System.out.println(str);
    }
    
}