package structural.adapter;

import structural.adapter.duck.Duck;
import structural.adapter.duck.MallardDuck;
import structural.adapter.turkey.OsceolaTurkey;
import structural.adapter.turkey.Turkey;

public class AdapterMainClass {
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
