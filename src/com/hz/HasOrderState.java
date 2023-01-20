package com.hz;

public class HasOrderState implements State {
    Waiter waiter;

    Pizzas pizza;

    public HasOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("The waiter has your order, please wait");
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Hey, here is a new order");
        String pizzaType = waiter.getAnswer();
        if (pizzaType.contains("vegeterian")) {
            pizza = new VegeterianPizza("tomato");

        } else if (pizzaType.contains("vegan")) {
            pizza = new VeganPizza("tomato");

        } else if (pizzaType.contains("whole wheat")) {
            pizza = new WholeWheatPizza("tomato");

        } else {
            pizza = new RegularPizza("tomato");

        }
        waiter.write("*Kitchen voices* " + pizza.serve());
        waiter.write("Thank you I will take this to the client");
        waiter.setState(waiter.hasFoodState());
    }

    @Override
    public void refill() {

    }
}