package ui;

import java.util.ArrayList;
import tools.Inputter;

public class Menu {
    public String title;
    public ArrayList<String> optionList = new ArrayList<>();

    public Menu(String title) {
        this.title = title;
    }
    
    
    
    public void addNewOption(String newOption){
        optionList.add(newOption);
    }   
    
    public void print(){
        int count = 1;
        System.out.println("--------------"+title+"----------------");
        for (String item : optionList) {
            System.out.println(count +". "+item);
            count++;
        }
    }
    public int getChoice(){
        int choice = Inputter.InputAnInteger("Vui lòng nhập lựa chọn của bạn",
                "Sai format", 1, optionList.size());
        return choice;
    }
}