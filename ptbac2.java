package BAITAPOJ;
import java.util.Scanner;

public class ptbac2 {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        float a=0,b=0,c=0;
        System.out.println("Nhap a,b,c: ");
        do{            
            if(scan.hasNextFloat()){
                a = scan.nextFloat();
                b = scan.nextFloat();
                c = scan.nextFloat();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Khong hop le,Nhap lai a,b,c ");
            }
        }while(!wenttocatch);
        float delta = (b*b) - (4*a*c);
        if(delta<0){
            System.out.print("Vo nghiem");
        }
        else if(delta==0){
            System.out.print("Nghiem x1= " + (-b/2*a));
        }
        else{
            float x1 = (float) (-b+Math.sqrt(delta))/(2*a);
            float x2 = (float) (-b-Math.sqrt(delta))/(2*a);
            System.out.print("X1= " + x1 );
            System.out.print("X2= " + x2 );
        }

    } 
    
}