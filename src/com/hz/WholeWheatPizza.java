package com.hz;

public class WholeWheatPizza extends Pizzas {
    public WholeWheatPizza(String sauce) {
        this.type = "classic whole wheat pizza";
        this.sauce = sauce;
    }

    @Override
    public void addingCheese() {
        cookingInstructions += " sprinkling with some low fat cheese";
    }

    @Override
    public void addingToppings() {
        cookingInstructions += " adding some peppers, ham and griled chicken";
    }

}
