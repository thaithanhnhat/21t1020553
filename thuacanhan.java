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
public class thuacanhan {
    public static void main(String[] args){
        boolean wenttocatch = false;
            Scanner scan = new Scanner(System.in);
            float a=0;
            float b=0;
            System.out.println("Nhap thu nhap , status: ");
            do{            
                if(scan.hasNextFloat()){
                    a = scan.nextFloat(); 
                    b = scan.nextFloat();
                    wenttocatch = true;
                }else{
                    scan.nextLine();
                    System.out.println("Khong hop le,Nhap lai thu nhap ");
                }
            }while(!wenttocatch);
            if(b == 0){
                if(a>=0 && a<=8350){
                    System.out.print("Thue la: " + a*(10/100));
                }
                else if(a>=8351 && a<=33950){
                    System.out.print("Thue la: " + a*(15/100));
                }
                 else if(a>=33951 && a<=82250){
                    System.out.print("Thue la: " + a*(25/100));
                }
                 else if(a>=82251 && a<=171550){
                    System.out.print("Thua la: " + a*(28/100));
                }
                 else if(a>=171551 && a<=372950){
                    System.out.print("Thua la: " + a*(33/100));
                }
                 else{
                     System.out.print("Thua la: " + a*(35/100));
                 }
            }
            if(b == 1){
                if(a>=0 && a<=16700){
                    System.out.print("Thua la: " + a*(10/100));
                }
                else if(a>=16701 && a<=67901){
                    System.out.print("Thua la: " + a*(15/100));
                }
                 else if(a>=67901 && a<=137050){
                    System.out.print("Thua la: " + a*(25/100));
                }
                 else if(a>=137501 && a<=208850){
                    System.out.print("Thua la: " + a*(28/100));
                }
                 else if(a>=208851 && a<=372950){
                    System.out.print("Thua la: " + a*(33/100));
                }
                 else{
                     System.out.print("Thua la: " + a*(35/100));
                 }
                
            }
            if(b == 2){
                if(a>=0 && a<=8350){
                    System.out.print("Thua la: " + a*(10/100));
                }
                else if(a>=8351 && a<=33950){
                    System.out.print("Thua la: " + a*(15/100));
                }
                 else if(a>=33951 && a<=68525){
                    System.out.print("Thua la: " + a*(25/100));
                }
                 else if(a>=68526 && a<=104425){
                    System.out.print("Thua la: " + a*(28/100));
                }
                 else if(a>=104426 && a<=186475){
                    System.out.print("Thua la: " + a*(33/100));
                }
                 else{
                     System.out.print("Thua la: " + a*(35/100));
                 }
                
            }
            if(b == 3){
                if(a>=0 && a<=11950){
                    System.out.print("Thua la: " + a*(10/100));
                }
                else if(a>=11951 && a<=45500){
                    System.out.print("Thua la: " + a*(15/100));
                }
                 else if(a>=45501 && a<=117450){
                    System.out.print("Thua la: " + a*(25/100));
                }
                 else if(a>=117451 && a<=190200){
                    System.out.print("Thua la: " + a*(28/100));
                }
                 else if(a>=190201&& a<=372950){
                    System.out.print("Thua la: " + a*(33/100));
                }
                 else{
                     System.out.print("Thua la: " + a*(35/100));
                 }
                
            }
            
    }
}
