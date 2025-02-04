//Find the maximum and minimum element in an ArrayList<Integer>.
package my_Practiceinjava;

import java.util.ArrayList;
import java.util.Collections;

public class Max_and_Min {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(12);
		list.add(15);
		list.add(9);
		list.add(18);
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		System.out.printf("Maximum among elements in array is: %d\n",max);
		System.out.printf("Minimum among elements in array is: %d",min);
		

	}
