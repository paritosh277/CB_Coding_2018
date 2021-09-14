package array_i_deserve;

import java.util.HashMap;

public class First_non_repeating_character_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer>map = new HashMap<>();
		String str = "geeksforgeeks";
		
		for(int i=0; i<str.length();i++) {
			char ch =str.charAt(i);
			if(map.containsKey(ch)) {
				int val = map.get(ch);
				val=val+1;
				map.put(ch, val);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
		

	}

}
