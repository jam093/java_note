package javaNote;

public class Casting {
	public static void main(String[] args) {
		double d = 33333333.14;
		float f = 33333333.14f;
		long l1 = (long)d;
		long l2 = (long)f;
		
		System.out.println("(long)d : " + l1);
		System.out.println("(long)f : " + l2);
		
		long l = 33333333;
		double d2 = l;
		float f2 = l;
		System.out.println("d2 : " + d2);
		System.out.println("f2 : " + f2);
	}
}
