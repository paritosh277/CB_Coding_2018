package hackerblockss;

public class stringSort {
	
	public static int mycompareTo(String str1, String str2) {
		int i= 0;
		while(i<str1.length() && i<str2.length()) {
			if(str1.charAt(i) > str2.charAt(i)) {
				return 1;
			}
			
			if(str1.charAt(i) < str2.charAt(i)) {
				return -1;
			}
			
			i++;
		}
		
		if(str2.length()>str1.length()) {
			return 1;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Peach" , "Orange", "Mango", "Cherry", "Apple"};
//		for(int i=0; i<name.length-1;i++) {
//			for(int j=i+1; j<name.length; j++) {
//				if(mycompareTo(name[i], name[j])>0) {
//					String temp = name[i];
//					name[i] = name[j];
//					name[j] = temp;
//				}
//			}
//		}
		
		for(int i=0; i<name.length-1;i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].compareTo(name[j])>0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		
		for(int k=0; k<name.length; k++) {
			System.out.print(name[k]+" ");
		}
	}

}
