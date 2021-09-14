import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1,j,k,l,m,o;
		for(i=1;i<=n;i++) {
			for(j=n-1;j>=i;j--) {
				 System.out.print(" ");
			}
			for(k=n;k>=i;k--) {
				 System.out.print("*");
			}
			 System.out.println( );
		}
		
		for(l=1;l<=n-1;l++) {
			for(m=1;m<=l;m++) {
				System.out.print(" ");
			}
			for(o=1;o<=l+1;o++) {
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
