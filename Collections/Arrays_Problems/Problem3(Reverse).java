//Reverse an ArrayList Without Using Collections.reverse()
package my_Practiceinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_an_Array {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry","Date"));
		
		int left = 0, right = list.size() - 1;
		while(left<right) {
			Collections.swap(list, left, right);
			left++;
			right--;
		}
		System.out.println("Reversed List: "+ list);

	}

}
