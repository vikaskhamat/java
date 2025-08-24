package javaProgramme;

import java.util.Scanner;

public class swapTwoNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("EnterSecond Number");
		int num2 =sc.nextInt();
		
		System.out.println("Swap Before Number "+num1+" and "+num2+" ");

		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Swap After Number "+num1+" and "+num2+" ");
		
	}

}
