package runtime;
//viết chương trình quản lý sinh viên cơ bản
//miêu tả như sau:

import data.StudentList;
import ui.Menu;

//1 class Person
//name, gender, yob
//có constructor rỗng
//có getter/setter
//có hàm inputInfor()
//có showInfor

//Class Student kế thừa Class Person
//id, gpa, email
//có constructor là rỗng
//có getter và setter
//setter cấm truyền vào rỗng, nhập id mà rỗng là ép nhập lại
//showInfor()

//chương trình gồm các tính năng
//nhập sinh viên
//hiển thị thông tin sinh viên
//tìm kiếm theo mã sinh viên
//sort theo tên và hiển thị
//hiển thị thông tin các sinh viên có học bổng(gpa > 8)
//thoát
public class Program {
    public static void main(String[] args) {
        //tạo object chuyên quản lý menu
        Menu menu = new Menu("Chương trình Quản Lý Sinh Viên");
        menu.addNewOption("Thêm mới sinh viên");
        menu.addNewOption("In ra danh sách sinh viên");
        menu.addNewOption("Tìm kiếm sinh viên dựa trên ID");
        menu.addNewOption("Sắp xếp sinh viên theo tên");
        menu.addNewOption("In ra danh sách sinh viên có học bổng");
        menu.addNewOption("Thoát chương trình");
        int choice;
        StudentList stl = new StudentList();
        do{
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    stl.addNewStudent();
                    break;
                }
                case 2:{
                    stl.printStudentList();
                    break;
                }
                case 3:{
                    stl.searchStudentById();
                    break;
                }
                case 4:{
                    stl.sortStudentByName();
                    stl.printStudentList();
                    break;
                }
                case 5:{
                    stl.showStudentHasScholarship();
                    break;
                }
                case 6:{
                    System.out.println("See you again");
                    return;
                }
            }
        }while(true);
        
    }
}
