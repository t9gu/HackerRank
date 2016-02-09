package java;

import java.util.Scanner;

class myRegex {
	// if \d inside "" need to change to \\d , if \. inside "" need to change to \\.
	String pattern = "((2[0-4][0-9]|25[0-5]|[01]?[0-9][0-9]?)\\.){3}(2[0-4][0-9]|25[0-5]|[01]?[0-9][0-9]?)";
}

public class Strings_Regex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
		}

	}
}
