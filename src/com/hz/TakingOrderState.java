package com.hz;

public class TakingOrderState implements State {
    Waiter waiter;

    public TakingOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        int count = waiter.getCount();
        if (count > 0) {
            waiter.write("What would you like to order?");
            waiter.write("we have vegan, vegeterian, classic and whole wheat classic");
            boolean ans = waiter.readOrder();
            if (ans) {
                waiter.setState(waiter.hasOrderState());
            } else {
                waiter.write("Sorry we dont have this today");
            }

        } else {
            waiter.write("Sorry we are having delays in the kitchen so waiting times may be longer");
            waiter.setState(waiter.hasNoMorePizzasSate());
        }
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("There is no order yet");
    }

    @Override
    public void refill() {

    }
}