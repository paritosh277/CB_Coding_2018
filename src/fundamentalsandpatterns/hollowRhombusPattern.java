package fundamentalsandpatterns;

import java.util.Scanner;

public class hollowRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			if(i==1||i==n) {
				for(int k=1; k<=n; k++){
					System.out.print("*");
				}
				
			}else {
				for(int k=1; k<=n; k++){
					if(k==1||k==n){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
