package academy.java1.string;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 문자열 출력");
		String str1 = "Oh";
		String str2 = "My";
		String str3 = "God";
		
		System.out.println(str1 + " " + str2 + " " + str3);
		System.out.println();
		
		
		System.out.println("2. 문자열 입력");
		System.out.print("ID를 입력하세요 : ");
		String id = scan.next();
		
		System.out.println("Welcome! " + id);
		System.out.println();
		
		
		System.out.println("3. 문자열 배열");
		
		String[] stringArray = new String[3];
		
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = scan.next();
		}
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
	}
}
