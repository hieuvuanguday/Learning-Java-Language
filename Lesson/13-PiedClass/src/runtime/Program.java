/*
    mình có nhiệm vụ phổ cập kiến thức
    cho các loài vật trong hoang dã
    ngày đầu tiên mình đi dạy
    mình được gặp các con vật dễ thương như ngựa, khỉ
*/
package runtime;

import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;

public class Program {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("Abu", 1994, 30);
        Herbivore h1 = new Horse("Rarity", 2015, 9, "none");//pony
        Herbivore h2 = new Horse("Roach", 2019, 170, "Grey");//Witcher
        //bàn riêng về thằng Herbivore
        //trong một ngày lạnh giá
        //tuyết phủ trắng đầu
        //có một con thú nhỏ đi vào
        //vì trời lạnh nên nó mặc đồ kín mít, không biết con gì
        //vô vùng chậm, hiền lành
        //chỉ ăn lá cây, đích thị là động vật ăn chay
        //không biết là con gì
        //mình xác định được là nó ăn cỏ => thuộc về herbivore
        //vì herbivore là absstract nrnr mình không tạo trực tiếp object được
        //nghĩ ngay tới chuyện tạo class trung gian
        //nhưng không biết nó là con gì để tạo class kế thừa
        //=> Sử dụng kỹ thuật Anonymmous
        Herbivore xxx = new Herbivore("Con chậm chạp", 2022, 4) {
            @Override
            public double study() {
                 return 80;
            }
            
            @Override
            public void showLearningOutCome() {
                String str = String.format("XXX       |%-15s|%4d|%6.2f|%5.2f", name, yob, weight, study());
                System.out.println(str);
            }
        };//đừng quên ; ở đây
        //tạo mảng
        Herbivore studentList[] = {m1, m2, h1, h2,xxx};
        //khi mà muốn duyệt mảng từ đầu đến cuối
        //không quan tâm index
        for (Herbivore item : studentList){
            item.showLearningOutCome();
        }
        //lớp học đang vui thì yên tĩnh vì có 1 bạn mới vào
        //vì hôm đó bác thợ săn tới dự giờ
        //Vì anh Điệp đỉnh quá, chửi hay quá
        //sinh lòng ham học, nên đăng ký học chung với khỉ, ngựa
        
        Hunter hun1  = new Hunter("Thợ săn vượn", 1999, 0,"Nỏ");
        Hunter hun2 = new Hunter("Mắt diều hâu", 1999, 0, "Cung");
        
        hun1.showLearningOutCome();
        hun2.showLearningOutCome();
        
    }
}