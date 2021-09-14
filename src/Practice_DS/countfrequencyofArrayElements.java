package Practice_DS;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class countfrequencyofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
	    	if(map.containsKey(arr[i])) {
	    		int val = map.get(arr[i]);
	    		val=val+1;
	    		map.put(arr[i], val);
	    	}else {
	    		map.put(arr[i], 1);
	    	}
	    }
		
		 Set<Integer> keys = map.keySet();
		 for(int i=0; i<arr.length; i++) {
			 if(map.get(arr[i])>0) {
				 System.out.println(arr[i]+" "+map.get(arr[i]));
//				 System.out.print(arr[i]+" ");
				 map.put(arr[i], -1);
			 }
		 }

	}

}
