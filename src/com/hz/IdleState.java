package com.hz;

public class IdleState implements State {
    Waiter waiter;

    public IdleState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("waiting for new customer");
        waiter.setState(waiter.takingOrderState());

    }

    @Override
    public void kitchenInteraction() {
        waiter.write("waiting for new costumer");
    }

    @Override
    public void refill() {

    }

}