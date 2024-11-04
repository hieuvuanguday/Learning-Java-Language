//extends là mở rộng, dùng cho cha con
//implement là làm rõ, bổ sung code thiếu, phát triển nó lên, dùng cho hội nhóm
package data;

public class Dog extends Pet{
    private String necklace;

    public Dog(String id, String owner, String color,
               double weight, String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }
    //Getter | Setter
    public String getNecklace() {
        return necklace;
    }

    public void setNecklace(String necklace) {
        this.necklace = necklace;
    }
    
    @Override
    public void showInfor(){
        String str = String.format("%4s|%10s|%10s|%6.2f|%s", id, owner, color, weight, necklace);
        System.out.println(str);
    }
}
