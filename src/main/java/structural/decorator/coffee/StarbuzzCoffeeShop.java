package structural.decorator.coffee;

import structural.decorator.coffee.beverage.Beverage;
import structural.decorator.coffee.beverage.DarkRoast;
import structural.decorator.coffee.beverage.Espresso;
import structural.decorator.coffee.condiment.Mocha;
import structural.decorator.coffee.condiment.Whip;

public class StarbuzzCoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage.getDescription() + "\nCost: $" + beverage.cost());

        beverage = new Whip(new Mocha(new Whip(new Espresso())));
        System.out.println(beverage.getDescription() + "\nCost: $" + beverage.cost());
    }
}
