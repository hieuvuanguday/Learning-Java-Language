package runtime;

import data.Star;

public class Program {
    public static void main(String[] args) {
        //tạo ra bức tượng (object) đầu tiên từ khuôn (class) Star
        //đối tượng này là Sơn Tùng
        Star mtp = new Star("Sơn Tùng", 1994, "Hãy Trao Cho Anh");
        //toán tử new: sẽ khởi tạo 1 vùng nhớ lưu object
        //toán tử new la gọi phễu (constructor)
        mtp.showin4();
        //tạo ra Chipu
        Star chiPu = new Star("Nguyễn Thùy Chi", 1993, "Chiếc ố");
        chiPu.showin4();
        
        //Những cái properties mà mình thấy được
        System.out.println("Tên của mtp là: "+ mtp.name);
        //mình dùng object (mtp, chiPu) mà mình gọi ra được 
        //Properties đó là thuộc về Object
        //Method thuộc về Object
        //trong Java, mình phải đáp ứng tính: đóng gói
        //tăng tính bảo mật
        //đầu tiên là nên để private hết 
        //tạo các getter và setter cho thuộc tính đó
        System.out.println("YoB của mtp là: "+ mtp.getYob());
        //muốn fix gái trị
        mtp.setYob(1999);
        System.out.println("YoB của mtp là: "+ mtp.getYob());
        
    }         
}
