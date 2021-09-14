package july5;

import java.util.Scanner;

public class lead_a_life {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ecount = scn.nextInt();
		int[] earning = new int[ecount];
		for(int i=0;i<ecount;i++) {
			earning[i] = scn.nextInt();
		}
		
		int ccount = scn.nextInt();
		int[] cost = new int[ccount];
		
		
		
		for(int i=0;i<ecount;i++) {
			cost[i] = scn.nextInt();
		}
		
		int e = scn.nextInt();
		
		System.out.println(calculateProfit(n,earning,cost,e));
		

	}
	
	public static int calculateProfit(int n, int[] earning, int[] cost, int e) {
		int ans=0;
		for(int k=0;k<n;k++) {
			if(earning[k]==cost[k]) {
				ans=ans+0;
			}else if(k==n-1) {
				ans=ans+(earning[k]*e);
				
			}else if(earning[k]<cost[k]) {
				
				ans=ans+0;
			}else{
				ans=ans+((earning[k]*e)-(cost[k]*e));
			}
			
		}
		
		return ans;
	}

}
