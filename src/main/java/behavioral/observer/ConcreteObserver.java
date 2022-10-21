package behavioral.observer;

public class ConcreteObserver implements Observer {

    private int value;
//    private Subject subject;
//
//    public ConcreteObserver(Subject subject) {
//        this.subject = subject;
//    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    private void display() {
        System.out.println("Value: " + value);
    }
}
