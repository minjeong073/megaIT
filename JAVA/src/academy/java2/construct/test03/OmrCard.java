package academy.java2.construct.test03;

public class OmrCard {
    private String studentName;
    private String studentNumber;
    private int[] input;


    public OmrCard(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.input = new int[5];
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    public void setInput(int number, int input) {
        this.input[number - 1] = input;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int[] getInput() {
        return input;
    }
}
