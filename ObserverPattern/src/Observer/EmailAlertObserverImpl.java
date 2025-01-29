package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationObserver{
    StockObservable observable;
    String email;


    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }


    @Override
    public void update() {
        sendMail(email, "Mail sent successfully");
    }
    public void sendMail(String email, String msg){
        System.out.println("Sending mail to: " + email);
    }
}
