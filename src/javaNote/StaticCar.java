package javaNote;

public class StaticCar {
	
	//���� �ʱ�ȭ ���
	static String sfield1 = "a";
	static String sfield2 = "b";
	static String sfield3;
	static {
		sfield3 = sfield1 + sfield2;
	}
	
	//���� �޼ҵ�� ��� ����� ������ ��
	String ifield1;
	void imethod1() {}
	
	static {
		ifield1 = 10;
		imethod1();
	}
}


