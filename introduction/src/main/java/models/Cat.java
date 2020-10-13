package models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cat extends Animal {

    public Cat() {
        super();
        setSound("Meow!");
    }

}
