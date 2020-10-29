package group17;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		//write a method which identifies given number is even or odd
		
		
	        Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = reader.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
	    }
	
public static void main1(String[]args) {
	}
}

