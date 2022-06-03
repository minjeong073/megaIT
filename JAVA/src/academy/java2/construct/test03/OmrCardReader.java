package academy.java2.construct.test03;

public class OmrCardReader {
    private int[] answer;
    private int score;

    public OmrCardReader(int[] answer) {
        this.answer = answer;
    }

    public int grading(OmrCard omrCard) {
        System.out.println();
        System.out.println("---채점 중---");
        System.out.println();

        int[] input = omrCard.getInput();
        this.score = 0;
        for (int i = 0; i < 5; i++) {
            if (answer[i] == input[i]) {
                this.score += 20;
            }
        }
        return score;
    }

    public void printScore(OmrCard omrCard) {
        System.out.println("이름 : " + omrCard.getStudentName());
        System.out.println("학번 : " + omrCard.getStudentNumber());
        System.out.println("점수 : " + this.score);
    }
}
