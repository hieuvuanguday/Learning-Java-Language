package data;
//Class Student kế thừa Class Person
//id, gpa, email

import java.util.Scanner;

//có constructor là rỗng
//có getter và setter
//setter cấm truyền vào rỗng, nhập id mà rỗng là ép nhập lại
//showInfor()
public class Student extends Person {
    private String id;
    private Double gpa;
    private String email;
    //constructor
    public Student() {
    }
    //getter|setter
    public String getId() {
        return id;
    }
    public boolean setId(String id) {
        if(id != null){
            this.id = id;
            return true;
        }else{
            System.out.println("Vui lòng điền thông tin!!!");
            return false;
        }
    }
    public Double getGpa() {
        return gpa;
    }
    public boolean setGpa(Double gpa) {
        if(gpa < 0 && gpa > 10){
            return false;
        }
        this.gpa = gpa;
        return true;
    }
    public String getEmail() {
        return email;
    }
    public boolean setEmail(String email) {
        if(email == null || email.isEmpty() || !email.contains("@")){
            return false;
        }
        this.email = email;
        return true;
    }
    //method
    @Override
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
//        while(true){
//            String inputID = sc.nextLine();
//            boolean check = setId(inputID);
//           if(check){
//                break;
//            }
//        }
        while(!setId(sc.nextLine()));
        super.inputInfor();//gọi hàm nhập của cha
        //vì cha đã nhập name, gender, yob rồi
        System.out.println("Nhập GPA: ");
        while(!setGpa(Double.parseDouble(sc.nextLine())));
        System.out.println("Nhập email: ");
        while(!setEmail(sc.nextLine()));
    }
    @Override
    public void showInfo(){
        String str = String.format("%-10s|%-10s|%-5s|%4d|%5.2f|%-20s", id, name, gender, yob, gpa, email);
        System.out.println(str);
    }
    public boolean hasScholarship(){
        return this.gpa >= 0;
    }
}