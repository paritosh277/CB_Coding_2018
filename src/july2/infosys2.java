package july2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class infosys2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		ArrayList<String> zr =	getSS(name);
		zr.remove(0);
		System.out.println(zr);

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
			
			mr.add(ch + rrs);
			
			

		}
		Collections.sort(mr);
		return mr;
	}

}
