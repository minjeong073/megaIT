package academy.java2.construct.test03;

import java.util.Scanner;

public class OmrCard {
    private String studentName;
    private String studentNumber;
    private int[] input;


    public OmrCard(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public void exam(int[] input) {
        this.input = input;
    }


    public void setInput(int[] input) {
        this.input = input;
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
