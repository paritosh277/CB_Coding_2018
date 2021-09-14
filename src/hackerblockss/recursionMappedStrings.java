package hackerblockss;

import java.util.Scanner;

public class recursionMappedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		mapped(num);

	}
	
	public static void mapped(int num) {

        helper_mapped(num +"", "");
    }

    public static void helper_mapped(String ques, String ans) {
    	
    	System.out.println("ques "+ ques);
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

//        int n1 = Integer.parseInt(num.substring(0, 1));
        int n1 = ques.charAt(0)-'0';
        System.out.println("n1 "+n1);
        String ros1 = ques.substring(1);
        System.out.println("ros1 "+ros1);
        helper_mapped(ros1, ans + (char) (64 + n1));

        if (ques.length() >= 2) {
        	System.out.println("*");
            int n2 = Integer.parseInt(ques.substring(0, 2));
            if (n2 <= 26) {
                String ros2 = ques.substring(2);
                helper_mapped(ros2, ans + (char) (64 + n2));
            }
        }
    }

}
