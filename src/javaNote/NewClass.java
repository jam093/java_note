package javaNote;

public class NewClass {
	public static void main(String[] args) {
		Person p1 = new Person("박돌돌",18,"한국");
		Person p2 = new Person("Jam",21,"미국");
		
		p1.introduce();
		p2.introduce();
	}
}
