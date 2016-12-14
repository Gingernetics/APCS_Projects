import java.io.*;
import java.util.Scanner;

public class mathGame{

	public static void main(String args[]){
		//Gets desired output
		System.out.println("Enter the desired output: ");
		Scanner scanner = new Scanner(System.in);
		String stringTotal = scanner.nextLine();
		int total = Integer.parseInt(stringTotal);
		

		//Gets array of Strings from command line
		System.out.println("Enter the four numbers, separated by spaces: ");
		String numbers = scanner.nextLine();
		String[] arrayOfStrings = numbers.trim().split("\\s+");

		//Transfers parsed values to array of ints
		int[] arrayOfNumbers = new int[arrayOfStrings.length];
		int i = 0;
		for(String x : arrayOfStrings){
			arrayOfNumbers[i] = Integer.parseInt(x);
			i++;
		}

		//call mathGame
		mathGame(total, arrayOfNumbers);
	}

	//precondition: total >= 0; numbers != null
	//postcondition: returns true if numbers can create total using addition or subtraction
	public static boolean mathGame(int total, int [] numbers){
		//test
		//for(int x : numbers)
		//	System.out.println(x);
		
		return false;
		
	}

	//public 
}
