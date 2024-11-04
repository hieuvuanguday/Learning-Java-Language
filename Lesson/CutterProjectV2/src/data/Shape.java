package data;

public abstract class Shape {
    protected String owner;
    protected String color;
    
    //constructor

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
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
    
    //method
    public abstract double getArea();
    public abstract double getPerimeter();
    
    //showinfor
    public abstract void showInfor();
       
}
