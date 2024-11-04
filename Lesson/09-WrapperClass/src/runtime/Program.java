package runtime;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //tạo biến bính thường
        int numInt = 10;
        //đây là một biến primitive, 4 byte
        //numInt.//điên hả m, ít tiền mà đòi hít
        //numInt là biến nguyên thủy, nó không có gì hết, không có method đi kèm
        //tạo ra 1 object từ WrapperClass
        Integer numInteger = new Integer(10);//auto-Boxing
        //dùng WrapperClass tạo ra ob tên numInteger
        //có core(lõi) là một primitive variable
        //Hao RAM, cần biến tham chiếu
        //Ngoài tạo ra object Wrapper như trên
        Integer numInteger2 = 10;//gói con 10 vào object
        System.out.println("numInt = "+ numInt);
        System.out.println("numInteger = "+ numInteger);
        //lập tức tự mò tới method để in ra 
        //numInteger.toString
        
        System.out.println(numInteger == numInteger2);
        //không so sánh như này đc vì object là con trỏ
        //mà con trỏ là địa chỉ
        //mình đang so sánh 2 địa chỉ với nhau
        System.out.println(numInteger.equals(numInteger2));//so sánh 2 thg có bằng hay k trả lời true hay false
        System.out.println(numInteger.compareTo(numInteger2));
        //compareTo hỏi a so với b thì sao -1 0 1
        
        int numInt2 = numInteger;//nhờ cơ chế auto-unboxing thì chỗ này tự lôi core ra là nó tự lấy giá trị 10 chứ k lấy địa chỉ
        //      primitive auto-unboxing
        //demo cơ chế xóa buffer
        
        
        //nhập số nguyên đích thực, nhập sai thì chửi, ép nhập lại (ví dụ ở bài try catch)
        int number;
        //Scanner là bộ nhập
        Scanner sc = new Scanner(System.in);
        while(true){//bắt nó nhập lại liên tục
            try{
                System.out.println("Nhập số nguyên đi: ");
                number = Integer.parseInt(sc.nextLine());//muốn xài Wrapper nhưng k muốn tạo
                //nếu dùng nextInt thì gặp char nó sẽ bị rớt vào buffer và làm trôi lệnh
                //làm giống như này thì k trôi lệnh và k cần tạo wrapper
                //sc.nextLine nhận vào 1 chuỗi thg parseInt sẽ ép thành số nếu lỗi thì thg catch nó bắt còn nếu k thì nó rớt vào buffer là lỗi liên tục luôn
                break;
            }catch(Exception e){
                System.out.println("Ngu!!! Nhập lại !!!");
            }
        }
    }
}
