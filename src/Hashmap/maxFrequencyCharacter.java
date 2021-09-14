package Hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class maxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		HashMap<Character, Integer> maxfreq = new HashMap<>();
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(maxfreq.containsKey(ch)) {
				int val = maxfreq.get(ch);
				val=val+1;
				maxfreq.put(ch, val);
			}else {
				maxfreq.put(ch, 1);
			}
		}
		
		Set<Character> keys = maxfreq.keySet();
		int max = 0;
		char cmax=' ';
		for(Character c : keys) {
			if(max<maxfreq.get(c)) {
				max=maxfreq.get(c);
				cmax = c;
			}
		}
		
		System.out.println(cmax);

	}

}
