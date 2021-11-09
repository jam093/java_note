package javaNote;

public class For {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			if(i%2 == 0) {
				//Â¦¼ö »çÀý
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
