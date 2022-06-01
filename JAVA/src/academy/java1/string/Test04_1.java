package academy.java1.string;

public class Test04_1 {
    public static void main(String[] args) {

        // 문제 3 응용 -> 같은 이름이 3개일 경우

        String membersString2 = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호";
        String[] members2 = membersString2.split(":");

        int count = 0;

        for (int i = 0; i < members2.length; i++) {
            if (members2[i].equals("")) {
                continue;
            }
            for (int j = (i + 1); j < members2.length; j++) {
                if (members2[i].equals(members2[j])) {
                    count++;
                    members2[j] = "";
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
