package javaProgramme;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input ");
		int num = sc.nextInt();
		int number = 5;
		for (int i = 1; i <= num; i++)
		{ 
			fact = fact * i;
		}
		System.out.println("Factorial number is :" +fact);
	}

}

//Input =5
//Output: 5! = 5*4*3*2*1 = 120