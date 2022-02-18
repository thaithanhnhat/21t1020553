package BAITAPOJ;
import java.util.Scanner;

public class Chuvi {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        float number_of_rigons = 0;
        do{
            System.out.println("Nhap vao n : ");
            if(scan.hasNextFloat()){
                number_of_rigons = scan.nextFloat();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Nhap lai n: ");
            }
        }while(!wenttocatch);
        System.out.print("Ket qua la: "+ 2*number_of_rigons*3.14159);
        

    } 
    
}
