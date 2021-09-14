package june25;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_eratosthenes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		SOE(n);

	}
	
	public static void SOE(int n) {
		boolean[] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		
		for(int table=2; table*table<=n; table++) {
			
			if(primes[table]==true) {
				for(int mul=2; table*mul<=n;mul++) {
					primes[table * mul]=false;
				}
			}
		}
		
		for(int i=0;i<primes.length;i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}

}
