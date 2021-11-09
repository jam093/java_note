package javaNote;

public class If {
	public static void main(String[] args) {
		String wallet = "체크카드";
		
		if(wallet.equals("현금")) {
			System.out.println("현금을 은행에 입금합니다.");
			wallet = "체크카드";
		}else if(wallet.equals("체크카드")) {
			System.out.println("현금을 은행에 츨금합니다.");
			wallet = "현금";
		}else {
			wallet ="0원";
		}
		
		System.out.println("지금 지갑에는 " + wallet + "이 들어있습니다.");
	}
}
