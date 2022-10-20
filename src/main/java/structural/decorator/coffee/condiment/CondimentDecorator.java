package structural.decorator.coffee.condiment;

import structural.decorator.coffee.beverage.Beverage;

//Decorator
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
