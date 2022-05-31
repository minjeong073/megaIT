package academy.java1.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 문자열 변환");
		String gradeString = "My grade is A";
		
		String newGradeString = gradeString.replace('A', 'B');
		System.out.println(newGradeString);
		System.out.println();
		
		
		System.out.println("2. 문자열 자르기");
		String phoneNumber = "01012345678";
		
		String part1 = phoneNumber.substring(0, 3);
		String part2 = phoneNumber.substring(3, 7);
		String part3 = phoneNumber.substring(7);
		
		System.out.println(part1 + "-" + part2 + "-" + part3);
		System.out.println();
		
		
		System.out.println("3. 문자열 정수 변환");
		String birthString = "19950721";
		
		int year = Integer.parseInt(birthString.substring(0, 4));
		int age = 2022 - year + 1;
		
		System.out.println(year + "년생의 나이는 " + age + "살");
		System.out.println();
		
		
		System.out.println("4. 문자열 검색");
		System.out.print("단어를 입력하세요 : ");
		String word = scan.next();
		
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {
				count++;
			}
		}
		
		System.out.println("e의 개수는 " + count + "개 입니다.");
		System.out.println();
		
		
		System.out.println("5. 단어 수 세기");
		String sentence = "To be, or Not to Be. That Is The Question";
		
		String[] splitSentence = sentence.split(" ");
		System.out.println("단어 개수 : " + splitSentence.length);
		
		
	}
}
