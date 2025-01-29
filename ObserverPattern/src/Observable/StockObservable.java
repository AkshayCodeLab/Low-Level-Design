package Observable;

import Observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySubscribers();

    public void setStockCount(int stockCount);

    public int getStockCount();
}
