//Lambda trong java được ví như arrow function trong js
//nhưng mà cùi hơn
public class DemoLambda {
    public static void main(String[] args) {
        //tạo object từ Human(interface)
        Human hieu = new Human() {
            @Override
            public void show() {
                 System.out.println("Ahihi tui là Hiếu! ");
            }
        };
        hieu.show();
        
        Human hieu1 = () ->{//vẫn là implemant cho method show()
            System.out.println("Ahihi Tui là Hiếu! ");
        };
        hieu1.show();
        
        //lambda có argument
        Math sum = (a,b) ->{
            return a + b;
        };
        System.out.println(sum.add(5, 7));
        
        Math sum1 = (int a, int b) -> a + b;
        System.out.println(sum1.add(7, 7));
    }
}
//JDK7: quy định 1 interface chỉ có 1 method mà thôi
//Lambda chỉ xuất hiện từ JDK 8 trở lên

//Tại soa nên sử dụng lambda
//1. Sẽ cung cấp bản thực hiện cho giao diện chức năng
//2. Viết code ít hơn

//(argument-List) -> {body}
//argument-List: có thể để trống
//->: Arrow token: dùng để liên kết argument với biểu thức body
//body:chứa các khối lệnh
//nếu code chỉ có 1 dòng thì khỏi return

@FunctionalInterface //annotation
interface Human{
    public void show();//abstract
}

//Nguyên tắc: một file chỉ được chứa 1 class public 
//thàng đó phải trùng tên với file
interface Math{
    public int add(int a, int b);
}

//nguyên tắc 1 file java chỉ đc chứa
    //1 class public (thằng đó phải cùng tên file)
    //nghĩa là public DemoLambda thì đc còn lại không được public