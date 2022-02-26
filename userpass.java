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
public class userpass {
    public static void main(String[] args) {
        String user;
        String pass;
        String unlock = "HuyHoang";
        String unlockpass = "2021";
        Scanner a = new Scanner(System.in);
        user = a.nextLine();
        pass = a.nextLine();
        if(user.equals(unlock)==true && pass.equals(unlockpass)==true ){
            System.out.printf("nhapdung(u,p)");
        }
        else{
            System.out.printf("nhapsai");
        }
        
    }
}
