package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class arrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 1, 5, 2, 3, 6 }; 
	    int arr2[] = { 3, 8, 6, 20, 7 };
//	    Arrays.sort(arr1);
//	    Arrays.sort(arr2);
//	    ArrayList<Integer> arr = new ArrayList<>();
//	    
//	    int i=0, j=0;
//	    while(i<arr1.length && j<arr2.length) {
//	    	if(arr1[i]>arr2[j]) {
//	    		j++;
//	    	}else if(arr1[i]<arr2[j]) {
//	    		i++;
//	    	}else {
//	    		arr.add(arr1[i]);
//	    		i++;
//	    		j++;
//	    	}
//	    }
//	    
//	    System.out.println(arr);
	    
	    /**************Intersection using hash******************/
	    
//	    HashMap<Integer, Integer> number = new HashMap<>();
//	    for(int i=0; i<arr1.length; i++) {
//	    	if(number.containsKey(arr1[i])) {
//	    		int val = number.get(arr1[i]);
//	    		val=val+1;
//	    		number.put(arr1[i], val);
//	    	}else {
//	    		number.put(arr1[i], 1);
//	    	}
//	    }
//	    
//	    ArrayList<Integer> ans = new ArrayList<>();
//	    for(int j=0; j<arr2.length; j++) {
//	    	if(number.containsKey(arr2[j]) && number.get(arr2[j])>0) {
//	    		ans.add(arr2[j]);
//	    		int val = number.get(arr2[j]);
//	    		val=val-1;
//	    		number.put(arr2[j], val);
//	    	}
//	    }
//	    
//	    System.out.println(ans);
	    
	    /************************Union using Hash***************************/
	    
	    HashMap<Integer, Integer> number = new HashMap<>();
	    for(int i=0; i<arr1.length; i++) {
	    	if(number.containsKey(arr1[i])) {
	    		int val = number.get(arr1[i]);
	    		val=val+1;
	    		number.put(arr1[i], val);
	    	}else {
	    		number.put(arr1[i], 1);
	    	}
	    }
	    
	    for(int i=0; i<arr2.length; i++) {
	    	if(number.containsKey(arr2[i])) {
	    		int val = number.get(arr2[i]);
	    		val=val+1;
	    		number.put(arr2[i], val);
	    	}else {
	    		number.put(arr2[i], 1);
	    	}
	    }
	    
	    Set<Integer> keys = number.keySet();
	    for(int i: keys) {
	    	System.out.print(i+ " ");
	    }

	}

}
