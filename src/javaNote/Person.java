package javaNote;

public class Person {
	//�ʵ� ����
	String name;
	int age;
	String nationality;
	
	//������
	public Person(String name, int age, String nationality){
		//�ʵ� �ʱ�ȭ
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	//�޼ҵ�
	public void introduce() {
		System.out.println(
				String.format("���� %s �Դϴ�. %d���̰� %s���� �Խ��ϴ�.", name,age,nationality));
	}
}
