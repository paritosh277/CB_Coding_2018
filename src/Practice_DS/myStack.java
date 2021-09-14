package Practice_DS;

import java.util.Scanner;

public class myStack {
	
	protected int[] data;
	protected int tos;
	
	public myStack() {
		this.data = new int[5];
		this.tos= -1;
	}
	
	public myStack(int cap) {
		this.data = new int[cap];
		this.tos =-1;
	}
	
	public int size() {
		return this.tos+1;
	}
	
	public void push(int item) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception("Stack is full");
		}
		
		this.tos++;
		this.data[this.tos]=item;
	}
	
	public int pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.tos];
		this.data[this.tos]=0;
		this.tos--;
		return rv;
	}
	
	public int peek() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.tos];
		return rv;
		
	}
	
	public void display() {
		System.out.println("*********");
		for(int i=this.tos; i>=0; i--) {
			System.out.println(this.data[i]);
		}
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of stack");
		int n = scn.nextInt();
		myStack s = new myStack(n);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		
		s.display();
		
//		s.pop();
//		s.pop();
//		s.pop();
//		
//		s.display();
//		
//		System.out.println(s.peek());
		
		reverseStack(s);
		
	}
	
	public static void reverseStack(myStack s) throws Exception{
		if(s.size()==0) {
			return;
		}
		
		int temp = s.pop();
		reverseStack(s);
		System.out.println(temp);
		s.push(temp);
	}
}


