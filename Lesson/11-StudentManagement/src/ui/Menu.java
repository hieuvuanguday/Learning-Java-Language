package ui;//user interface: giao diện người dùng
//menu sẽ lưu mảng các option để mình chọn

import java.util.Scanner;

public class Menu {
    private static String title;
    private static String optionList[] = new String[100];
    private static int size = 0;
    //constructor nhận vào title 
    public Menu(String title) {
        this.title = title;
    }
    public static String getTitle() {
        return title;
    }
    //method: addOption: lưu những thực đơn trong menu
    public static void addNewOption(String newOption){
        optionList[size] = newOption;
        size++;
    }
    //method: in ra danh sách các option
    public static void printMenu(){
        System.out.println(getTitle());
        for(int i = 0; i <= size - 1; i++){
            String str = String.format("%-3d.%s", i + 1, optionList[i]);
            System.out.println(str);
        }
        
    }
    //method: gotChoice: lấy lựa chọn của người dùng
    //không cho người dùng lấy lựa chọn ngoài optionList
    public static int getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập lựa chọn đi: ");
        while(true){
            int choice;
            try{
                choice = Integer.parseInt(sc.nextLine());
                if(choice < 1 || choice > size){
                    throw new Exception();
                }
                return choice;
            }catch(Exception e){
                System.out.println("Vui lòng nhập lại [a - "+ size+"]");
            }
        }
    }
}