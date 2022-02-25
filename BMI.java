package BAITAPOJ;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        float a=0;
        System.out.println("Nhap BMI: ");
        do{            
            if(scan.hasNextFloat()){
                a = scan.nextFloat();               
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Khong hop le,Nhap lai BMI ");
            }
        }while(!wenttocatch);
        if(a<18.5){
            System.out.print("Underweight");
        }
        else if(a>= 18.5 && a<25.0){
            System.out.print("Normal");
        }
        else if(a>= 25.0 && a<30.0){
            System.out.print("Overweigt");
        }
        else{
            System.out.print("Obese");
        }
        
    } 
    
}