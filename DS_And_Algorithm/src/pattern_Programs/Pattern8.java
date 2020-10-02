package pattern_Programs;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int sp=n-1;
		int st=1;
		
		for(int i=1;i<=n;i++) {
			//System.out.println(sp+" , "+st);
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("*\t");
			}
			
			if(i>=1) {
				sp--;
			}
			System.out.println();
		}

	}

}
