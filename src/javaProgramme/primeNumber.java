package javaProgramme;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		System.out.println("Is a Prime Number");
		else
			System.out.println("Not a prime Number");

	}

}
