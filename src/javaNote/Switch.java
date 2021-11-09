package javaNote;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String pet = sc.next();
//		
//		switch(pet) {
//		case "강아지" : System.out.println("멍멍"); break;
//		case "고양이" : System.out.println("야옹"); break;
//		case "오리" : System.out.println("꽥괙"); break;
//		}
		
		String wallet = sc.next();
		
		int money = switch(wallet) {
		case "현금" -> 15000;
		case "카드" -> 30000;
		case "영수증" -> 0;
		default -> -1;
		};
		
		System.out.println("지갑 속에 " + money + "원이 있습니다.");
	}
}
