package runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        playWithArrayList();//call function trong main
        cpyHacking();
    }
    public static void playWithArrayList(){
        //ArrayList là 1 cái túi hàng hiệu dùng để triển khai
        //các tính năng của thg List interface, đặc điểm của mảng này
        //bản thân của List là 1 interface nên nó cần thông qua class để tạo object giống như abstract class
        //ArrayList là đại diện cho List
        //ArrayList là class triển khai của List Interface
        
        //mảng thường là mảng k co giãn được phải khai báo kích thước khi tạo mảng
        //Integer arrIntPrimitive[] = new Integer[];//cái này ko để số size trong new Integer[] thì lỗi
        //nhược điểm của mảng thường
        //vd khai 10 dùng 5 thì mình sẽ gặp lỗi null pointer exception
        //lỗi thường thấy khi chạy vòng for mà không dùng hết phần tử
        //nếu khai 5 mà dùng 10 thì nó sẽ bị xung đột vùng nhớ
        
        //tìm hiểu về ArrayList Collection
        //cho phép co giãn kích thước nên không cần khai báo kích thước
        ArrayList<Integer> arrIntList = new ArrayList<Integer>();
        List<Integer> arrIntListV2 = new ArrayList<>(); //không cần Integer
        //vì cha khai báo rồi
        //khai cha new con
        
        //collection nó chỉ chơi với object, không chơi với primitive data type
        //object thì thường có kích thước không cố định nên mảng cũng sẻ co giãn theo chúng
        //vì sự co giãn này nên mảng dạng này có tên là dynamic array(mảng động)
        
        //thêm phần tử vào collection: method .add()
        Integer a = new Integer(3);
        arrIntList.add(a);
        arrIntList.add(new Integer(5));
        arrIntList.add(2); //nó vẫn tự hiểu là tạo new Integer(2):-> auto boxing nó tự đóng gói 2 thành object để ném vô array
        System.out.println("ArrayIntList là "+arrIntList);
        //auto toString()
        //ArrIntList là [3, 5, 2]
        
        //xóa hết phần tử trong collection dùng .clear()
        arrIntList.clear();//xóa hết phần tử
        System.out.println("ArrIntList là" +arrIntList);
        
        //..add(index, element): chèn vào vị trí
        //.add(element): thêm phần tử bth
        arrIntList.add(0,3);
        arrIntList.add(1,3);
        arrIntList.add(1,4);//nó chèn vào trước vị trí được chọn tức là 3 4 3 thay vì 3 3 4
        System.out.println("Arr"+arrIntList);
        
        //.addAll(): nhét collection khác vô mảng đang dùng
        arrIntListV2.add(9);
        arrIntListV2.add(19);
        arrIntList.addAll(arrIntListV2);//chèn thêm vào liền sau
        //giờ như này
        arrIntList.addAll(1, arrIntListV2);
        System.out.println("akak"+arrIntList);
        
        //arrayList---
        //rất là nặng so với mảng cùi -> dùng đan xen khi cần xịn thì xịn không thì dùng mảng thường
        //sự đan xen: mảng xịn xử lí nhanh mạnh, mảng cùi xử lí chậm nhưng nhẹ
        //có thể biến mảng cùi thành xịn sau đó xịn thành cùi để tối ưu nhất
        
        //dùng kĩ thuật asList để biến array -> List
        Integer arrDemo[] = {3, 5, 7};//auto boxing
        ArrayList<Integer> arrConverse = new ArrayList<>(Arrays.asList(arrDemo));//bỏ ds vào collection để biến ds thường thành List
        System.out.println("arrConverse là"+ arrConverse);//arrConverse là [3, 5, 7]
        //chuyển List về mảng cùi
        //arrConverse về thành mảng cùi numList
        Integer numList[] = new Integer[arrConverse.size()];//tạo mảng cùi có kích thước của con mảng xịn muốn đổi
        arrConverse.toArray(numList);//chuyển phần tử vào mảng cùi numList
        //mảng cùi không có toString()
        //nên k in theo kiểu
        //System.out.println("jir"+numList);
        //dùng fore thì được
        for (Integer numItem : numList) {
            System.out.println(numItem);
        }
        //--------------------
        //get() truy cập vào phần tử trong list dựa trên gì đó
        System.out.println("arrConverse.get(1) =" + arrConverse.get(1));
        //set() cập nhật lại giá trị
        arrConverse.set(2, 9);//set lại phần tử thứ 2 mang giá trị là 9
        System.out.println("ArrConverse.get(2) =" + arrConverse.get(2));
        //muốn swap 2 phần tử trong list thì làm ntn?
        //swap phần tử 0 và phần tử thứ 2 trong arrConverse
        Integer tmp = arrConverse.get(0);
        arrConverse.set(0, arrConverse.get(2));
        arrConverse.set(2, tmp);
        System.out.println("arrConverse"+arrConverse);
        //-------------------
        //iterable: tính khả duyệt(khả lâp)
        //iterator: là một object định nghĩa 1 trình tự và giá trị
        //có thể trả về tiếp theo trước khi kết thúc thì gọi là iterator
        Iterator<Integer> it = arrConverse.iterator();//khi gọi như này thì sẽ lập tức tạo 1 bộ khả duyệt
        //.hasNext() //trong Collection có còn thằng nào để duyệt không
        System.out.println(it.hasNext());//trả ra true nghĩa là đang có phần tử
        System.out.println(it.next());//nhận được giá trị đầu tiên
        //cứ mỗi lần next thì lôi ra thêm 1 thg nữa
        System.out.println(it.next());
        //.next() đến khi nào hết thì nó trả ra false
        //lúc này .hasNext() cũng ra false
        //hoạt động theo cơ chế HOF: High Order Function
        //bao gồm: Currying, LexcialScoping, CallBackHell ở JS
        
        //.remove(): xóa phần tử theo vị trí
        System.out.println("ArrConverse là"+ arrConverse);//9, 5, 3
        
        arrConverse.remove(0);//xóa phần tử vị trí 0
        System.out.println("ArrConverse là"+ arrConverse);
        
        //.removeAll() | clear() xóa hết
        //.size() lấy ra độ dài
        
        //size là nói về kích thước độ nặng nhiều biến liên kết lại với nhau nên không do chiều dài được
        //length(string, mảng cùi) là độ dài về những thằng gần nhau liền kề nhau
        //for hoặc fore
        //sắp xếp các phần tử trong mảng
        
        //một vài cái method đặc biệt của arrayList
        //clone(); tạo một ArrayList mới có cùng phần tử và kích thước và dung lượng
        
//        ArrayList<Integer> demoClone = arrConverse.clone();//khi dùng như này thì lỗi vì clone không biết clone về thg nào
        ArrayList<Integer> demoClone = (ArrayList)arrConverse.clone();//ép kiểu mới được
        System.out.println("DemoClone ="+demoClone);
        //đây chỉ là shallow copy thôi chứ không phải deep copy
        
        //contain(): tìm kiếm phần tử có tồn tại trong list hay không
        //return: true flase
        
        //notifyCapacity(): chuẩn đoán con ArrayList này có thể chứa bao nhiêu phần tử
        //không phải vì mảng k co giãn mà do nớ vẫn bị hạn chế vùng nhớ 
        
        //isEmpty(): hỏi list có bị rỗng, return true/false
        //indexOf(): tìm kiếm phần tử và trả ra index, nếu k có thì return -1
        //trimToSize(): giảm dung lượng Array về kích thước hiện tại của nó
        
    }
    public static void cpyHacking(){//chuyên về copy
        ArrayList<Student> studentList = new ArrayList<>();
        Student hung = new Student("Thế Hùng");
        studentList.add(hung);
        studentList.add(new Student("Tuấn Kiệt"));//2 cách add
        //show
        System.out.println("Show thông tin sinh viên: ");
        for (Student student : studentList) {
            student.showInfor();//ra hùng ra kiệt
        }
        hung.setName("Thế Bảo");
        //show
        System.out.println("Show thông tin sinh viên: ");
        for (Student student : studentList) {
            student.showInfor();//ra bảo ra kiệt
        }
        
        //.clone -> shallow copy
        ArrayList<Student> cloneStudentList = (ArrayList)studentList.clone();//phải ép về array list
        System.out.println("cloneStudentList là");
        for (Student student : cloneStudentList) {
            student.showInfor();
        }
        cloneStudentList.get(0).setName("Thế Tâm");//vẫn đổi
        System.out.println("cloneStudentList là");
        for (Student student : cloneStudentList) {
            student.showInfor();
        }
        
        //show thử mảng cũ
        System.out.println("StudentList"+ studentList);//cũng bị thay đổi theo luôn
        //copy nhưng khi sửa lại thì ảnh hướng đến cả ArrayList gốc
        //tuy nó clone nhưng nó chỉ vào chung 1 vùng nhớ
        //có 2 vùng nhớ nhưng chưa đứt hoàn toàn vẫn dính chung 1 object
        ////=>shallow copy: hiện tượng thằng gốc và clone đều cùng trỏ đến 1 object
        //tức là copy chưa full còn dính dây mơ rễ má
        
        //deep copy: copy sâu là cắt đứt hoàn toàn liên kết với nhau
    }
}

class Student{
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showInfor(){
        System.out.println(name);
    }
}