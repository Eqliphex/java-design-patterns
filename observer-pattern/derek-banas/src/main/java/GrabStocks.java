import models.StockGrabber;
import models.StockObserver;

public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observerOne = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(678.40);

        StockObserver observerTwo = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(297.00);
        stockGrabber.setAAPLPrice(777.60);
        stockGrabber.setGOOGPrice(878.40);

        //stockGrabber.unregister(observerOne);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAPPL = new GetTheStock(stockGrabber, 2, "APPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 678.40);

        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOG).start();

    }
}

