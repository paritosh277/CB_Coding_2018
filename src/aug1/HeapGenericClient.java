package aug1;

import july30.Car;

public class HeapGenericClient {

	public static void main(String[] args) {
		HeapGeneric<Car> heap = new HeapGeneric<>();
		
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 20, "Black");
		cars[1] = new Car(50, 200, "Red");
		cars[2] = new Car(300, 10, "Yellow");
		cars[3] = new Car(600, 250, "White");
		cars[4] = new Car(700, 300, "Grey");
		
		heap.add(cars[0]);
		heap.add(cars[1]);
		heap.add(cars[2]);
		heap.add(cars[3]);
		heap.add(cars[4]);
		
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());

	}
	
	public class Pair implements Comparable<Pair>{
		int data;
		int listNo;
		int indexNo;
	}
	
	public int compareTo(Pair other) {
		return other.data - this.data;
	}

}
