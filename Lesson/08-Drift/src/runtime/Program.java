package runtime;

import data.Rectangle;
import data.Square;

public class Program {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle("Tía","Hồng",1 ,2);
       Rectangle s1 = new Square("Má","Vàng", 2);
       Square s2 = new Square("Con","Đỏ", 3);
       r1.showInfo();
       s1.showInfo();
       s2.showInfo();
       //s1.d//nhưng lúc . thì nó không có draw()
       //draw là method riêng của con
       //vì khi mình khai cha thì dây con trỏ bị ngắn, không trỏ tới được
       //nhưng mà giờ mình cố chấp
       //mình muốn trỏ vào đồ riêng của Square
    //Cách 1: biến tạm
       Square tmp = (Square)s1;
       tmp.draw();
    //Cách 2: viết rút ngắn của cách này, không giùm biến tạm
       ((Square)s1).draw();
    }
}
