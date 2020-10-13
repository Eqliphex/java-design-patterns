import models.Animal;
import models.Bird;
import models.Dog;
import models.ItFlies;

public class AnimalPlay {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlies());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}
