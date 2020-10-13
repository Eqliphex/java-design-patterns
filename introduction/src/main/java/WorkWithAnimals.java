import models.Animal;
import models.Cat;
import models.Dog;
import models.Giraffe;

public class WorkWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");

        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        int newWeight = 10;

        System.out.println("Weight before change: " + fido.getWeight());

        fido.setWeight(newWeight);

        System.out.println("Weight after change: " + fido.getWeight());

        changeObjectName(fido);

        System.out.println("Dog name after method call: " + fido.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggo says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggo says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound());

        Giraffe giraffe = new Giraffe();

        giraffe.setName("Frank");

        System.out.println("Creature name: " + giraffe.getName());
    }

    public static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal) {
        System.out.println("Animal says: " + randAnimal.getSound());
    }
}
