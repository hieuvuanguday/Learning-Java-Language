package runtime;

import data.StudentV1;
import data.StudentV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        sortV1();
    }
    
    public static void sortV1(){
        //tạo ds sinh viên
        ArrayList<StudentV1> studentListV1 = new ArrayList<>();
        studentListV1.add(new StudentV1("SE00001", "Lê", "An", 8.2));
        studentListV1.add(new StudentV1("SR00005", "Nguyễn", "Bình", 7));
        studentListV1.add(new StudentV1("SR00002", "Lí", "Dũng", 9));
        studentListV1.add(new StudentV1("SR00004", "Trần", "Cường", 5));
        studentListV1.add(new StudentV1("SR00003", "Võ", "Em", 9.9));
        
        /*
        Comparator orderById = new Comparator<StudentV1>() {//chỗ <> là bỏ thg muốn so sánh vào
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {//chỉ có 1 method là compare thôi k có equal
                if(t1.getId().compareTo(t2.getId()) > 0){//nếu t1 lớn hơn nó trả ra 1 thì nó sẽ lớn hơn
                    return 1;
                }
                return -1;
            }
        };
        
        Collections.sort(studentListV1, orderById);
        */
        
        Collections.sort(studentListV1, new Comparator<StudentV1>() {
            @Override
                public int compare(StudentV1 t1, StudentV1 t2) {
                return t1.getId().compareTo(t2.getId());
            }
        });
        
        System.out.println("Danh sách sinh viên là");
        for (StudentV1 studentV1 : studentListV1) {
            studentV1.showInfor();
        }
    }
    public static void sortV2(){
        ArrayList<StudentV2> studentListV2 = new ArrayList<>();
        studentListV2.add(new StudentV2("SE00001", "Lê", "An", 8.2));
        studentListV2.add(new StudentV2("SR00005", "Nguyễn", "Bình", 7));
        studentListV2.add(new StudentV2("SR00002", "Lí", "Dũng", 9));
        studentListV2.add(new StudentV2("SR00004", "Trần", "Cường", 5));
        studentListV2.add(new StudentV2("SR00003", "Võ", "Em", 9.9));
        
        Collections.sort(studentListV2);
        
        for (StudentV2 student : studentListV2) {
            student.showInfor();
        }
        
        
    }
}
//giờ mình muốn sort, mình có thể thông qua comparator
        //khi ta so sánh 2 đối tượng trong 1 danh sách chỉ ss chuỗi
        //mà trong list thì nó là object = chuỗi rồi
        //comparator: hiểu đơn giản nó là người trọng tài dứng xét xem 
                //2 thằng ai thắng
        //Comparator là 1 interface có 1 method
        //      compare: nhận vào 2 object, rồi so sánh theo tiêu chí gì đó
        //  return -1 hoặc 1
        //Collections dựa vào đó mà tự sort
        
        //tạo 1 comparator