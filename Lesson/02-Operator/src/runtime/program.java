package runtime;

public class program {
    public static void main(String[] args) {
        /*
        Operator: toán tử
        có ít nhất 10 loại toán tử trong Java
        Arithmetic Operator: Toán tử toán hạng
            + | - | * | / | % | ++ | -- |  *= | /= | += | -= 
            ngoài ra + còn dùng để nối chuỗi 
        */
        int a = 5;
        int b = a++ + ++a - a-- - --a;
        System.out.printf("Kết quả = %d\n", b);
        /*Assignment Operator: phép gán*/
        b = 20;
        //Comparison Operator: so sánh
        System.out.println("Kết quả là " +(2 == '2'));
        /*
        == | != | < | > | >= | <= 
        */
        //Conditional Operator: Toán tử 3 ngôi
        //có 2 biến chưa 2 số nguyên
        //Tìm số lớn nhất
        int num1 = 2;
        int num2 = 5;
        int max = num1 > num2 ? num1 : num2;
        System.out.println("Kết quả = " +max);
        
        //Logical Operator: And(&&) và Or(||) và !(phủ định)
        System.out.println(!true);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        //String Operator: chuỗi
        //Comma: phẩy
        //Unary: toán tử 1 ngôi
        //Relational: Toán tử quan hệ
        
        //bitwise: toán tử bit
        //Shift: Dịch bit
        //SHift left và shift right
        
        int number = 8;
        number = number >> 2;
        //8 >> n == 8/(2^n)
        //8 << n == 8*(2^n)
        System.out.println("Kết quả : " +number);
        
        /*
            bitwase(&, |, ^, ~) chỉ áp dụng với bit
            &: giống nhân 1 & 1 = 1, còn lại thì 0
            !: có 1 thì phép toán sẽ là 1
            ^: 2 số khác nhau ra 1, giống ra 0
            ~: not, đổi ngược thôi
        */
    }
}
