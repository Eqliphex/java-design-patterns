package models;

import interfaces.Observer;
import interfaces.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StockGrabber implements Subject {

    List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer newObserver) {
        observers.remove(newObserver);
        System.out.println("Observer: " + newObserver + " is deleted");
    }

    @Override
    public void notifyObserver() {
        observers.stream()
                .forEach(observer -> {
                    observer.update(getIbmPrice(), getAaplPrice(), getGoogPrice());
                });
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }


    public void setAAPLPrice(double newAaplPrice) {
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }


    public void setGOOGPrice(double newGoogPrice) {
        this.googPrice= newGoogPrice;
        notifyObserver();
    }
}
