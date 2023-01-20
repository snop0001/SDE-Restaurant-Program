package com.hz;

public class VeganPizza extends Pizzas {

    public VeganPizza(String sauce) {
        this.type = "vegan classic pizza";
        this.sauce = sauce;

    }

    @Override
    public void addingCheese() {
        cookingInstructions += " topping with some vegan cheese :),";
    }

    @Override
    public void addingToppings() {
        cookingInstructions += " adding some roasted red peppers, baby spinach, onions, mushrooms, tomatoes, and black olives";
    }

}
