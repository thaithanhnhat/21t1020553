/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPOJ;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class max3so {
    public static void main(String[] args) {
       boolean wenttocatch = false;
            Scanner scan = new Scanner(System.in);
            int a=0;
            int b=0;
            int c=0;
            int dem=0;
            int max = 0;
            System.out.println("Nhap a,b,c: ");
            do{            
                if(scan.hasNextInt()){
                    a = scan.nextInt(); 
                    b = scan.nextInt(); 
                    c = scan.nextInt();
                    wenttocatch = true;
                }else{
                    scan.nextLine();
                    System.out.println("Khong hop le,Nhap lai ");
                }
            }while(!wenttocatch);
            if(a>b && a>c){
                max = a;
            }
            else if(b>c && b>a){
                max = b;
            }
            else{
                max  = c;
            }
            System.out.print("max"+max);
    }
}
