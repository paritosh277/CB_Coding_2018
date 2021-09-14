package myStrings;

public class reverseString {

	public static void main(String[] args) {
		String str = "I love java Programming";
		char[] ch = str.toCharArray();
		
		for(int i =ch.length-1; i>=0; i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			
			for(int j = i+1; j<=k; j++) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
	
		}

	}

}
