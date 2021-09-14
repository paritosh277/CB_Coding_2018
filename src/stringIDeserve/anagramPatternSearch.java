package stringIDeserve;

import java.util.HashMap;
import java.util.Set;

public class anagramPatternSearch {

	public static void main(String[] args) {	//given two strings pattern and text, find whether any anagram of string pattern is a substring of text
//		 TODO Auto-generated method stub		//An anagram of a string is another string that contains the same characters, only the order of characters can be different
		String text = "ideserve";
		String pattern = "veer";
		boolean status =false;
		int len = pattern.length();
		int idx=0;
		HashMap<Character, Integer> textmap = new HashMap<>();
		HashMap<Character, Integer> patmap = new HashMap<>();
		
		//Mapping Pattern
		for(int i=0; i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			if(patmap.containsKey(ch)) {
				int val = patmap.get(ch);
				val= val+1;
				patmap.put(ch, val);
			}else {
				patmap.put(ch, 1);
			}
		}
		
		//Mapping text of size patternlength-1
		for(int k=0; k<len-1; k++) {
			char chh = text.charAt(k);
			if(textmap.containsKey(chh)) {
				int val = textmap.get(chh);
				val=val+1;
				textmap.put(chh, val);
			}else {
				textmap.put(chh, 1);
			}
		}
		
		for(int m = len-1; m<text.length(); m++) {
			char chhh = text.charAt(m);
			if(textmap.containsKey(chhh)) {
				int val = textmap.get(chhh);
				val=val+1;
				textmap.put(chhh, val);
			}else {
				textmap.put(chhh, 1);
			}

			if(patmap.equals(textmap)) {	//if hashmap matches
				System.out.println("True");
//				System.out.println(patmap);
//				System.out.println(textmap);
				System.out.println((m-len+1));	//Print first index of text where pattern matches
				char remo = text.charAt(m-len+1);	//remove first character of text
				int val = textmap.get(remo);
				if(val>1) {
					val=val-1;
					textmap.put(remo, val);
				}else {
					textmap.remove(remo);
				}
				status=true;
			}else {
//				System.out.println("false");
//				System.out.println(patmap);
//				System.out.println(textmap);
				char remo = text.charAt(m-len+1);	//remove first character of text
				int val = textmap.get(remo);
				if(val>1) {
					val=val-1;
					textmap.put(remo, val);
				}else {
					textmap.remove(remo);
				}
			}
		}
		if(status==false) {
			System.out.println("false");
		}
	}
}
