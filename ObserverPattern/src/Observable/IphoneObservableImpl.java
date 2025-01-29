package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if (stockCount == 0){
            notifySubscribers();
        }
        stockCount= newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
