
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        playWithArrayList();
    }
    public static void playWithArrayList(){
        //ArrayList là một cái túi hàng hiệu 
        //dùng để triển khai các tính năng của thằng List interface
        //Đặc điểm của mảng này rất giống mảng bình thường
        //Nhưng nó co giãn 
        //thông thường ta phải khai báo kích thước trước khi tạo mảng cùi
        Integer arrIntPrimitive[] = new Integer[10];//bắt buộc có 10 thì code mới oke  }
        //vì nó không co giãn, nếu dùng ít hơn số phần tử đã xin mà mình vẫn duyệt tới 10 là lỗi
        //nếu xài nhiều hơn 10 phần tử, thì nó xung đột vùng nhớ
        
        //ArrayList Collection cho phéo em tăng giảm kích thước
        //nên lúc khởi tạo không cần kích thước
        ArrayList<Integer> arrIntList = new ArrayList<Integer>();
        List<Integer> arrIntListV2 = new ArrayList<>();
        //khai cha new con
    }
}
