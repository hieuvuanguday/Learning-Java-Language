package runtime;

import java.util.StringTokenizer;

public class Program {
    public static void main(String[] args) {
        //muốn lưu Họ của anh
        String lastName = new String("Lê");
        //tạo bằng new nên lưu ở eap bình thường
        String tmp = lastName;//tmp tham chiếu
        //đến vùng nhớ của lastName
        String firstName = new String("Điệp");

        lastName = lastName.concat(firstName);//nối
        //code như trên là chưa học bài

        //String là 1 immutable Class
        //immutable Class: Các method không làm thay đổi object 
        //mà sẽ return ra object mới
        System.out.println("lastName = "+ lastName);
        System.out.println("tmp = "+ tmp);

        //StringBuilder và StringBuffer là Mutable
        //Mutable: method ảnh hưởng đến object
        
        StringBuilder lastName2 = new StringBuilder("Lê");
        StringBuilder tmp2 = lastName2;
        StringBuilder firstName2 = new StringBuilder("Điệp");
        lastName2.append(firstName2); 
        System.out.println("lastName2 = "+ lastName2);
        System.out.println("tmp2 = "+ tmp2);
        
        //StringTokenizer
        String infomation = "SE130257|Điệp Lê|2003|10.0";//POOL
        StringTokenizer st = new StringTokenizer(infomation, "|");
        System.out.println("infomation = "+ infomation);
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());//băm và return khúc bị băm
            
        }
        System.out.println(st.countTokens());
        System.out.println("st = "+ st);
        System.out.println("infomation = "+ infomation);
        
        //timg hiểu method trong String
        checkStringMethod();
    }
    public static void checkStringMethod(){
        //khi chơi với String phải để ý method return cái gì
        //vì String nó là immutable, và nếu như nó return về 1 String
        //điều đó có nghĩa là nó có thể '.' tiếp được
        String str1 = "Điệp";
        System.out.println(str1.toUpperCase().toLowerCase());
        System.out.println(str1);
        str1 = str1.toUpperCase().toLowerCase();
        System.out.println(str1);
        //nối chuỗi: + | .concat()
        str1 = "Điệp";
        String str2 = "Đẹp trai";
        str1 = str1 + str2;
        System.out.println("str1 = "+ str1);
        //.length() lấy độ dài
        //tìm chuỗi trong chuỗi .indexOf()
        str1 = "Điệp đẹp trai quá";
        str2 = "đẹp";
        int pos = str1.indexOf(str2);
        System.out.println("pos = "+ pos);
        
        //charAt// return ra ký tự ở vị trí nào đó
        char ch = str1.charAt(pos);//đ
        System.out.println("ch = " +ch);//5
        //contains: tìm xem có tồn tại không
        str1 = "Điệp đẹp trai";
        str2 = "đẹp";
        boolean isFind = str1.contains(str2);//true
        System.out.println("isFind = " +isFind);
    }
    public static void comparisionString(){
        String s0 = new String("ĐIỆP ĐẸP TRAI");
        String s1 = "ĐIỆP ĐẸP TRAI";
        String s2 = "ĐIỆP ĐẸP TRAI";
        String s3 = "điệp đẹp trai";
        String s4 = new String("ĐIỆP ĐẸP TRAI");
        String s5 = new String("ĐIỆP ĐẸP TRAI");
        
        System.out.println(s2 == s3);
        //tạo bằng pool thì giá trị bằng nhau sẽ trỏ cùng 1 vùng nhớ
        
        //muốn so sánh object thì không dùng ==, như vậy là so sánh địa chỉ
        
        //phải so sánh thông qua method
        System.out.println(s4.equals(s5));//true/false
        System.out.println(s4.equalsIgnoreCase(s5));//không quan tâm hoa thường
        System.out.println(s4.compareTo(s5));//-1 0 1
        System.out.println(s4.compareToIgnoreCase(s5));//không quan tâm hoa thường
    }
}
