package myStrings;

public class countCharSamePosAsInEngAlpha {

	public static void main(String[] args) {
		
		String str="alphabetical";
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			if(i==str.charAt(i)-65 || i==str.charAt(i)-97) {
				result++;
			}
		}
		System.out.println(result);

	}

}
