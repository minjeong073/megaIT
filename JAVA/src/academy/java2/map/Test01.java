package academy.java2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		
		System.out.println("1. 자료 입력");
		
		Map<String, Integer> data = new HashMap<>();
		
		data.put("국어", 90);
		data.put("수학", 85);
		data.put("영어", 90);
		data.put("사회", 80);
		data.put("과학", 100);
		
		System.out.println(data);
		System.out.println();
		
		
		System.out.println("2. 값 수정");
		data.put("사회", data.get("사회") + 5);
		
		System.out.println(data);
		System.out.println();
		
		
		System.out.println("3. 값 찾기");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 과목명을 입력하세요 : ");
		String input = scan.nextLine();
		
		if (data.containsKey(input)) {
			System.out.println(input + " : " + data.get(input));
		} else {
			System.out.println("자료 없음");
		}
		System.out.println();
		
		
		System.out.println("4. 값 찾기");
		
		Set<String> keys = data.keySet(); 
		
		for(String key : keys) {
			if (data.get(key) >= 90) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("5. 값 확인");
		for(String key : keys) {
			if (data.get(key) == 100) {
				System.out.println("수상 가능");
				break;
			}
		}
		
		
	}
}
