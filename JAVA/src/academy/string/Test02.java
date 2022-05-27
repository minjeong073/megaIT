package academy.string;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 정수 문자열 변환");
		int year = 2000;
		int month = 11;
		int day = 15;
		
		String str = "" + year + month + day;
		System.out.println(str);
		System.out.println();
		
		
		System.out.println("2. 문자열 정수 변환");
		String yearString = "1995";
		
		System.out.println(2023 - Integer.parseInt(yearString));
		System.out.println();
		
		
		System.out.println("3. 개수 세기");
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라"
				, "육개장", "육개장", "새우깡", "신라면"};
		
		System.out.print("제품명 : ");
		String name = scan.next();
		
		int count = 0;
		for (int i = 0; i < goods.length; i++) {
			if (goods[i].equals(name)) {
				count++;
			}
		}
		System.out.println(count + "개");
		
	}
}
