/*1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.*/

import java.util.*;
public class Pythagorean_Triplets {
	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		int b=z.nextInt();
		int c=z.nextInt();
		
		int max=a;
		if(b>=max) {
			max=b;
		}
		if(c>=max) {
			max=c;
		}
		
		if(max==a) {
			boolean flag=(a*a==(b*b+c*c));
			System.out.println(flag);
		}
		else if(max==b) {
			boolean flag=(b*b==(a*a+c*c));
			System.out.println(flag);
		}
		else if(max==c) {
			boolean flag=(c*c==(a*a+b*b));
			System.out.println(flag);
		}
	}

}
