package july30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> country = new HashMap<>();
		int a1[] = {1,2,3,3,4,5,5,6};
		int a2[] = {};

		country.put("India", 10);
		country.put("Srilanka", 20);
		country.put("Australia", 30);
		country.put("Pakistan", 50);
		country.put("England", 80);
		//
		 System.out.println(country);
		//
		// map.put("India", 5);
		// System.out.println(map);
		//
		System.out.println(country.get("India"));
		System.out.println(country.get("US"));
		//
		System.out.println(country.containsKey("India"));
		System.out.println(country.containsKey("US"));
		
		System.out.println("**********");
		
		
		Set<String> keys = country.keySet();		//Returns a set of all the keys
		for(String i: keys) {
			System.out.println(i);
		}
		
		System.out.println("*********");
		
		Collection<Integer> values = country.values();	//Returns a collection of all the values
		for(int i: values) {
			System.out.println(i);
		}
		
		System.out.println("*************");
		
		Set<Map.Entry<String,Integer>> entries = country.entrySet();	//Returns a set of key-value pairs
		
		for(Map.Entry<String, Integer> entry: entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//
////		System.out.println(maxFreqCharacter("aaaaabbbbmmng"));
//		System.out.println(intersection(a1, a2));
	}

	public static char maxFreqCharacter(String s) {
		HashMap<Character, Integer> kmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (kmap.containsKey(s.charAt(i))) {
				int x = kmap.get(s.charAt(i));
				x = x + 1;
				kmap.put(s.charAt(i), x);
			} else {
				kmap.put(s.charAt(i), 1);
			}
		}

		int max = 0;
		char c = ' ';

		for (char key : kmap.keySet()) {
			if (max < kmap.get(key)) {
				max = kmap.get(key);
				c = key;
			}
		}

		return c;
	}

	public static ArrayList<Integer> intersection(int[] a1, int[] a2) {
		HashMap<Integer, Integer> kmap = new HashMap<>();
		for (int i = 0; i < a1.length; i++) {
			if (kmap.containsKey(a1[i])) {
				int x = kmap.get(a1[i]);
				x = x + 1;
				kmap.put(a1[i], x);
			} else {
				kmap.put(a1[i], 1);
			}
		}

		ArrayList<Integer> ans = new ArrayList();

		for (int j = 0; j < a2.length; j++) {
			if (kmap.containsKey(a2[j]) && (kmap.get(a2[j]) > 0)) {
				int x = kmap.get(a2[j]);
				x = x - 1;
				kmap.put(a2[j], x);
				ans.add(a2[j]);
			}
		}

		return ans;
	}

}
