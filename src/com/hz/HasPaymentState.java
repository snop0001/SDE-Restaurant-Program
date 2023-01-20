package com.hz;

public class HasPaymentState implements State {
    Waiter waiter;

    public HasPaymentState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("Thank you, have a good evening!");
        waiter.setState(waiter.idleState());
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Waiter is busy at the moment");
    }

    @Override
    public void refill() {

    }
}