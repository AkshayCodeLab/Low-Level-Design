import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable observable = new IphoneObservableImpl();

        NotificationObserver observer1 = new MobileAlertObserverImpl("akshay", observable);
        NotificationObserver observer2 = new EmailAlertObserverImpl("akshay@gmail.com", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.setStockCount(10);
        observable.setStockCount(0);
        observable.setStockCount(100);
    }
}