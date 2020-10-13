package interfaces;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Do nothing, I can't fly!");
    }
}
