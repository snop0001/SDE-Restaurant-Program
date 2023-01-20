package com.hz;

public class HasNoMorePizzasSate implements State {
    Waiter waiter;

    public HasNoMorePizzasSate(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter: I'm sorry we are out of pizzas at the moment, the kitchen is making more":
                "Ober: Het spijt me, we hebben momenteel geen pizzas meer. De keuken is er druk mee bezig.");
        waiter.write(ans);
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter to kitchen: Waiting for more pizzas":
                "Ober aan de keuken: Wachtend op meer pizzas");
        waiter.write(ans);
    }

    @Override
    public void refill() {
        waiter.setState(waiter.takingOrderState());
    }
}