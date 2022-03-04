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
public class baso {
    public static void main(String[] args) {
       boolean wenttocatch = false;
            Scanner scan = new Scanner(System.in);
            float a=0;
            float b=0;
            System.out.println("Nhap a,b: ");
            do{            
                if(scan.hasNextFloat()){
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    wenttocatch = true;
                }else{
                    scan.nextLine();
                    System.out.println("Khong hop le,Nhap lai ");
                }
            }while(!wenttocatch);
            if((a%1000)==(b%1000)){
                System.out.println("Bang nhau");
            }
            else{
                System.out.println("khac nhau");
            }
    }
}
