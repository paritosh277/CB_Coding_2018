package july2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class infosys {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(getSS("abc"));

	}
	
	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {
			mr.add(rrs);
			System.out.println(mr);
			mr.add(ch + rrs);
			System.out.println(mr);
			

		}
		Collections.sort(mr);
		
		return mr;
	}

}
