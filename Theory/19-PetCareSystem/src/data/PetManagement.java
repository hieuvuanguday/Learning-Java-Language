package data;
//class này là class chứa danh sách 
//Và các method xử lý danh sách đó
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tools.Inputter;

public class PetManagement {
    ArrayList<Pet> petList = new ArrayList<>();
    
    public void addNewDog(){
        boolean isFind;
        do{
            String id = Inputter.getString("Input Dog's ID:",
                                       "Your input id isn't matched \"DXXX\"",
                                       "[Dd]\\d{3}").toUpperCase();
            isFind = false;
            for(Pet pet : petList){
                if(pet.getId().equals(id)) isFind = true;
            }
        }while(isFind);
        String id = Inputter.getString("Input Dog's ID:",
                                       "Your input id isn't matched \"DXXX\"",
                                       "[Dd]\\d{3}").toUpperCase();
        String owner = Inputter.getString("Input Owner: ", "This field is required!!!");
        String color = Inputter.getString("Input Color: ", "This field is required!!!");
        double weight = Inputter.InputADouble("Input weight: ", "Weight have to from 0 to 200!!!", 0, 200);
        String necklace = Inputter.getString("Input Necklace: ", "This field is required!!!");
    //Tạo đối tượng Dog
    Dog newDog = new Dog(id, owner, color, weight, necklace);
    petList.add(newDog);
    }
    
    public void addNewCat(){
        boolean isFind;
        do{
            String id = Inputter.getString("Input Cat's ID:",
                                       "Your input id isn't matched \"DXXX\"",
                                       "[Cc]\\d{3}").toUpperCase();
            isFind = false;
            for(Pet pet : petList){
                if(pet.getId().equals(id)) isFind = true;
            }
        }while(isFind);
        String id = Inputter.getString("Input Cat's ID:",
                                       "Your input id isn't matched \"DXXX\"",
                                       "[Cc]\\d{3}").toUpperCase();
        String owner = Inputter.getString("Input Owner: ", "This field is required!!!");
        String color = Inputter.getString("Input Color: ", "This field is required!!!");
        double weight = Inputter.InputADouble("Input weight: ", "Weight have to from 0 to 200!!!", 0, 200);
        String ribbon = Inputter.getString("Input Ribbon: ", "This field is required!!!");
    //Tạo đối tượng Dog
    Cat newCat = new Cat(id, owner, color, weight, ribbon);
    petList.add(newCat);
    }
    public void showPetList(){
        if(petList.size() == 0){
            System.out.println("Nothing in petList!");
            return;
        }
        System.out.println("---PetList---");
        for(Pet pet : petList){
            pet.showInfor();
        }
    }
    //tìm: đưa id tìm vị trí
    public int searchPetIndexById(String id){
        for(int i = 0; i <= petList.size() - 1; i++){
            if(petList.get(i).getId().equals(id)) return i;
        }
        return -1;
    }
    //Tìm: đưa id tìm con pet
    public Pet searchPetById(String id){
        int pos = searchPetIndexById(id);
        return petList.get(pos);
    }
    //Tìm: giao tiếp nhập id, từ id tìm thú cưng
    public void searchPetById() {
        String id = Inputter.getString("Input PetId you wanna find", "This field is required");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!!");
        }else{
            System.out.println("This is your pet");
            pet.showInfor();
        }
    }
//
    public void updatePetById() {
        String id = Inputter.getString("Input PetId you wanna find", "This field is required");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!!");
        }else{
            System.out.println("Informaion of pet before updating");
            pet.showInfor();
            String owner = Inputter.getString("Input Owner: ", "This field is required!!!");
            String color = Inputter.getString("Input Color: ", "This field is required!!!");
            double weight = Inputter.InputADouble("Input weight: ", "Weight have to from 0 to 200!!!", 0, 200);
            if(pet instanceof Dog){
                String necklace = Inputter.getString("Input Necklace: ", "This field is required!!!");
                pet.setOwner(owner);
                pet.setColor(color);
                pet.setWeight(weight);
                ((Dog) pet).setNecklace(necklace);
            }else{
                String ribbon = Inputter.getString("Input Ribbon: ", "This field is required!!!");
                pet.setOwner(owner);
                pet.setColor(color);
                pet.setWeight(weight);
                ((Cat) pet).setRibbon(ribbon);
            }
        }
    }
    //remove
    public void removePetById() {
        String id = Inputter.getString("Input PetId you wanna remove", "This field is required");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!!");
        }else{
            pet.showInfor();
            boolean isConfirmed = false;
            String confirm = Inputter.getString("input \"delete\" to confirm ",
                                                "This field is required!").toUpperCase();
            if(confirm.equals("DELETE")){
                System.out.println("This oet is removed");
                petList.remove(pet);
            }
        }
    }
    //sort theo cân nặng
    public void sortPetListByWeight(){
        Comparator<Pet> orderByWeight = new Comparator<Pet>() {
            @Override
            public int compare(Pet t1, Pet t2) {
                if(t1.getWeight() > t2.getWeight()) return 1;
                return -1;
            }
        };
        
        Collections.sort(petList, orderByWeight);
        this.showPetList();
    }
}
