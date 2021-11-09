package javaNote;

public class Operator {
	public static void main(String[] args) {
		String s = "hi";
		String s1 = "";
		switch(s) {
		case "hi" -> s1 = "hi";
		case "bye" -> s1 = "bye";
		}
		System.out.println(s1);
	}
}
