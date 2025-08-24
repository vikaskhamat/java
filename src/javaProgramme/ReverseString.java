package javaProgramme;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name (vikaslocal change)");
		String name = sc.nextLine();
		System.out.println("original String ==" +name);
		String rev = "";
		
		for(int i = name.length()-1; i>=0 ; i--) {
			rev = rev + name.charAt(i);
		}
		
		System.out.println("Reverse String : "+rev);
	}
}
