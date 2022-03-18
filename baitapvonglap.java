package vonglap;

import java.util.Scanner;

public class baitapvonglap {
	static int tong(int n) {
		if(n==0){
	        return 0;
	    }
		else if(n==1) {
			return 1;
		}
	    return n+tong(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao N: ");
		int n = scan.nextInt();
		
		if(n%2==0){
			System.out.print("tich n chan = " + tong(2*n));
		}
		else {
			System.out.print("tich n le = " + tong(n));
		}
		float tong = 1;
		for(int i=2;i<=n;i++) {
			tong =  tong + (float)1/i;
		}
		System.out.print("\ntong 1+1/2....+1/n = " + tong);
	}

}
