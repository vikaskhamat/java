package javaProgramme;

import java.util.Scanner;

public class reverceNumber {
	public static void main(String[] args) {
		int rev=0,r,a;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter any number : "); 
		int num = sc.nextInt();
		a = num; 
		while(num>0)
		{
			r = num%10; 
			rev = rev*10+r; 
			num=num/10;
		}
		System.out.println("Reverse : " +rev);

	}
}
//Input = 12345
//Output =54321
