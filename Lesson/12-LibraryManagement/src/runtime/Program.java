package runtime;

import data.LibraryManagement;
import ui.Menu;

/*
tạo chương trình quản lý thư viện
gồm 2 class sau
Author
    name nickname yob;
    tạo phểu hàm không đối số = construtor rỗng
    tạo phểu có đối số = constructor full prop
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại
    tạo hàm showInfor
Book
    bookName createAt nickName
    tạo có đối số và k có đồi số
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà 
    có tên
trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong ds
    thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát

//skill: cấm nhập trùng id
 */
public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu("Chương trình quản lý thư viện");
        menu.addNewOption("Thêm mới sách");
        menu.addNewOption("In ra danh sách các cuốn sách");
        menu.addNewOption("Thêm mới tác giả");
        menu.addNewOption("Tìm sách theo nickName của tác giả");
        menu.addNewOption("Két thúc");
        LibraryManagement lm = new LibraryManagement();
        int choice;
        while(true){
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    lm.addNewBook();
                    break;
                }
                case 2:{
                    lm.printBookList();
                    break;
                }
                case 3:{
                    lm.addnewAuthor();
                    break;
                }
                case 4:{
                    lm.searchBookByNickName();
                    break;
                }
                case 5:{
                    System.out.println("See you again!!!");
                    return;
                }
            }
        }
    }
}
