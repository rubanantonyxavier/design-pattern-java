package behavioral.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private final ArrayList<Observer> observers;
    private int value = 0;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        addValue();
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        removeValue();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    private void addValue() {
        this.value = this.value + 1;
        notifyObservers();
    }

    private void removeValue() {
        this.value = this.value - 1;
        notifyObservers();
    }
}
