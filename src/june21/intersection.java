package june21;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
       

       
        
       /* for(int i=0; i<n;i++) {
        	int t = scn.nextInt();
        	list1.add(t);
        }
        
        for(int j=0;j<m;j++) {
        	int p = scn.nextInt();
        	list2.add(p);
        }
        
        System.out.println(list1);
        System.out.println(list2);*/
        
        int[] a1= {10,20,30,30,40,40,50};
        int[] a2= {10,10,10,20,30,30,30,40,60,70};
        
        
        System.out.println(intersection1(a1,a2));
    }
	
	public static ArrayList<Integer> intersection1(int[] a1, int[] a2){
		
		int i=0,j=0;
		ArrayList<Integer> list1 = new ArrayList<>();
		
		while(i<a1.length && j<a2.length) {
			if(a1[i]==a2[j]) {
				list1.add(a1[i]);
				i++;
				j++;
			}else if(a1[i]<a2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
		return list1;
		
		
	}

}
