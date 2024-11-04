package data;
//động vật ăn cỏ
public abstract class Herbivore {
    protected String name;
    protected int yob;
    protected double weight;
    //constructor
    public Herbivore(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    //getter|setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //mỗi một Herbivore có cách học khác nhau
    //con ngựa thì cười hí hí
    //con thỏ vừa học vừa nhảy
    //con khỉ học theo kiểu bắt chước - mimic
    //có hàm tên là study -> abstract
    public abstract double study();
    //vì cách học khác nhau nên mỗi con sẽ đem về kết quả học khác nhau
    public abstract void showLearningOutCome();
    
}
