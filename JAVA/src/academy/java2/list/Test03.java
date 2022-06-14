package academy.java2.list.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println("1. id 중복 체크");
		// 리스트 추가
		List<String> idList = new ArrayList<>();
		String[] ids = {"hagulu", "happy", "google", "bts", "iu", "cuteboy"};
		
		for (int i = 0; i < ids.length; i++) {
			idList.add(ids[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		String inputId = scan.next();
		
		if (idList.contains(inputId)) {
			System.out.println("중복 입니다.");
		} else {
			System.out.println("사용가능");
		}
		System.out.println();
		
		
		System.out.println("2. 체조 경기 평균 점수");
		
		// 리스트 추가
		List<Integer> scoreList = new ArrayList<>();
		int[] scores = {8, 7, 6, 10, 9, 4};
		
		for (int i = 0; i < scores.length; i++) {
			scoreList.add(scores[i]);
		}
		
		scoreList.sort(Comparator.naturalOrder());
		
//		// 최고점 최저점 제외하기
//		scoreList.remove(scoreList.size() - 1);
//		scoreList.remove(0);
//		
//		double sum = 0;
//		for(int score : scoreList) {
//			sum += score;
//		}
		
		// 다른 풀이
		double sum = 0;
		for (int i = 1; i < scoreList.size() - 1; i++) {
			sum += scoreList.get(i);
		}
		double average = sum / (scoreList.size() - 2); 
		
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);
		System.out.println();
		
		
		System.out.println("3. 로또 번호");
		List<Integer> lottoList = new ArrayList<>();
		
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int randomNum = random.nextInt(45) + 1;
			
			if (lottoList.contains(randomNum)) {
				i--;
			} else {
				lottoList.add(randomNum);				
			}	
		}
		
		lottoList.sort(Comparator.naturalOrder());
		System.out.println(lottoList);
		System.out.println();
		
		
		System.out.println("4. 회원 추가하기");
		// 리스트 추가
		String[] members = {"우솝", "루피", "상디", "나미", "로빈"};
		List<String> memberList = new ArrayList<>();
		
		for(String member : members) {
			memberList.add(member);
		}
		
		int[] memberCount = new int[memberList.size()];

		// 리스트 추가
		String[] newMembers = {"프랑키", "루피", "쵸파", "로빈", "루피", "루피", "로빈"};
		List<String> newMemberList = new ArrayList<>();
		
		for(String member : newMembers) {
			newMemberList.add(member);
		}
		
		// 중복 확인
		for(String member : newMemberList) {
			int count = 0;
			if (memberList.contains(member)) {
				count = ++memberCount[memberList.indexOf(member)];
				member += count;
			}
			memberList.add(member);
		}
		
		System.out.println(memberList);
				
	}
}
