package factory.abstract_factory;

import factory.abstract_factory.products.*;

public abstract class PizzaIngredientFactory {

    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract Veggies[] createVeggies();
    public abstract Pepperoni createPepperoni();
    public abstract Clams createClam();
}
