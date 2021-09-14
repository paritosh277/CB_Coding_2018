package june25;

import java.util.Scanner;

public class Pair_of_roses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int price[]= new int[n];
			for(int i=0;i<n;i++) {
				price[i]=scn.nextInt();
			}
			
			int m = scn.nextInt();
			int p1=0,p2=0;
			
			//sort
			for(int i=0; i<price.length-1; i++) {
				for(int j=0;j<price.length-1-i;j++) {
					if(price[j]>price[j+1]) {
						int temp=price[j];
						price[j]=price[j+1];
						price[j+1]=temp;
					}
				}
			}
			
			for(int k=0;k<price.length-1;k++) {
				if(m == (price[k]+price[k+1])) {
					p1=price[k];
					p2=price[k+1];
				}
			}
			
			System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
			t--;
			
		}
		

	}

}
