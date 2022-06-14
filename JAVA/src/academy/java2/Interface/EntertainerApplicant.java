package academy.java2.Interface;

public class EntertainerApplicant implements Act, Sing{

    @Override
    public void act() {
        System.out.println("act");
    }

    @Override
    public void sing() {
        System.out.println("sing");
    }
}
