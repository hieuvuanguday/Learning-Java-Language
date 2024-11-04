package runtime;

import data.PetManagement;
import ui.Menu;

public class Program {
    public static void main(String[] args) {
        //tạo menu
        Menu mn = new Menu("Pet care system");
        mn.addNewOption("Add new Dog");
        mn.addNewOption("Add new Cat");
        mn.addNewOption("Show Pet List");
        mn.addNewOption("Search Pet By Id");
        mn.addNewOption("Update Pet By Id");
        mn.addNewOption("Remove Pet By Id");
        mn.addNewOption("Sort Pet List Order By Weight");
        mn.addNewOption("Save file and quit");
        //Tạo Manegement
        PetManagement pm = new PetManagement();
        int choice;
        while(true){
            mn.print();
            choice = mn.getChoice();
            switch(choice){
                case 1 : {
                    pm.addNewDog();
                    break;
                }
                case 2 : {
                    pm.addNewCat();
                    break;
                }
                case 3 : {
                    pm.showPetList();
                    break;
                }
                case 4 : {
                    pm.searchPetById();
                    break;
                }
                case 5 : {
                    pm.updatePetById();
                    break;
                }
                case 6 : {
                    pm.removePetById();
                    break;
                }
                case 7 : {
                    pm.sortPetListByWeight();
                    break;
                }
                case 8 : {
                    System.out.println("Good bye! See you next time!!!");
                   return;
                }
            }
        }
    }
}
