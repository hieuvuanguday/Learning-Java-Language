package data;

//class cha:
// mối quan hệ kế thừa cha con: is a
//Square is a Rectangle
//ngược lại thì chưa chắc

//trong cha có gì?
//cha cho con hết
//=> cha phải chứa những thứ con dùng được
//cha phải chứ những gì có chung mà các con đều có(cha giữ cái chung của tất cả các con)

public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    protected double height;
    
    //tạo constructor
    public Rectangle(String owner, String color, double width, double height) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    
    //getter/setter

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    //method của class
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    
    //show infor
    
    public void showInfor(){
        String str = String.format("Rectangle| %-15s| %-15s| %5.2f| %5.2f| %5.2f| %5.2f",
                    owner, color, height, width, getArea(), getPerimeter());
        System.out.println(str);     
    }
    
}