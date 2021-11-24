package javaNote;

import java.util.Arrays;

public class Enumeration {
	public static void main(String[] args) {
		Season march = Season.SPRING;
		Season setember = Season.AUTUMN;
		
		String name = march.name();
		System.out.println("march.name() : " + name);
		
		int ordinal = setember.ordinal();
		System.out.println("setember.ordinal() : " + ordinal);
		
		int compareTo1 = march.compareTo(setember);
		int compareTo2 = setember.compareTo(march);
		System.out.println("march > setember : " + compareTo1);
		System.out.println("setember > march : " + compareTo2);
		
		Season[] season = Season.values();
		System.err.println("Season > array : " + Arrays.toString(season));
		
		for(Season ss : season) {
			System.out.println("ss : " + ss);
		}
	}
}
