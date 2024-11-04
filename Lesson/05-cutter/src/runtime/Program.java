package runtime;
//bây giờ anh muốn quản lý 
//danh sách các hình tam giác

import data.RightTriangle;
import data.Triangle;

//tam giác vuông
//tam giác đều
//tam giác thường
public class Program {
    public static void main(String[] args) {
        //tạo tam giác thường
        Triangle tr1 = new Triangle(3, 7, 5);
        //tạo tam giác vuông
        RightTriangle tr2 = new RightTriangle(3, 9);
        //mảng không co giãn
        Triangle trList[] = new Triangle[2];
        trList[0] = tr1;
        trList[1] = tr2;
        
        //for(int i = 0; i <= trList.length - 1; i++){
        //    trList[i].showProfile();
        //}
//for each
        for (Triangle item: trList) {
            item.showProfile();
        } 
    }      
}