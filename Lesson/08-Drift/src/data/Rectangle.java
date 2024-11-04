package data;

public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    protected double height;
    //comstructor

    public Rectangle(String owner, String color, double width, double height) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    //getter - setter
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
    
    //method
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return (width + height)*2;
    }
    //Show in4
    public void showInfo(){
        String str = String.format("Rectangle|%-15s|%-15s|%5.2f|%5.2f|%5.2f|%5.2f", owner, color, width, height, getArea(), getPerimeter());
        System.out.println(str);
    }
}
