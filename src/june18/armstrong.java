package june18;
import java.util.Scanner;
public class armstrong {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = num;
        int count=0,rem;
		while(num>0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		
		boolean ans = isArmstrong(n,count);
		System.out.println(ans);

    }
    
    public static boolean isArmstrong(int num, int count) {
		int onum=num;
		int ans=0,rem;
		while(num>0) {
			rem=num%10;
			ans=ans + (int) Math.pow(rem,count);
			num=num/10;
		}
		
		if(ans==onum) {
			return true; 
		}else {
			return false;
		}
		
	}
}