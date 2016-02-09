package java;

import java.util.Scanner;

public class Strings_Reverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		char[] B = A.toCharArray();
		int i1 = 0;
		int i2 = B.length - 1;
		while (i2 > i1) {
			if (B[i1] != B[i2]) {
				System.out.println("No");
				return;
			}
			++i1;
			--i2;
		}
		System.out.println("Yes");

	}
}
