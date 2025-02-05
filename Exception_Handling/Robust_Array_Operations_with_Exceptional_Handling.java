package wipropart1day5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_try_catch {
	
    public static void main(String[] args) {
    	
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter number of elements to be inserted in array: ");
            int noOfElements = sc.nextInt();
            
            for (int i = 0; i < noOfElements; i++) {
                System.out.printf("Enter Element %d: ", i + 1);
                int element = sc.nextInt();
                list.add(element);
            }
            
            System.out.printf("Enter an index to access (0-%d): ", noOfElements - 1);
            int index = sc.nextInt();
            
            int value = list.get(index); 
            
            try {
                System.out.print("Enter a number to divide the accessed value: ");
                int divisor = sc.nextInt();
                int result = value / divisor;
                
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter an index within the valid range.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
