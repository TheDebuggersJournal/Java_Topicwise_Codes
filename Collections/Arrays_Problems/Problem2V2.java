package my_Practiceinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Max_and_min_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,10,3,2,8,7);
		
		int max= list.get(0);
		int min = list.get(0);
		
		for (int element:list) {
			if(element>max) {
				max= element;
			}
			else if(element < min) {
				min = element;
			}
			
		}
		System.out.printf("maximum in given array: %d\n Minimum in given array: %d\n",max,min);
		
		
		
	}
}
