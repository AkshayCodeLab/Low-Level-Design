package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationObserver{

    StockObservable observable;
    String name;

    public MobileAlertObserverImpl(String name, StockObservable observable){
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSms(name);
    }
    public void sendSms(String emailId){
        System.out.println("Sms sent to: " + emailId);
    }
}
