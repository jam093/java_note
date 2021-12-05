package javaNote;

public class Person {
	//필드 선언
	String name;
	int age;
	String nationality;
	
	//생성자
	public Person(String name, int age, String nationality){
		//필드 초기화
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	//메소드
	public void introduce() {
		System.out.println(
				String.format("저는 %s 입니다. %d살이고 %s에서 왔습니다.", name,age,nationality));
	}
}
