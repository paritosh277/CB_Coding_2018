package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class hashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Employee> emp = new HashMap<>();
		Employee e1 = new Employee("Paritosh", 22, "CSE");
		Employee e2 = new Employee("Kartik", 23, "MBA");
		Employee e3 = new Employee("Ritz", 22, "MBBS");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		Set<Map.Entry<Integer,Employee>> entries = emp.entrySet();
		for(Map.Entry<Integer, Employee> entry : entries) {
			Employee e =entry.getValue();
			System.out.println(entry.getKey() + " "+ e.name +" "+ e.age +" "+ e.dept);
		}
		
//		for(Entry<Integer, Employee> m : emp.entrySet()) {
//			int key = m.getKey();
//			Employee e = m.getValue();
//			System.out.println("Employee "+ key+ " Info: ");
//		}
//		
		
//		HashMap<Integer, String> player = new HashMap<>();
//		player.put(1,"India");
//		player.put(2, "Pakistan");
//		player.put(3, "Australia");
//		player.put(4,  "South Africa");
//		
//		System.out.println(player);
//		
//		Set<Map.Entry<Integer,String>> entries = player.entrySet();
//		for(Map.Entry<Integer, String> entry : entries) {
//			System.out.println(entry.getKey() + " "+ entry.getValue());
//		}
		

	}

}
