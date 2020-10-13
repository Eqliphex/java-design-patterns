package models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Dog extends Animal {

    public Dog() {
        super();
        setSound("Bark!");
    }

    public void digHole() {
        System.out.println("Dug a hole!");
    }
}
