package pattern_Programs;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		
		int st=n/2+1;
		int sp=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			for(int k=1;k<=sp;k++) {
				System.out.print("\t");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				st--;
				sp+=2;
				
			}
			else {
				st++;
				sp-=2;
			}
			System.out.println();
		}

	}

}
