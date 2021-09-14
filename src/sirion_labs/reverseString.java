package sirion_labs;

public class reverseString {

	public static void main(String[] args) {
		String str = "Thee Room On the Roof";
		char[] ch = str.toCharArray();
		int start = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==' ') {
				int end=i-1;
				int count = end-start;
				int k = start;
				for(int j=0; j<=count/2; j++) {
					char temp=ch[k];
					ch[k]=ch[end];
					ch[end]=temp;
					k++;
					end--;
				}
				start = i+1;
			}
		}
		String s = new String(ch);
		System.out.println(s);

	}

}
