package hackerblockss;

public class recursionMoveAllxAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		moveX("axbxa" ,"",count);

	}
	
	public static void moveX(String ques, String ans, int count) {
		if(ques.length()==0) {
			while(count>0) {
				ans=ans+'x';
				count--;
			}
			System.out.println(ans);
			
			return;
		}
		
		char ch =ques.charAt(0);
		String ros = ques.substring(1);
		
		if(ch=='x') {
			count++;
			moveX(ros, ans, count);
		}else {
			moveX(ros, ans+ch, count);
		}
	}

}
