package data;

import java.util.Scanner;

/*
tạo chương trình quản lý thư viện
gồm 2 class sau
Author:tác giả
    name nickname yob;
    tạo phểu hàm không đối số|constructor rỗng
    tạo phểu có đối số | constructor full prop
    tạo phểu có đối số là nickname
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    -nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
    ép nhập lại(yêu cầu logic thì để cuối)
    tạo hàm showInfor
Book
    bookName createAt nickName(tên của tác giả)
    tạo có đối số và k có đồi số
  
tạo getter and setter
    tạo hàm inputInfor
    nếu mà tác giả viết cuốn sách có tồn tại 
    trong danh sách tác giả thì mình k cần làm thêm gì cả
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
public class Book {
    private String bookName;
    private String createAt;
    private String nickName;
    //constructor rỗng và bình thường
    public Book(String bookName, String createAt, String nickName) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickName = nickName;
    }
    public Book() {
    }
    //getter|setter
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookname) {
        this.bookName = bookname;
    }
    public String getCreateAt() {
        return createAt;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    //method input: nhập full thông tin cuốn sách
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        System.out.println("Nhập ngày xuất bản: ");
        this.createAt = sc.nextLine();
        System.out.println("Nhập nick name của tác giả: ");
        this.nickName = sc.nextLine();
    }
    //method showInfor
    public void showInfor(){
        String str = String.format("%-20s|%-15s|%10s", bookName, createAt, nickName);
        System.out.println(str);
    }
    
}
