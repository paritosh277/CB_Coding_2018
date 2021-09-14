package array_i_deserve;

import java.util.HashMap;
import java.util.Set;

public class countFrequenciesOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,3,2,5};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				int val = map.get(key);
				val=val+1;
				map.put(key, val);
			}else {
				map.put(key, 1);
			}
			
		}
		
		for(int i=1; i<=arr.length; i++) {
			if(!map.containsKey(i)) {
				map.put(i, 0);
			}
		}
		
		Set<Integer> keys = map.keySet();
		for(int i: keys) {
			System.out.println(i + " "+ map.get(i));
		}

	}

}
