package data;
//Một con pet có các thuộc tính
//id, owner, color, weight, có method showInfor
//dog: necklace
//cat: ribbon
public abstract class Pet {
    protected String id;
    protected String owner;
    protected String color;
    protected double weight;

    public Pet(String id, String owner, String color, double weight) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.weight = weight;
    }
    //getter | setter

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract void showInfor();
}
