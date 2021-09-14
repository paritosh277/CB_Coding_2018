package Hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class highestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		HashMap<Integer,Integer> frequency = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(frequency.containsKey(arr[i])) {
				int val = frequency.get(arr[i]);
				val= val+1;
				frequency.put(arr[i], val);
			}else {
				frequency.put(arr[i], 1);
			}
		}
		
		Set<Integer> keys = frequency.keySet();
		int maxvalue = 0;
		int maxkey =0;
		for(int i : keys) {
			if(maxvalue<frequency.get(i)) {
				maxvalue=frequency.get(i);
				maxkey=i;
			}
		}
		System.out.println(maxkey);
		

	}

}
