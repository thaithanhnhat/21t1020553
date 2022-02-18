package BAITAPOJ;
import java.util.Scanner;

public class PTBAC1 {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        float a=0,b=0;
        System.out.println("Nhap a,b ");
        do{            
            if(scan.hasNextFloat()){
                a = scan.nextFloat();
                b = scan.nextFloat();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Khong hop le,Nhap lai a,b ");
            }
        }while(!wenttocatch);
        if(a==0){
            if(b==0){
                System.out.println("pt vo so nghiem");
            }
            else{
                System.out.println("pt vo nghiem");
            }
        }
        else{
            System.out.println("X=: "+(-b/a));
        }

    } 
    
}