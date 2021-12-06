package javaNote;

public class StaticCar {
	
	//정적 초기화 블록
	static String sfield1 = "a";
	static String sfield2 = "b";
	static String sfield3;
	static {
		sfield3 = sfield1 + sfield2;
	}
	
	//정적 메소드와 블록 선언시 주의할 점
	String ifield1;
	void imethod1() {}
	
	static {
		ifield1 = 10;
		imethod1();
	}
}


