package june29;

import java.util.Scanner;

public class shopping_game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			
			int x = win(m,n);
			if(x==1) {
				System.out.println("Aayush");
			}else {
				System.out.println("Harshit");
			}
			t--;
		}

	}
	
	public static int win(int a, int h) {
		int count = 1;
		while(a>0 && h>0) {
			if(count%2 !=0) {
				a=a-count;
			}else {
				h=h-count;
			}
			count++;
		}
		if(h<0) {
			return 1;
		}else {
			return 2;
		}
	}

}
