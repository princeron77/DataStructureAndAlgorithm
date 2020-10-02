package pattern_Programs;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("\t");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
	

}
