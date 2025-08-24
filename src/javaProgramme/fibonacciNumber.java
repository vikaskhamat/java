package javaProgramme;

import java.util.Scanner;

public class fibonacciNumber {
	public static void main(String[] args) {
		//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
		//The first two numbers of fibonacci series are 0 and 1.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input ");
		int num =sc.nextInt();
		int number =6;
		int first=0,second =1,next;
		System.out.println("Fibonacci series is "); 

		for(int i=0;i<=number;i++)
		{
			System.out.println(first + ""); 
			next = second+first;
			first = second; 
			second = next;
		}
		
		
	}
}

