package academy.java2.Interface;

public class Test01 {
    public static void main(String[] args) {

        JypEntertainment entertainment = new JypEntertainment();

        EntertainerApplicant applicant = new EntertainerApplicant();

        entertainment.actorAudition(applicant);
        entertainment.idolAudition(applicant);

    }
}
