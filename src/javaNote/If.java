package javaNote;

public class If {
	public static void main(String[] args) {
		String wallet = "üũī��";
		
		if(wallet.equals("����")) {
			System.out.println("������ ���࿡ �Ա��մϴ�.");
			wallet = "üũī��";
		}else if(wallet.equals("üũī��")) {
			System.out.println("������ ���࿡ �����մϴ�.");
			wallet = "����";
		}else {
			wallet ="0��";
		}
		
		System.out.println("���� �������� " + wallet + "�� ����ֽ��ϴ�.");
	}
}
