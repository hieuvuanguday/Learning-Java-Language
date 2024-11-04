package data;

public class Square extends Rectangle{
    
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
    //method của riêng con
    public void draw(){
        System.out.println("Ahihi");
    }
    //độ lại hàm in của cha
    @Override
    public void showInfo(){
        String str = String.format("Square   |%-15s|%-15s|%5.2f|%5.2f|%5.2f|%5.2f", owner, color, width, height, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}
