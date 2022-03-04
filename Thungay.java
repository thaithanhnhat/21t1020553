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
public class Thungay {
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
        switch(a){
            case 2:{
                System.out.println("Thu 2");
                break;
            }
            case 3:{
                System.out.println("Thu 3");
                break;
            }
            case 4:{
                System.out.println("Thu 4");
                break;
            }
            case 5:{
                System.out.println("Thu 5");
                break;
            }
            case 6:{
                System.out.println("Thu 6");
                break;
            }
            case 7:{
                System.out.println("Thu 7");
                break;
            }
            case 8:{
                System.out.println("Chu nhat");
                break;
            }
            default:
                System.out.println("Khong Hop le: ");
        }
    }
}

