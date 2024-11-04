
package runtime;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        //trong java có 2 cách lưu trữ
        //1-primitive datatype: kiểu dữ liệu nguyên thủy
        //dùng 1 lượng nhỏ bộ nhớ để biểu diễn một giá trị
        //  *không thể chia nhỏ được*
        //Đặt tên: cammelCase
        //có 8 loại dữ liệu nguyên thủy
        //1-byte (1 byte) (số nguyên rất nhỏ)
        //2-short (2 byte) (số nguyên hơi nhỏ)
        //3-int (4 byte) (số nguyên nhỏ)
        //4-long (8 byte) (số nguyên lớn)
        //5-float (4 byte) (số thực nhỏ)
        //6-double (8 byte) (số thực lớn)
        //7-char (2 byte) (ký tự có dấu | hỗ trợ Unicode)
        //8-boolean (1 bit | quá nhỏ để chỉ định kích thước) (true/false) 
        //---Chưa học tới
        //Mỗi một primitive nó tương ứng một kiểu tham chiếu gọi là
        //Wrapper Class (Class trai bao)
        //---Lưu ý
        //Khi nói về giá trị mặc định (default value) ở biến primitive
        //Sẽ là 0 (với kiểu số và chữ) *cần lưu ý số thực*
        //Sẽ là false (với boolean)
        char c = 65;
        System.out.printf("c là %c\n", c);
        System.out.println("C là " +c);//line new
        //ta có byte là kiểu dữ liệu mới
        //nó là ỉnt nhưng không được quá giới hạn của 1 byte
        //-128 -> 127
        byte numByte =  127;
        //về float và double
        float numFloat = 123.5f;
        /*Lý do tại sao float cần f|F: vì một con số thực khi được lưu trữ
        nó sẽ mặc định con số đó là double
        mình cần f|F để báo cho java biết*/
        double numDouble = 123.4d;//có D hay không cũng được
        //Khái niệm ép kiểu
        //ta có thể ép từ thấp lên cao
        int numInt = numByte;
        //HackingPrimitive: nâng cao
        /*Java luôn ưu tiên int
        nên nếu ta dùng kiểu dữ liệu long mà bỏ 1 số nhỏ
        thì nó hiểu là int
        ngay cả khi ta bỏ một con số quá lớn nó cũng cho là int thôi
                ->Vậy thì phải đặt thêm l|L vào cuối
        */
        long numLong = 10_000_000_000L;
        int num1 = 0xFA;
        //0x là prefix | tiền tố ám chỉ một con số nguyên
        //nhưng được viết dưới hệ Hexa (16)
        int num2 = 077;//không phải 77
        //là prefix | tiền tố ám chỉ con số nguyên
        //nhưng viết dưới dạng hệ Octal (8)
        
        //2-Reference data type | object data type: tham chiếu
        //Object data type được tạo ra gồm nhiều primitive data type
        //dùng để nêu lên đặc điểm của một object
        //eg: Student thì  primitive datatype (properties)   
        //name(string), year of birth(int), point(float)
        
        
    }
}
