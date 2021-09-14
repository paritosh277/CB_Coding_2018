package june28;

import java.util.Scanner;

public class stackclient {

	public static void main(String[] args) throws Exception {
//		stack s = new DynamicStack();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of integer stack");
		int n = scn.nextInt();
		
		stack s = new stack(n);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		
//		System.out.println("Size of stack " + s.size());
//
//		System.out.println(s.pop());
//		s.pop();
		s.display();
		System.out.println("***********");
		 displayReverse(s);
		// actualReverse(s, new DynamicStack());
		// s.display();
		// System.out.println("***********");
		// System.out.println(s.peek());

//		int[] arr = { 2, 1, 8, 7, 6, 10, 3 };
//		nextGreatestElement(arr);
//
//		System.out.println("***********");
//
//		int[] prices = { 20, 40, 5, 60, 80, 50, 30, 45, 65 };
//		int[] ans = stockSpan(prices);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
	}

	public static void displayReverse(stack s) throws Exception {
		if (s.isEmpty()) {
			return;
		}
		int temp = s.pop();
		displayReverse(s);
		System.out.println(temp);
		s.push(temp);

	}

	public static void actualReverse(stack s, stack helper) throws Exception {
		if (s.isEmpty()) {
			actualReverseH(s, helper);
			return;
		}

		int temp = s.pop();
		helper.push(temp);
		actualReverse(s, helper);

	}

	public static void actualReverseH(stack s, stack helper) throws Exception {
		if (helper.isEmpty())
			return;

		int temp = helper.pop();
		actualReverseH(s, helper);
		s.push(temp);
	}

	public static void nextGreatestElement(int[] arr) throws Exception {
		stack s = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > s.peek()) {
				System.out.println(s.pop() + "->" + arr[i]);
			}
			s.push(arr[i]);

		}

		while (!s.isEmpty()) {
			System.out.println(s.pop() + "-> -1");
		}

	}

	public static int[] stockSpan(int[] prices) throws Exception {
		stack s = new DynamicStack();
		int[] span = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[i] > prices[s.peek()]) {
				s.pop();

			}

			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}

			s.push(i);
		}
		return span;

	}

}
