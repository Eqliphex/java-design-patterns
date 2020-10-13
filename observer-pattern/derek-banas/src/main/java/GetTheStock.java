import interfaces.Subject;
import models.StockGrabber;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;

        startTime = newStartTime;

        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(startTime * 1000);
            } catch (InterruptedException e) {

            }

            double randomNumber = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format((price + randomNumber)));
            if (stock.equals("IBM")) {
                ((StockGrabber) stockGrabber).setIBMPrice(price);
            }
            if (stock.equals("AAPL")) {
                ((StockGrabber) stockGrabber).setAAPLPrice(price);
            }
            if (stock.equals("GOOG")) {
                ((StockGrabber) stockGrabber).setGOOGPrice(price);
            }

            System.out.println(stock + ": " + df.format((price + randomNumber)) +
                    " " + df.format(randomNumber));

            System.out.println();

        }
    }
}
