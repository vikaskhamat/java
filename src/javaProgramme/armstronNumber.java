package javaProgramme;

import java.util.Scanner;

public class armstronNumber {
	public static void main(String[] args) {
		int arm=0, a,temp;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter any number : "); 
		int num = sc.nextInt();
		temp = num; 
		while(num>0)
		{
			a = num%10; 
			num = num/10;
			arm =arm+a*a*a;
		}
		if(arm==temp){ 
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
		}


	}

}
