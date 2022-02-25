package BAITAPOJ;
import java.util.Scanner;

public class ramdom2so {
    public static void main(String[] args){
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        int a;      
            while(true){
                double ramdom1 = Math.random();
                double ramdom2 = Math.random();
                ramdom1 = ramdom1 * 10 + 1;
                ramdom2 = ramdom2 * 10 + 1;
                int ramdomInt1 = (int) ramdom1;
                int ramdomInt2 = (int) ramdom2;
                if(ramdomInt1 >= ramdomInt2){
                    System.out.println(ramdomInt1 + "-" + ramdomInt2 + " = ?");
                    a = scan.nextInt();
                    if(a == (ramdomInt1 - ramdomInt2)){
                        System.out.println("Ket qua dung");
                    }
                    else{
                        System.out.println("Ket qua sai. Dap an: " + (ramdomInt1-ramdomInt2));
                    }
                }
                
                
                
            }
        
        
        
        
    }
}
