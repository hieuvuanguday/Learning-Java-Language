package runtime;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    //  1.Regex: regular expression | (pattern) | 
        //         biểu thức chính phương (tên tiếng việt)(là 1 cái mẫu)
        //thay vì mình phải kt 1 chuỗi cụ thể nào đó
        //mình có parem chung để biết nó có hợp lệ k
        //vd: email
        //âsasasas@âssaa.sdsds
        //vd: fullName
        // chữ đầu viết hoa, sau dấu cách viết hoa
        //regex là những cái chuẩn bắt code làm theo
        
        //vd: kiểm tra 1 chuỗi xem:
        //tao muốn chuỗi đó phải có 1 đến nhiều từ, từ cuối phải là "name"
//        String regex1 = "\\w[ \\w]+name"; // cái này bên JS
//        String str = "Quan is my name";
//        System.out.println(str.matches(regex1));//nếu chữ cuối là name thì trả true ngược lại trả false
        //ignoreCase: (?i) 
        //System.out.println(checkString("name", "name"));
        //System.out.println(checkString("Name", "name"));//như này thì k đc
        //(?i) tức là ignore bỏ qua viết hoa viết thường
        //System.out.println(checkString("NaMe", "(?i)name"));//có ignore thì đúng
    
    //  2.Regex metcharacter symbols: các kí tự đặc biệt
        //kí tự bất kì: . dấu chấm
        //System.out.println(checkString("a", "."));//true//nghĩa là dấu . đại diện 1 kí tự bất kì
        //System.out.println(checkString("ab", "."));//false//ab 2 kí tự mà 1 chấm là sai//nhiều chấm hơn kí tự cũng sai
        //System.out.println(checkString("ab", ".(b)"));//true như này vẫn đc//space cũng là 1 kí tụ
        //xuất hiện từ 0 đến nhiều lần: * dấu sao
        System.out.println(checkString("y", "m*y"));//true
        System.out.println(checkString("my", "m*y"));//true
        System.out.println(checkString("mmmmmmy", "m*y"));//vẫn là true
        System.out.println(checkString("ey", "m*y"));//false
        System.out.println(checkString("mememey", "(me)*y"));//true
        //trước * thì có hay k đều đc nhưg có thì phải giống kí tự trc *
        //sau * thì bắt buộc phải có
        System.out.println(checkString("memehahay", "(me).*y$"));//true
        //nghĩa là trc có me hoặc k đều đc tiếp đến là .* kí tự gì cũng đc có hoặc k đầu đc
        //và phải có y ở cuối cùng
        //nếu ko có ngoặc là chỉ me*y thì m và y là phải có 1 lần đúng vị trí còn e có hay k lặp bao nhiêu đều đc
        //dấu $ ví dụ ban, ban thì tìm ban$ nó chỉ bắt chữ ban sau k bắt chữ trc
        //lên mạng tìm regex101 là công cụ để viết
        
        //bắt khởi đầu và kết thúc
        //khởi đầu là ^ | kết thúc là dấu $
        //vdu: muốn có hello ở đầu
        //System.out.println(checkString("Hello ban oi", "^Hello.*"));//dấu * có nghĩa là có nhiều hay ít cũng đc
        String str = "Ban that dep, toi thich ban";
        str = str.replaceAll("(?i)ban", "Diep");//nếu muốn sửa thg cuối thì thêm $ vào sau 
        System.out.println(str);//muốn sửa thg đầu thôi thì thêm ^ vào đầu
        //tìm dấu chấm câu là \. còn . k thì là kí tự bất kì
    //  3. set các kí tự: [ ] bỏ các kí tự trong [ ]
        //vd m[mna]e thì m 1 trong 3 kí tự trong [ ] và e cuối là đúng
        //chỉ 1 trong các kí tự trong [ ] thôi nhiều hơn là sai
        //còn muốn lấy hết thì bỏ trong ()
        //nếu thê ^ vào trong [ ] nghĩa là lấy những thằng khác thg trong [ ]
        //có thể kết hợp [(co)(khong)] như này cũng đc
     
    //  khớp các kí tự dãy 
        //còn muốn bắt viết thường thì m[a-z]y là chỉ đc lấy chữ thường
        //còn muốn thường hoa đều đc thì m[a-zA-Z]y
        //còn muốn số thì m[0-9]y
        
    //  kiểm soát số lần xuất hiện của kí tự
        //vd m{1,5}ay
        //nghĩa là chữ m xuát hiện ít nhất 1 nhiều nhất 5 lần ngoài số đó sai
        //dấu * là 0 hoặc nhiều lần tương đương với {0,}
        
    // hoặc: |
        //vd tui(co|khong)gay là tui co gay true và tui khong gay true nhung tui co khong gay false  
       
    //  2.3 bộ thay thế
    //  \w thay cho dấu . 
    //  \w đại diện chữ và số k lấy kí tự đặc biệt
    //  . đại diện cho bất kì kí tự nào 
    //  dấu + thay cho *
    //  dấu sao là số lần xuất hiện từ 0 đến vô tận 
    //  dấu + là 1 đến vô tận
    //  dấu ? là có 1 lần hoặc không tương với {0,1}
    //  \w+ có 1 hoặc nhiều chữ hoặc số
    //  \W 1 kí tự k phải chữ và số
    //  \d là 1 số bất kì
    //  \D là 1 kí tự khác số
    //  \s dấu cách
    //  \S 1 kí tự khác dấu cách
    
//  ví dụ bài tạo pattern ép ng dùng nhập tên của mình
//  Lê Hồ Điệp
// nhập vào ký tự đầu của mỗi từ phải viết hoa
//          le Ho Diep (sai)
//          lE hO Diep (sai)
//          Diep (đúng) | Lê Hồ Điệp(đúng)
//nhập trên cái regex101 rồi copy lại bỏ vào pattern
        System.out.println(checkString("Le Ho Diep", "^[A-Z]([a-z])+(\\s[A-Z]([a-z])+)*"));
    //như này thì là bắt buộc chữ đầu tiên của chuỗi viết hoa
    //những chữ sau đó thường sau đó dấu cách rồi lại như cũ nhưng có cũng đc k cũng đc
        System.out.println(checkString("Diep", "(?i)^SE\\d{9}"));//Bắt buộc 2 chữ đầu là se hoa thường đều đc và tiếp đến là 9 kí tự số
    //@@Try Catch
    //error compilation: lỗi trong quá trình biên dịch
        //vd: int a = 10 lỗi thiếu ;
        //lỗi syntax do mình tạo ra
        
    //error in runtime: lỗi phát sinh trong quá trình sử dụng
        //muốn nhập vào 1 số nguyên
        //scanf bên c 
        //trong java mình có 1 class chuyên dùng để nhập
        //đó là class Scanner chuyên tạo ra các bộ máy giúp ta nhập
    //sc là 1 object có rất nhiều method phục vụ việc nhập
        Scanner sc = new Scanner(System.in);
        boolean demo = true;
    try{//trong phạm vi của try thì lỗi k ngừng chương trình mà sẽ chạy code
        //trong try
            System.out.println("Nhập tuổi đi: ");
            int age = sc.nextInt();
            //khi ng dùng nhập lỗi thì ct lập tức ngưng lại
            //phải dùng try catch để thông báo cho chương trình
            if(age >= 100){
                throw new Exception();
            }
            System.out.println("Tuổi là: " +age);
        }catch(Exception e){
            System.out.println("Mày biết nhập số nguyên không?");
            demo = false;
        }finally{//dùng trong try là đúng hoặc sai thì vẫn chạy finally
            demo = true;//khi này thì nhập sai nhưng demo vẫn bị ép là true
            //trc sau cũng demo = true thì mình gán demo = true ở cuối cũng đc
            //nhưng sẽ có ng yêu cầu để đầy đủ nên phải học để biết
        }
        System.out.println("demo = " +demo);
        System.out.println("Kết thúc!");
    }
    public static boolean checkString(String str, String regex){//để boolean là trả lại true/false
        return str.matches(regex);//matches là kt có giống có khớp hay k
        
    }
}