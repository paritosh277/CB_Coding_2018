package geekstring;

public class getFirstLetterOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Geeks for geeks";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ')
				sb.append(str.charAt(i+1));
			
		}
		
		System.out.println(sb.toString());

	}

}
