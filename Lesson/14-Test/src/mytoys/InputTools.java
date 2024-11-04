package mytoys;
//bộ công cụ nhập valid
//sẽ giúp mình ép người dùng nhập đúng

import java.util.Scanner;

public class InputTools {
    public static Scanner sc = new Scanner(System.in);
    
    //method nhập số nguyên
    public static int getAnInteger(String inputMsg, String errorMsg){//vì thằng này để static nên phải báo Scanner là static
        System.out.println(inputMsg);
        while(true){
            try{//nhập đúng thì return cái số kia ra
                int inputNumber = Integer.parseInt(sc.nextLine());
                return inputNumber;
            }catch(Exception e){//nhập sai thì báo lỗi
                System.out.println(errorMsg);
            }
        }
    }
    
    //method nhập số nguyên trong khoảng
    public static int getAnInteger(String inputMsg, String errorMsg,
            int lowerBound, int upperBound){//overLoad
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inputMsg);
        while(true){
            try{//nhập đúng thì return cái số kia ra
                int inputNumber = Integer.parseInt(sc.nextLine());
                if(inputNumber < lowerBound || inputNumber > upperBound){//ép nhập trong khoảng
                    throw new Exception();
                }
                return inputNumber;
            }catch(Exception e){//nhập sai thì báo lỗi
                System.out.println(errorMsg);
            }
        }
    }
    
    //method nhập double
    public static double getADouble(String inputMsg, String errorMsg){
        System.out.println(inputMsg);
        while(true){
            try{//nhập đúng thì return cái số kia ra
                double inputNumber = Double.parseDouble(sc.nextLine());
                return inputNumber;
            }catch(Exception e){//nhập sai thì báo lỗi
                System.out.println(errorMsg);
            }
        }
    }
    
    //method nhập double trong khoảng
    public static double getADouble(String inputMsg, String errorMsg,
            double lowerBound, double upperBound){//overLoad
        if(lowerBound > upperBound){
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inputMsg);
        while(true){
            try{//nhập đúng thì return cái số kia ra
                double inputNumber = Double.parseDouble(sc.nextLine());
                if(inputNumber < lowerBound || inputNumber > upperBound){//ép nhập trong khoảng
                    throw new Exception();
                }
                return inputNumber;
            }catch(Exception e){//nhập sai thì báo lỗi
                System.out.println(errorMsg);
            }
        }
    }
    
    //ép nhập string không rỗng
    public static String getString(String inputMsg, String errorMsg){
        String inputString;
        System.out.println(inputMsg);
        while(true){
            try{
                inputString = sc.nextLine();
                if(inputString.isEmpty() || inputString == null){
                    throw new Exception();
                }
                return inputString;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
    
    //ép nhập string theo regex
    public static String getString(String inputMsg, String errorMsg, String regex){
        String inputString;
        System.out.println(inputMsg);
        while(true){
            try{
                inputString = sc.nextLine();
                if(inputString.isEmpty() || inputString == null || !inputString.matches(regex)){//không khớp với regex của mình là lỗi ! là phủ định | matches trả về true hoặc false
                    throw new Exception();//chuỗi trống, chuỗi không giống yêu cầu thì ném xuống lỗi
                }
                return inputString;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
    
    
}