package data;
//tạo ra 1 class
//chuyên tạo ra các chiệc tủ đựng hồ sơ học sinh

import java.util.Scanner;

public class StudentList {
    public static int MAX = 100;
    private static Student stl[] = new Student[100];
    private static int size  = 0;
    //constructor
    public StudentList(){    
    }
    
    //Nhập sinh viên
    public static void addNewStudent() {
        System.out.println("Thêm mới sinh viên!!!");
            Student newStudent = new Student();
            newStudent.inputInfor();
            stl[size] = newStudent;
            size++;
    }
    //Print student list
    public static void printStudentList() {
        System.out.println("Student List");
        if(size == 0){
            System.out.println("Nothing to print");
            return;//void: đơn giản là ngừng thôi
        }
        for(int i = 0; i <= size - 1; i++){
            stl[i].showInfo();
        }
    }
    //tìm kiếm thông qua ID
    //đưa id nhận về vị trí trong mảng
    public static int searchPosById(String id){
        for(int i = 0; i <= size - 1; i++){
            if(stl[i].getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }
    //đưa id nhận về object
    public static Student searchStudentById(String id){
        int pos = searchPosById(id);
        if(pos == -1) return null;
        return stl[pos];
    }
    //đựa id nhận về đầy đủ thông tin
    public static void searchStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của sinh viên bạn muôn tìm");
        String inputId = sc.nextLine();
        Student st = searchStudentById(inputId);
        if(st == null){
            System.out.println("Không tồn tại sinh viên");
        }else{
            System.out.println("Thông tin sinh viên cần tìm");
            st.showInfo();
        }
    }    
    //sort theo tên
    public static void sortStudentByName(){
        if(size == 0){
            return;
        }
        for(int i = 0; i <= size - 2; i++){
            for(int j = i + 1; j <= size - 1; j++){
                if(stl[i].getName().compareTo(stl[j].getName()) > 0){
                    //swap
                    Student studentTmp = stl[i];
                    stl[i] = stl[j];
                    stl[j] = studentTmp;
                }
            }
        }
    }
    //Hiển thị thông tin sinh viên có học bổng (GPA > 8)
    public static void showStudentHasScholarship(){
        for(int i = 0; i <= size - 1; i++){
            if(stl[i].hasScholarship()){
                stl[i].showInfo();
            }
        }
    }
    
}
