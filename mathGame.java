import java.io.*;
import java.util.Scanner;

public class mathGame{

	public static void main(String args[]){
		//Gets desired output
		System.out.println("Enter the desired output: ");
		Scanner scanner = new Scanner(System.in);
		String total = scanner.nextLine();

		//Gets array of numbers
		System.out.println("Enter the four numbers, separated by spaces: ");
		String numbers = scanner.nextLine();
		String[] arrayOfNumbers = numbers.trim().split("\\s+");
		mathGame(total, arrayOfNumbers);
	}

	public static void mathGame(String total, String [] numbers){
		String ans ="Your username is " + total;
		for(String x : numbers)
			System.out.println(x);
		
	}

	//public 
}
