package geekstring;

public class comparetwostringslexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ramm";
		String s2 = "Ramm";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		int i = 0;
		
		
		while(i<ch1.length && ch1[i] == ch2[i]) {
			i++;
		}
		
		if(i==ch1.length) {
			System.out.println(0);
		}else {
			System.out.println(ch1[i]-ch2[i]); 
		}
		
	 

	}

}
