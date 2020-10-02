package pattern_Programs;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("\t");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
