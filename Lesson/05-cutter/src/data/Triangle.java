package data;

public class Triangle {
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;
    //không đặt cá thuộc tính như chu vi, diện tích ở đây
    //1.khi tạo object thì các thuộc tính chưa có giá trị
    //  khi chưa có giá trị thì thuộc tính Area sẽ chứa giá trị sai
    //2.Vì area và perimeter đều có thể tính được từ 3 cạnh
    //  nếu như mình để sau constructor thì người ta có thể thay đổi giá trị
    // *** cái nào tính được từ các thuộc tính thì không tạo mà chỉ làm getter
    //Constructor: cái phễu để đúc
    public Triangle(double edgeA, double edgeB, double edgeC){
    this.edgeA = edgeA;
    this.edgeB = edgeB;
    this.edgeC = edgeC;
    }
    //các getter/setter

    //thàng này là constructor nhưng mà tạo ra tượng rỗng
    //
    public Triangle(){}
    
    public double getEdgeA() {
        return edgeA;
    }
    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }
    public double getEdgeB() {
        return edgeB;
    }
    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }
    public double getEdgeC() {
        return edgeC;
    }
    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }
    //getPremeter: method lấy chu vi
    public double getPerimeter(){
        return edgeA + edgeB + edgeC;
    }
    //hàm get area
    public double getArea(){
        double p = getPerimeter()/2; //tính nửa chu vi
        return Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
        //tính diện tích bằng công thức herong  
    }
    
    public void showProfile(){
        String str = String.format("|Triangle|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|", edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}
