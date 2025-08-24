package javabasic;

public class variable {

	public static void main(String[] args) {
		Double object = new Double("2.4");
		int a = object.intValue();
		byte b= object.byteValue();
		
		float d = object.floatValue();
		double c = object.doubleValue();
		System.out.println(a+b+c+d);// output 8.800000095


	//int abc;
	//System.out.println(abc+"default value");// compile time error
	}
}
