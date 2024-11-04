package tools;
//bộ công cụ hỗ trợ nhập

import java.util.Scanner;

public class Inputter {
    public static Scanner sc = new Scanner(System.in);
    //method nhập số nguyên
    public static int InputAnInteger(String inputMsg, String errorMsg){
        int number;
        System.out.println(inputMsg);
        while(true){
            try{
                number = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    } 
    
    public static int InputAnInteger(String inputMsg, String errorMsg,
                    int lowerBound, int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        int number;
        System.out.println(inputMsg);
        while(true){
            try{
                number = Integer.parseInt(sc.nextLine());
                if(number > upperBound || number < lowerBound){
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    } 
    
    public static double InputADouble(String inputMsg, String errorMsg){
        double number;
        System.out.println(inputMsg);
        while(true){
            try{
                number = Double.parseDouble(sc.nextLine());
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    } 
    public static double InputADouble(String inputMsg, String errorMsg,
                    double lowerBound, double upperBound){
        if(lowerBound > upperBound){
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        double number;
        System.out.println(inputMsg);
        while(true){
            try{
                number = Double.parseDouble(sc.nextLine());
                if(number > upperBound || number < lowerBound){
                    throw new Exception();
                }
            }catch(Exception e){
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