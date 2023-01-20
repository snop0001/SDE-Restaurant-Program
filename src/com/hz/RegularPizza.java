package com.hz;

public class RegularPizza extends Pizzas {
    public RegularPizza(String sauce) {
        this.type = "classic pizza";
        this.sauce = sauce;
    }

    @Override
    public void addingCheese() {
        cookingInstructions += "sprinkling cheese";

    }

    @Override
    public void addingToppings() {
        cookingInstructions += "adding some peppers, ham and griled chicken";

    }

}
