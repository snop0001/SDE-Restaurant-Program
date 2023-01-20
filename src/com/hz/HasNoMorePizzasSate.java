package com.hz;

public class HasNoMorePizzasSate implements State {
    Waiter waiter;

    public HasNoMorePizzasSate(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "Sorry we are out of pizzas at the moment, the kitchen is making more":
                "Het spijt me, we hebben momenteel geen pizzas meer. De keuken is er druk mee bezig.");
        waiter.write(ans);
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "Waiting for more pizzas": "Wachtend op meer pizzas");
        waiter.write(ans);
    }

    @Override
    public void refill() {
        waiter.setState(waiter.takingOrderState());
    }
}