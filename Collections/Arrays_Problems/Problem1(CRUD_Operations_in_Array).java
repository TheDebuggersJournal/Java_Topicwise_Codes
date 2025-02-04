package my_Practiceinjava;

import java.util.ArrayList;

public class Crud_Operations_array {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//Insert elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//Retrieve an element
		System.out.println("Element at index 2: "+list.get(2));
		
		//Remove an element
		list.remove(1);     //Remove element at index 1
		System.out.println("Updated List: "+list);

	}

}
