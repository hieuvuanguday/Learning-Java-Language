package data;

import java.util.Scanner;

/*
    class chuyên tạo object giúp quản lý các thứ liên quan đến
    thư viện (danh sách tác giả, danh sách các cuốn sách)
    các method xử lý 2 danh sách trên
*/
public class LibraryManagement {
    private static Author authorList[] = new Author[100];
    private static int sizeAuthor = 0;
    private static Book bookList[] = new Book[100];
    private static int sizeBook = 0;
    
    //constructor
    public LibraryManagement() {
    }
    //method: addNewBook để thêm sách vào bookList
    public static void addNewBook(){
        Scanner sc = new Scanner(System.in);  
        Book newBook = new Book();//tạo ra cuốn sách rỗng
        newBook.inputInfor();//điền thông tin cho sách rỗng
        boolean isFind = false;
        for(int i = 0; i <= sizeAuthor - 1; i++){
            if(authorList[i].getNickName().equals(newBook.getNickName())){
            isFind = true;
            break;
            }
        }
        if(!isFind){
            Author newAuthor = new Author(newBook.getNickName());
            newAuthor.inputInfor();//nhập thêm name và yob
            authorList[sizeAuthor] = newAuthor;
            sizeAuthor++;
        }
        //add sách vào dnah sách
        bookList[sizeBook] = newBook;
        sizeBook++;
        System.out.println("thông tin sách mới thêm: ");
        newBook.showInfor();
    }
    //method: thêm mới tác giả addNewAuthor
    public static void addnewAuthor(){
        System.out.println("Thêm tác giả mới: ");
        Author newAuthor = new Author();
        newAuthor.inputInfor(authorList, sizeAuthor);
        //inputInfor(authorList, size) cho nhập name, nickName cấm trùng, yob
        authorList[sizeAuthor] = newAuthor;
        sizeAuthor++;
    }
    //method: printBookList in ra danh sách các cuốn sách
    public static void printBookList(){
        if(sizeBook == 0){
            System.out.println("Nothing to print!!!");
            return;
        }
        for(int i = 0; i <= sizeBook - 1; i++){
            bookList[i].showInfor();
        }
    }
    //method: tìm sách dựa trên nickName
    public static void searchBookByNickName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nickName muốn tìm sách: ");
        String inputNickName = sc.nextLine();
        boolean isFind = false;
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getNickName().equals(inputNickName)){
                bookList[i].showInfor();
                isFind = true;
            }
        }
        if(!isFind){
            System.out.println("Nothing to print!!!");
        }
    }
}
