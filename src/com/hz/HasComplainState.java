package com.hz;

public class HasComplainState implements State {
    Waiter waiter;

    public HasComplainState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("I am sorry to hear you are dissatisfied, lets give you something else");
        waiter.setState(waiter.takingOrderState());
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Waiter is checking up on customers");
    }

    @Override
    public void refill() {

    }
}