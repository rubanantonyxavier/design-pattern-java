package decorator.coffee.condiment;

import decorator.coffee.beverage.Beverage;

//Decorator
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
