package models;

import interfaces.Observer;
import interfaces.Subject;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject subject;

    public StockObserver(Subject subject) {
        this.subject = subject;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        subject.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
