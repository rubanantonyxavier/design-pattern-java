package decorator.coffee;

import decorator.coffee.beverage.Beverage;
import decorator.coffee.beverage.DarkRoast;
import decorator.coffee.beverage.Espresso;
import decorator.coffee.condiment.Mocha;
import decorator.coffee.condiment.Whip;

public class StarbuzzCoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage.getDescription() + "\nCost: $" + beverage.cost());

        beverage = new Whip(new Mocha(new Whip(new Espresso())));
        System.out.println(beverage.getDescription() + "\nCost: $" + beverage.cost());
    }
}
