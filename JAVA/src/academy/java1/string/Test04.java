package academy.java1.string;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 문자열 검색");
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", 
				"tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
//		for (int i = 0; i < files.length; i++) {
//			if (files[i].contains(".jpg")) {
//				count++;
//			}
//		}
		// contains 를 쓰면 파일 이름 중간에 포함된 경우도 조건에 포함될 수 있음
		// -> 해당 문자열로 끝나는지를 확인하는 조건으로!
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".jpg")) {
				count++;
			}
		}
		System.out.println("jpg 파일 개수 : " + count);
		System.out.println();
		
		
		System.out.println("2. 영단어 퀴즈");
		String[] answer = {"victory", "love", "computer", "notebook"};
		
		String[] input = new String[4];
		
		System.out.print("1. 승리를 영어로 입력하세요 : ");
		input[0] = scan.next();
		System.out.print("2. 사랑을 영어로 입력하세요 : ");
		input[1] = scan.next();
		System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
		input[2] = scan.next();
		System.out.print("4. 노트북을 영어로 입력하세요 : ");
		input[3] = scan.next();
		
		int score = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals(answer[i])) {
				score += 25;
			}
		}
		
		System.out.println("점수는 " + score + "점 입니다.");
		System.out.println();
		
		
		System.out.println("3. 문자열 검색");
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
		
		count = 0;
		String[] members = membersString.split(":");
		
		for (int i = 0; i < members.length; i++) {
			for (int j = (i + 1); j < members.length; j++) {
				if (members[i].equals(members[j])) {
					count++;
				}
			}
		}
		System.out.println("동명 이인 수 : " + count);


		// 문제 3 응용 -> 같은 이름이 3개일 경우
		String membersString2 = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호";
		String[] members2 = membersString2.split(":");

		for (int i = 0; i < members2.length; i++) {

		}

	}
}
