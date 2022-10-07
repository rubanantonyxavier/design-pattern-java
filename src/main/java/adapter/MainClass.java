package adapter;

import adapter.duck.Duck;
import adapter.duck.MallardDuck;
import adapter.turkey.OsceolaTurkey;
import adapter.turkey.Turkey;

public class MainClass {
    public static void main(String[] args) {
        Turkey turkey = new OsceolaTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();

        duck = new MallardDuck();
        duck.fly();
        duck.quack();
    }
}

/*
To Adapt Turkey into Duck Interface
 */
