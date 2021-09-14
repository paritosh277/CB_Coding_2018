package june28;

public class queueclient {

	public static void main(String[] args) throws Exception {

		queue q = new DynamicQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.display();

		q.dequeue();
		q.dequeue();
		System.out.println(q.size());

		q.display();

		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		q.enqueue(90);

		q.display();

		System.out.println("*******************");

		displayReverse(q,0);
		
		
		
		
		System.out.println("*******************");
		actualReverse(q);
		q.display();
		
	}

	public static void displayReverse(queue q, int count) throws Exception {
		if(count==q.size) {
			return;
		}
		
		int temp = q.dequeue();
		q.enqueue(temp);
		
		displayReverse(q,count+1);
		System.out.println(temp);
		
	}

	public static void actualReverse(queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);
	}
	
	

}
