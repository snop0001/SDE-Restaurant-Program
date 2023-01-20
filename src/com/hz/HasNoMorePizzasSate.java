package com.hz;

public class HasNoMorePizzasSate implements State {
    Waiter waiter;

    public HasNoMorePizzasSate(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("Sorry we are out of pizzas at the moment, the kitchen is making more");
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Waiting for more pizzas");
    }

    @Override
    public void refill() {
        waiter.setState(waiter.takingOrderState());
    }
}