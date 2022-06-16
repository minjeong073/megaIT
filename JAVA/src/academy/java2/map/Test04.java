package academy.java2.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test04 {
	
	public static void main(String[] args) {
		
        Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마로비아나");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        
        List<Map<String, String>> characters = new ArrayList<>();
        
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "남라");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characters.add(character5);

        // TODO: 구현
//        myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다
//        보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
        
        Iterator<Map<String, String>> iter = characters.iterator();
        
        System.out.println("힐러 탐색 결과");
        
        Map<String, String> maxCharacter = null;
        while(iter.hasNext()) {
        	Map<String, String> character = iter.next();
        	
        	if (character.get("서버").equals(myCharacter.get("서버")) 
        			&& character.get("직업").equals("힐러")) {
//        		printInfo(character);
        		// 레벨이 가장 높은 사람만 출력
        		maxCharacter = character;

        		if (Integer.parseInt(character.get("레벨")) 
        				>= Integer.parseInt(maxCharacter.get("레벨"))) {
        			maxCharacter = character;
        		}        		
        	}
        }
        printInfo(maxCharacter);
		
		
	// 다른 풀이
	Map<String, String> mmaxCharacter = null;
        
        int maxLevel = 0;
        for (int i = 0; i < characters.size(); i++) {
		Map<String, String> character = characters.get(i);
			
		String myServer = myCharacter.get("서버");
		if (character.get("직업").equals("힐러") 
			&& myServer.equals(character.get("서버"))) {
//			System.out.println(character);
//			printInfo(character);
		}

		int level = Integer.parseInt(character.get("레벨"));

		if (maxLevel < level) {
			maxLevel = level;
			mmaxCharacter = character;
		}
	}
		
	// 다른 풀이2
	Map<String, String> mmaxCharacter = null;
        
        int maxLevel = 0;
        for (int i = 0; i < characters.size(); i++) {
		Map<String, String> character = characters.get(i);
			
		String myServer = myCharacter.get("서버");
		if (character.get("직업").equals("힐러") 
			&& myServer.equals(character.get("서버"))) {
//			System.out.println(character);
//			printInfo(character);
			
			if (mmaxCharacter == null) {
				mmaxCharacter = character;
				continue;
			}
		}
		
		int level = Integer.parseInt(character.get("레벨"));
		int maxLevel = Integer.parseInt(mmaxCharacter.get("레벨"));
		
		if (maxLevel < level) {
			mmaxCharacter = character;
		}
	}
        
        System.out.println("최고 레벨 " + maxLevel);
        System.out.println(mmaxCharacter);
	}
	
	
	static void printInfo(Map<String, String> map) {
		System.out.println("닉네임 : " + map.get("닉네임"));
		System.out.println("직업 : " + map.get("직업"));
		System.out.println("서버 : " + map.get("서버"));
		System.out.println("레벨 : " + map.get("레벨"));
	}
}
