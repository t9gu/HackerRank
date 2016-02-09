package java;

import java.util.Scanner;

public class Strings_Token {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// Complete the code
		if (s.length() > 400000)
			return;
		if (s.length() == 0)
			System.out.println("0");
		String delims = "[ !,?._@']";
		String[] tokens = s.split(delims);
		int num_of_words = 0;
		for (String a : tokens) {
			if (a.length() > 0)
				num_of_words++;
		}
		System.out.println(num_of_words);
		for (String a : tokens) {
			if (a.length() > 0)
				System.out.println(a);
		}

	}
}
