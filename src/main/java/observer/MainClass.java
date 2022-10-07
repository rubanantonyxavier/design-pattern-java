package observer;

public class MainClass {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerObserver(observer);
        subject.registerObserver(observer);
        subject.registerObserver(observer);
        subject.removeObserver(observer);
    }
}
