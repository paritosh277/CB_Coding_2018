package stringIDeserve;

public class lcsUsingRecursion {
	
	public static int lcs(String s1, String s2) {
		if(s1.length()==0 || s2.length()==0) {
			
			return 0;
		}
		
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		
		//if character matches
		if(ch1==ch2) {
			int i = 1+lcs(ros1,ros2);
			return i;
		}else {					//if character do not matches
			int j = lcs(s1, ros2);
			int k = lcs(ros1, s2);
			return Math.max(j, k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="AXYT";
		String s2 ="AYZX";
		
		int ans = lcs(s1,s2);
		System.out.println(ans);

	}

}
