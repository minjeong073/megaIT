package academy.java2.map.test06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		Iterator<Person> iter = list.iterator();
		
		Scanner scan = new Scanner(System.in);
		int input;
		String name;
		int birthDay;
		
		do {
			menu();
			input = scan.nextInt();

			switch (input) {
			case 1:
				System.out.println("입력할 사람의 이름과 생년월일을 입력하세요 : ");
				name = scan.next();
				birthDay = scan.nextInt();
				list.add(new Person(name, birthDay));
				System.out.println("입력 완료");
				break;
				
			case 2:
				if (list.isEmpty()) {
					System.out.println("비어있습니다");
					break;
				} 
				
				iter = list.iterator();
				
				while(iter.hasNext()) {
					Person person = iter.next();
					System.out.println(person.toString()); 
				}
				break;
				
			case 3:
				System.out.println("삭제할 사람을 입력하세요 : ");
				name = scan.next();
				iter = list.iterator();
				
				while(iter.hasNext()) {
					Person person = iter.next();
					if (person.getName().equals(name)) {
						iter.remove();
						System.out.println("삭제 완료");
					}
				}
				break;
				
			case 4:
				System.out.println("종료합니다.");
				break;
				
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
			
		} while(input != 4);
		
	}
	

	static void menu() {
		System.out.println("1 : 입력 2 : 출력 3 : 삭제 4 : 종료");
	}
}
