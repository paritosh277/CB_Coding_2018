package june21;

import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1,num2;
		char ch;
		
		
		do 
		{
				ch = scn.next().charAt(0);
				switch(ch) 
				{
					case '+':
						num1= scn.nextInt();
						num2= scn.nextInt();
						System.out.println(num1+num2);
						break;
						
					case '-':
						num1= scn.nextInt();
						num2= scn.nextInt();
						System.out.println(num1-num2);
						break;
						
					case '*':
						num1= scn.nextInt();
						num2= scn.nextInt();
						System.out.println(num1*num2);
						break;
						
					case '/':
						num1= scn.nextInt();
						num2= scn.nextInt();
						System.out.println(num1/num2);
						break;
						
					case '%':
						num1= scn.nextInt();
						num2= scn.nextInt();
						System.out.println(num1%num2);
						break;
					
					case 'X':
						System.exit(0);
						
					case 'x':
						System.exit(0);
						
					default:
						System.out.println("Invalid operation. Try again");
				/*}else if(ch=='-') {
					num1= scn.nextInt();
					num2= scn.nextInt();
					System.out.println(num1-num2);
				}else if(ch=='*') {
					num1= scn.nextInt();
					num2= scn.nextInt();
					System.out.println(num1*num2);
				}else if(ch=='/') {
					num1= scn.nextInt();
					num2= scn.nextInt();
					System.out.println(num1/num2);
				}else if(ch=='%') {
					num1= scn.nextInt();
					num2= scn.nextInt();
					System.out.println(num1%num2);
				}else if(ch=='X' || ch=='x') {
					System.exit(0);
					
				}else {
					System.out.println("Invalid operation. Try again");
				}*/
			}
			
		}while(ch!='X' || ch!='x');

	}

}
