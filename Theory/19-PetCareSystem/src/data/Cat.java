package data;

public class Cat extends Pet {
    private String ribbon;

    public Cat(String id, String owner, String color,
               double weight, String ribbon) {
        super(id, owner, color, weight);
        this.ribbon = ribbon;
    }
    //Getter | Setter
    public String getRibbon() {
        return ribbon;
    }
    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public void showInfor(){
        String str = String.format("%4s|%10s|%10s|%6.2f|%s", 
                                   id, owner, color, weight, ribbon);
        System.out.println(str);
    }
    
    
}
