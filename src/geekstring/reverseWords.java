package geekstring;

public class reverseWords {

	public static void main(String[] args) {
		String str = "I love java Programming";
		StringBuilder sb = new StringBuilder();
		int j = str.length();
		for(int i=str.length()-1; i>=0; i--) {
			while(i>=0 && str.charAt(i)!=' ')
				i--;
			
			sb.append(str.substring(i+1, j));
			sb.append(" ");
			j=i;
		}
		
		System.out.println(sb.toString());

	}

}
