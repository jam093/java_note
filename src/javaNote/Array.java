package javaNote;

public class Array {
	public static void main(String[] args) {
		//1.이차원 배열 선언
		int[][] arr1 = {{1,2},{4,5},{7,8}};
		String[][] arr2 = new String[2][4];
		arr2 = new String[][]{{"j","a","v","a"},{"c","o","k","e"}};
		
		//2.길이
		System.out.println("arr1.length : " + arr1.length);
		System.out.println("arr1[0].length : " + arr1[0].length);
		System.out.println("arr1[1].length : " + arr1[1].length);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("arr2.length : " + arr2.length);
		System.out.println("arr2[0].length : " + arr2[0].length);
		System.out.println("arr2[1].length : " + arr2[1].length);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		//3.출력
		System.out.println("arr1[0] : " + arr1[0][0] + " " + arr1[0][1]);
		System.out.println("arr1[1] : " + arr1[1][0] + " " + arr1[1][1]);
	}
}
