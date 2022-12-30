package headfirst.desingpatternjava.intro.duck.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
