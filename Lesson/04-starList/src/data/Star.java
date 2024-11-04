package data;
//Bộ khuôn để đúc ra các ca sĩ
public class Star {
    //properties: thuộc tính|field|attribute
    public String name;
    private int yob;
    public String hotSong;
    //khi có static thì properties sẽ thuộc về class 
    //và nó sẽ xài chung cho tất cả các object
    //Phễu: constructor: hàm dựng khuôn
    //constructor: cùng tên với class
    //this: tự truy vấn bản thân (ám chỉ class chứa nó)
    public Star(String name, int yob, String hotSong){
        this.name = name;
        this.yob = yob;
        this.hotSong = hotSong;
    }
    
    //getter/setter
    public int getYob(){
        return this.yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    
    //method: hành động
    public void showin4(){
        System.out.println("Tên tui là: "+ name +
                           ", Tui sinh năm: "+ yob +
                           ", Hot song là: "+ hotSong);
    }
}
