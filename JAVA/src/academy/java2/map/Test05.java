package academy.java2.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
	
		List<String> fruits = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int input;
		String name;
		
		do {
			menu();
			input = scan.nextInt();
			
			switch (input) {
			case 1:
				System.out.print("과일 이름을 입력하세요 : ");		
				name = scan.next();
				if (!name.isBlank()) {
					System.out.println("입력 성공");
					fruits.add(name);
				}
				break;
				
			case 2:
				if (fruits.isEmpty()) {
					System.out.println("비어있습니다");
				} else {
					for(String fruit : fruits) {
						System.out.println(fruit);
					}
				}
				break;
				
			case 3:
				System.out.print("삭제할 과일 이름을 입력하세요");
				name = scan.next();
				if (!name.isBlank()) {					
					if (fruits.remove(name)) {
						System.out.println("삭제 성공");
					}
				}
				break;
				
			case 4:
				System.out.println("종료합니다");
				break;
				
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
			
		} while(input != 4);
		
	}
	
	static void menu() {
		System.out.println("1:입력 2:출력 3:삭제 4:종료");
	}
}
