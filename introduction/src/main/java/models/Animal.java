package models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Animal {
    private String name;
    private int weight;

    @Getter
    @Setter
    private String sound;

    public void setWeight(int newWeight) {
        if(newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than zero!");
        }
    }
}
