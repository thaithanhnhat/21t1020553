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
public class amduong {
    public static void main(String[] args) {
       boolean wenttocatch = false;
            Scanner scan = new Scanner(System.in);
            int a=0;
            System.out.println("Nhap n: ");
            do{            
                if(scan.hasNextInt()){
                    a = scan.nextInt(); 
                    wenttocatch = true;
                }else{
                    scan.nextLine();
                    System.out.println("Khong hop le,Nhap lai ");
                }
            }while(!wenttocatch);
        if(a>0){
            System.out.print("So duong");
        }
        else{
            if(a!=0){
                System.out.print("So am");
            }
        }
    }
}
