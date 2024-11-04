package data;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle(String owner, String color, double width, double height) {
        super(owner, color);
        this.width = width;
        this.height = height;
    }

    

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void showInfor() {
        String str = String.format("Rectangle| %-15s| %-15s| %5.2f| %5.2f| %5.2f| %5.2f",
                owner, color, width, height, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}