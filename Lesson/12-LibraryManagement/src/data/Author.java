//Author
//    name nickname yob;
//    tạo phểu hàm không đối số = construtor rỗng
//    tạo phểu có đối số = constructor full prop
//    tạo phểu có đối số là nickname
//    tạo getter không tạo setter
//    tạo hàm nhập thông tin tác giả
//    nhưng nếu tác giả đã tồn tại trong danh sách thì k cho
//    ép nhập lại
//    tạo hàm showInfor
package data;

import java.util.Scanner;

public class Author {
    private String name;
    private String nickName;
    private int yob;
    ///tạo constructor rỗng
    public Author() {
    }
    //tạo constructor full thông tin
    public Author(String name, String nickName, int yob) {
        this.name = name;
        this.nickName = nickName;
        this.yob = yob;
    }
    //constructor có một đối số là nickName
    public Author(String nickName) {
        this.nickName = nickName;
    }
    //getter
    public String getName() {
        return name;
    }
    public String getNickName() {
        return nickName;
    }
    public int getYob() {
        return yob;
    }
    
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    //tạo một overload của inputInfo, thằng này sẽ cho nhập
    //nếu nickName trùng với ai đó trong danh sách thì dừng
    public void inputInfor(Author[] authorList, int size){
        Scanner sc = new Scanner(System.in);
        inputInfor();//nhập name và yob
        System.out.println("Nhập nickName: ");
        //xử lý việc nhập trùng
        while(true){
            String inputNickName = sc.nextLine();
            boolean isFind = false;//mặc định là false
            //duyệt mảng authorList tìm xem có ai trùng với nickName vừa nhập không
            //nếu có thì ngừng nhập, còn không thì oke
            for(int i = 0; i <= size - 1; i++){
                if(authorList[i].getNickName().equals(inputNickName)){
                    isFind = true;
                    break;
                }
            }
            //nếu có tác giả nào có nickName mình vừa nhập 
            //Thì isFind là true
            if(isFind){
                System.out.println("NickName bị trùng");
            }else{
                this.nickName = inputNickName;
                return;
            }
        }
    }
    
    //method: showInfor()
    public void showInfor(){
        String str = String.format("%s|%s|%d", name, nickName, yob);
        System.out.println(str);
    }
}