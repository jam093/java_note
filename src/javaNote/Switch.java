package javaNote;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String pet = sc.next();
//		
//		switch(pet) {
//		case "������" : System.out.println("�۸�"); break;
//		case "�����" : System.out.println("�߿�"); break;
//		case "����" : System.out.println("�ЂE"); break;
//		}
		
		String wallet = sc.next();
		
		int money = switch(wallet) {
		case "����" -> 15000;
		case "ī��" -> 30000;
		case "������" -> 0;
		default -> -1;
		};
		
		System.out.println("���� �ӿ� " + money + "���� �ֽ��ϴ�.");
	}
}
