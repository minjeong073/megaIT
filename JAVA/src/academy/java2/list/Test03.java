package academy.java2.list;

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
			
//			if (lottoList.contains(randomNum)) {
//				i--;
//			} else {
//				lottoList.add(randomNum);
//			}

			// 다른 방법
			if (lottoList.contains(randomNum)) {
				i--;
				continue;
			}
			lottoList.add(randomNum);
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


		// 리스트 추가
		String[] newMembers = {"프랑키", "루피", "쵸파", "로빈", "루피", "루피", "로빈"};
		List<String> newMemberList = new ArrayList<>();
		
		for(String member : newMembers) {
			newMemberList.add(member);
		}

		int[] memberCount = new int[memberList.size()];
		// 중복 확인
		for(String member : newMemberList) {
			int count = 0;
			if (memberList.contains(member)) {
				count = ++memberCount[memberList.indexOf(member)];
				member += count;
			}
			memberList.add(member);
		}

		// memberCount 없는 다른 풀이 1
		for(String member : memberList) {
			int count = 1;
			for (int i = 0; i < newMemberList.size(); i++) {
				String newMember = newMemberList.get(i);

				if (member.equals(newMember)) {

					newMemberList.set(i, member + count++);
				}
			}
		}
		memberList.addAll(newMemberList);

		System.out.println(memberList);

		// 다른 풀이 2
		for (int i = 0; i < newMemberList.size(); i++) {
			String newMember = newMemberList.get(i);
			int count = 1;

			// 중복되어서 1이 추가
			// 또 중복되면 memberList 에 1이 있는지 확인
			// -> 없는 경우 2를 붙임
			while (memberList.contains(newMember)) {
				newMember = newMemberList.get(i) + count++;
				// 수정된 값에 count 를 더하면 문자열 추가되기 때문에
				// 처음 값(newMemberList.get(i))에서 count 를 추가해야함
			}
			memberList.add(newMember);
		}
		System.out.println(memberList);

	}

}
