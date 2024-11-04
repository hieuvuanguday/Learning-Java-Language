package data;

import java.util.Random;



public class Monkey extends Herbivore {
    public static final double RECEPTIVE = 70; 

    public Monkey(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double study() {
        return new Random().nextDouble() * RECEPTIVE;
    }

    @Override
    public void showLearningOutCome() {
        String str = String.format("MONKEY    |%-15s|%4d|%6.2f|%5.2f", name, yob, weight, study());
        System.out.println(str);
    }
}
