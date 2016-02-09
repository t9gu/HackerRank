package java;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_Anagrams {
	static boolean isAnagram(String A, String B) {
		// Complete the function
		char[] word1 = A.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		char[] word2 = B.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
