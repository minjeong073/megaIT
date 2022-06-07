package academy.java2.construct.test03;

public class OmrCardReader {
    private int[] answer;
    private int score;

    public OmrCardReader() {
        answer = new int[5];
    }

    public OmrCardReader(int[] answer) {
        this.answer = answer;
    }

    public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5) {
        this.answer[0] = answer1;
        this.answer[1] = answer2;
        this.answer[2] = answer3;
        this.answer[3] = answer4;
        this.answer[4] = answer5;
    }

    public void printInfo() {
        System.out.println("정답 : ");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(this.answer[i] + " ");
        }
        System.out.println();
    }


    public void grading(OmrCard omrCard) {
//        System.out.println();
//        System.out.println("---채점 중---");
//        System.out.println();

        int[] input = omrCard.getInput();
        this.score = 0;
        for (int i = 0; i < 5; i++) {
            if (answer[i] == input[i]) {
                this.score += 20;
            }
        }
    }

    public void printScore(OmrCard omrCard) {
        System.out.println("이름 : " + omrCard.getStudentName());
        System.out.println("학번 : " + omrCard.getStudentNumber());
        System.out.println("점수 : " + this.score);
    }

    // 여러 OMR Card 를 채점
    public void grading(OmrCard[] cards) {
        for (int i = 0; i < cards.length; i++) {
            this.grading(cards[i]);
        }
    }
    
    // 여러 OMR Card 의 채점 결과 출력
    public void printResult(OmrCard[] cards) {
        for (int i = 0; i < cards.length; i++) {
            this.grading(cards[i]);
            this.printScore(cards[i]);
            System.out.println();
        }

    }

}
