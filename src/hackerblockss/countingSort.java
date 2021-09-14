package hackerblockss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class countingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				val=val+1;
				map.put(arr[i], val);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
		Collections.sort(sortedKeys);
		
//		Set<Integer> keys = map.keySet();
		for(int i: sortedKeys) {
			System.out.println(i+ ": "+ map.get(i));
		}
		
		int i=0;
		for(int j: sortedKeys) {
			int z = map.get(j);
			while(z>0) {
				arr[i]=j;
				i++;
				z--;
			}
		}
		
		for(int b=0; b<n; b++) {
			System.out.print(arr[b]+" ");
		}
		
		
		
		

	}

}
