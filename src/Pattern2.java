import java.util.Scanner;
public class Pattern2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i,j=1;
		for(i=1;i<=n;i++){
		    for(j=1;j<=i;j++){
		        if((j==i)||(j==1)){
		            System.out.print(i);
		        }else{
		         System.out.print("0");
		        }
		    }
		    System.out.println("");
		    
		}
    }
}