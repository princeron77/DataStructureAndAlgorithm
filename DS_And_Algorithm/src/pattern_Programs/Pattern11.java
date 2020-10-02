package pattern_Programs;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		
		int value=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		
		

	}

}
