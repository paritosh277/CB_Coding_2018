package july30;

import java.util.Comparator;

public class Generics {

	public static void main(String[] args) {
		Car[] cars = new Car[5];

		cars[0] = new Car(90, 8, "black");
		cars[1] = new Car(70, 7, "white");
		cars[2] = new Car(200, 25, "red");
		cars[3] = new Car(150, 10, "blue");
		cars[4] = new Car(100, 9, "yellow");

		display(cars);
		//bubblesort(cars);
		bubblesort(cars, new CarSpeedComparator());
		display(cars);
		
		LinkedListGenerics<Car> ll = new LinkedListGenerics<>();
		ll.addLast(new Car(1000,20,"Black"));
		ll.addLast(new Car(50, 200, "Red"));
		ll.addLast(new Car(300, 10, "Yellow"));
		ll.addLast(new Car(600, 250, "White"));
		ll.addFirst(new Car(700, 300 , "Grey"));
		
		ll.display();
		
		
	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
	
	public static <T> void bubblesort(T[] arr, Comparator<T> Comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (Comparator.compare(arr[j],arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
	
	
	
	

	public static <T> void display(T[] arr) {
		System.out.println("-----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
	}

}
