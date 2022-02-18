package BAITAPOJ;
import java.util.Scanner;

public class pt98 {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        Byte a = 0;
        Byte b = 0;
        do{
            System.out.println("Nhap vao a,b : ");
            if(scan.hasNextByte()){
                a = scan.nextByte();
                b = scan.nextByte();
                wenttocatch = true;
            }else{
                scan.nextLine();
                System.out.println("Nhap lai n: ");
            }
        }while(!wenttocatch);
        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));
        System.out.println("a^b: " + Math.pow(a,b));
        
        //c2;
//        int a = 0;
//        int b = 0;
//        do{
//            System.out.println("Nhap vao n : ");
//            if(scan.hasNextInt()){
//                a = scan.nextInt();
//                b = scan.nextInt();
//                wenttocatch = true;
//            }else{
//                scan.nextLine();
//                System.out.println("Nhap lai n: ");
//            }
//        }while(!wenttocatch);
//        System.out.println("a+b: " + (a+b));
//       System.out.println("a-b: " + (a-b));
//    System.out.println("a*b: " + (a*b));
//      System.out.println("a/b: " + (a/b));
//      System.out.println("a%b: " + (a%b));
 //       System.out.println("a^b: " + Math.pow(a,b));
//    
    //c3;
//        double a = 0;
//        double b = 0;
//        do{
//            System.out.println("Nhap vao n : ");
//            if(scan.hasNextInt()){
//                a = scan.nextDouble();
//                b = scan.nextDouble();
//                wenttocatch = true;
//            }else{
//                scan.nextLine();
//                System.out.println("Nhap lai n: ");
//            }
//        }while(!wenttocatch);
//        System.out.println("a+b: " + (a+b));
//        System.out.println("a-b: " + (a-b));
//        System.out.println("a*b: " + (a*b));
//        System.out.println("a/b: " + (a/b));
//        System.out.println("a^b: " + Math.pow(a,b));
    }
}
