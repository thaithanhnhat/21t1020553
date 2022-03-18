package vonglap;

import java.util.Scanner;

public class vonglapfor2 {
	static int tong(int n) {
		if(n==0 || n==1){
	        return 1;
	    }
	    return n*tong(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%2==0){
			System.out.print("tong = " + tong(2*n));
		}
		else {
			System.out.print("tong = " + tong(n));
		}
		
	}

}
