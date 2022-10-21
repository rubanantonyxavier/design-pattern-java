package behavioral.observer;

public class ObserverMainClass {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerObserver(observer);
        subject.registerObserver(observer);
        subject.registerObserver(observer);
        subject.removeObserver(observer);
    }
}

/*
We have Publisher (as Subject) & Subscriber (as Observer)
Any update in Publisher should be notified to all the Subscriber using Observer Design Pattern
 */