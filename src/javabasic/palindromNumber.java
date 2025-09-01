package javabasic;

public class palindromNumber {
	
	public static void main(String[] args) {
		int number = 121;
		int temp = number;
		int rev = 0 ;
		
		while(temp != 0) {
			int rem = temp % 10;
			System.out.println("Reminder = "+rem);
			rev = rev * 10 + rem;
			temp= temp/10;
		}
		
		if(number == rev) {
			System.out.println("This is palindrom number = "+rev);
		}
		else {
			System.out.println("not palindrom number = "+rev);
		}
	}

}
