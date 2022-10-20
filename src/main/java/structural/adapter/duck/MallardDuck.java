package structural.adapter.duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck Fly");
    }
}
