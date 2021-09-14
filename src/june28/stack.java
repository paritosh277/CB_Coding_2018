package june28;

public class stack {
	protected int[] data;
	protected int tos;  //top of stack
	
	
	//Default constructor
	public stack() {
		this.data=new int[5];
		this.tos=-1;
	}
	
	//Parameterized constructor
	public stack(int cap) {
		this.data = new int[cap];
		this.tos=-1;					//{tos is like index of data array}
	}
	
	public int size() {					//{size is size of data array}
		return this.tos+1;
	}
	
	public boolean isEmpty() {
		if(this.tos<=-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int item) throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		this.data[this.tos]=item;
	}
	
	public int pop() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		
//		if(this.size()==0) {
//			throw new Exception("Stack is Empty");
//		}
		
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}
	
	public int peek() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.data[this.tos];
		return rv;
		
	}
	
	public void display() {
		System.out.println("***********************");
		for(int i=this.tos;i>=0;i--) {
			System.out.println(this.data[i]);
		}
	}

}
