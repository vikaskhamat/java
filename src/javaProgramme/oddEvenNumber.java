package javaProgramme;

import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // get user input
		//int num =6; 
		System.out.println("Enter any number");
		int num =sc.nextInt();
		if(num %2==0)
		{
			System.out.println("This is even Number");
		}
		System.out.println("This is Odd Number");
		
	}

}
