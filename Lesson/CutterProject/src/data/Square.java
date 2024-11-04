package data;

//con còn đặc tính gì riêng không
//thường nhầm là edge nhưng bản chất nó chỉ có width và height thôi k có edge nữa
public class Square extends Rectangle {
    
    //constructor
    public Square(String owner, String color, double edge) {//đổi width và height thành edge vì là hình vuông
        //trên lí thuyết là nhận vào 1 nhưng bản chất nó vẫn là 2
        //nên ở super vẫn phải để 2 cái
        super(owner, color, edge, edge);
    }
    
    @Override
    public void showInfor(){
        String str = String.format("Square| %-15s| %-15s| %5.2f| %5.2f| %5.2f| %5.2f",
                    owner, color, height, width, getArea(), getPerimeter());
        //ở đây để height và width vì bản chất nó nhận width và height k phải edge  
        System.out.println(str);
    }
    
}