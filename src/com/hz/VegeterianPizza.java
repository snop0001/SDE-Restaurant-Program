package com.hz;

public class VegeterianPizza extends Pizzas {

    public VegeterianPizza(String sauce) {
        this.type = "vegeterian classic pizza";
        this.sauce = sauce;
    }

    @Override
    public void addingCheese() {
        cookingInstructions += " sprinkling with some cheese";
    }

    @Override
    public void addingToppings() {
        cookingInstructions += " adding some Green bell pepper, red onion, mushrooms, tomato, and olives";
    }

}
