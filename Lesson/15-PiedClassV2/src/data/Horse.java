package data;

import java.util.Random;

public class Horse extends Herbivore implements StudyEnthusiasts{
    //ngựa lúc học  toàn cười hí hí hí, nên tiếp thu kém
    //cao nhất là 30s
    public static final double RECEPTIVE = 30;
    //con ngựa này đặc biệt, khác khỉ
    //có yên
    private String colorSaddle;//màu của yên ngựa
    //constructor
    public Horse(String name, int yob, double weight, String colorSaddle) {
        super(name, yob, weight);
        this.colorSaddle = colorSaddle;
    }
    
    @Override
    public double study() {
        Random rd = new Random();
        return rd.nextDouble()*RECEPTIVE;
    }

    @Override
    public void showLearningOutCome() {
        String str = String.format("HORSE     |%-15s|%4d|%6.2f|%5.2f|%s", name, yob, weight, study(), colorSaddle);
        System.out.println(str);
    } 

    @Override
    public double studyHard() {
        return study()*1.5;
    }

    @Override
    public void showProfile() {
        String str = String.format("HORSE     |%-15s|%4d|%6.2f|%5.2f|%s", name, yob, weight, studyHard(), colorSaddle);
        System.out.println(str);
    }
}
//về làm tiếp giúp anh monkey
//và muốn sức tiếp thu của nó 70%
//Làm Hunter
//khỉ sợ bị bắn hơn đi học nên không đủ tư cách tham gia

//mấy thg collection thì tự co giãn, k cần size
//thg arraylist thì nó chỉ thêm 1 vài ô dự trù để lưu phần tử
//còn vector thì nó sẽ x2 lưu 500 ô nó cho 1000 ô (vector cùi vl)
//arrayList nó có thể truy vấn ngược lại còn vector thì đi không trở lại