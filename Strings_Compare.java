package java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strings_Compare {
	public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String main = br.readLine();
        int subLength = Integer.parseInt(br.readLine());
        List<String> mainSub = new ArrayList<String>();
        for (int i=0;i<=main.length()-subLength;i++)
            mainSub.add(main.substring(i,i+subLength));
        Collections.sort(mainSub);
        System.out.println(mainSub.get(0));
        System.out.println(mainSub.get(mainSub.size()-1));
    }
}
