package data;

import java.util.Random;

public class Hunter {
    private String name;
    private int yob;
    private double weight;
    private String gear;
    //do mải mê nhìn anh "phò mã" mà Hunter học hành mất tập trung
    public static final double RECEPTIVE = 50;

    public Hunter(String name, int yob, double weight, String gear) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.gear = gear;
    }

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
    public String getGear() {
        return gear;
    }
    public void setGear(String gear) {
        this.gear = gear;
    }
    
    public double study(){
        return new Random().nextDouble() * RECEPTIVE;
    }
    public void showLearningOutCome() {
        String str = String.format("HUNTER    |%-15s|%4d|%6.2f|%5.2f|%-20s", name, yob, weight, study(), gear);
        System.out.println(str);
    }
}

