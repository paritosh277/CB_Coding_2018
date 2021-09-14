package array_i_deserve;

public class shortest_range_in_k_sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int z=0;
		int[] arr1= {4,10,15,24,26};
		int[] arr2= {0,9,12,20};
		int[] arr3= {5,18,22,30};
		int min=0;
		int max=0;
		int range=0;
		int minRange=Integer.MAX_VALUE;
		int minRangeMin=0;
		int maxRangeMin=0;
		
		while(x!=arr1.length && y!=arr2.length && z!=arr3.length ) {
			min = Math.min(arr1[x], Math.min(arr2[y], arr3[z]));
//			System.out.println(min);
			max = Math.max(arr1[x], Math.max(arr2[y], arr3[z]));
//			System.out.println(max);
			range = max-min;
			if(range<=minRange) {
				minRange=range;
				minRangeMin=min;
				maxRangeMin=max;
			}
			
			if(min==arr1[x]) {
				x++;
			}
			
			if(min == arr2[y]) {
				y++;
			}
			
			if(min == arr3[z]) {
				z++;
			}
		}
		
		System.out.println(minRangeMin +", "+ maxRangeMin);

	}

}
