package myStrings;

public class countWords {

	public static void main(String[] args) {
		String str = "The room on the roof";
		int ans =0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ' || str.charAt(i)== '\n' || str.charAt(i) == '\t') {
				ans++;
			}
		}
		System.out.println(ans+1);

	}

}
