package data;
//tam giác vuông is a tam giác 
//  con                 cha
//tám giác chưa chắc là tam giác vuông
//đây là mối quan hệ "is a"
//trước "is a" là con, sau là cha

//cha nó có method tính diện tích, chu vi 
//method show ra thông tin

//ý nghĩa: tại sao phải nhận cha
//cái gì người bề trên làm tốt rồi thì dùng lại
//lấy xài luôn, đỡ làm lại
//cái gì mà mình nhận từ bề trên mà không tốt thì mình cải thiện để hơn
//cái gì mình update từ đồ của cha, thì cha không được xài
public class RightTriangle extends Triangle{
    
    //đây là constructor cảu RightTriangle
    public RightTriangle(double edgeA, double edgeB) {
        super(edgeA, edgeB, Math.sqrt(edgeA*edgeA + edgeB*edgeB));
    }
    //super chính là new cha : => new Triangle
    //khi tạo ra tam giác vuông, thì nó đi tạo ra tam giác thường
    //vì lí do này nên object con có kích thước lớn hơn object cha
    
    @Override
    public void showProfile(){
        String str = String.format("|RightTriangle     |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|", edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
}
//khi 2 class kế thừa nhau
//object từ class con có bé hơn object từ class cha không?
//class con kế thừa class cha
//tức là class con sẽ nhận hết tất cả của cha
//ngay cả constructor cũng chứa constructor của cha
//nên object tạo từ class con sẽ phải tạo thông qua class cha và kèm theo
//code riêng của con
//=> object con > object cha

//override là gì em?
//chỉ xuất hiện trong mối quan hệ "is a" (cha con, kế thừa)
//xuất hiện khi thằng con muốn độ lại hàm của thằng cha
//con có một hàm cùng tên với method của cha (cùng/khác parameter, cùng/khác body)
//vậy overload là gì?
//không quan tâm mối quan hệ cha con
//2 method cùng tên trong cùng class mà khác parameter là overload
//