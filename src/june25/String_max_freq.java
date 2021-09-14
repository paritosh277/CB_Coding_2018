package june25;

import java.util.Scanner;

public class String_max_freq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		System.out.println(maxfreq(name));
	}
	
	public static char maxfreq(String name) {
		int hash[]= new int[256];
		int max=-1;
		char ans=' ';
		for(int i=0;i<name.length();i++) {
			hash[name.charAt(i)]=hash[name.charAt(i)]+1;
		}
		
		for(int j=0; j<name.length();j++) {
			if(max<hash[name.charAt(j)]) {
				max=hash[name.charAt(j)];
				ans=name.charAt(j);
			}
		}
		return ans;
	}

}
