package com.hz;

public class HasFoodState implements State {
    Waiter waiter;

    public HasFoodState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("Hey, here is your food");
        if (waiter.getCount() > 0) {
            waiter.count = waiter.getCount() - 1;
        }
        waiter.setState(waiter.takingReviewState());
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Waiter is delivering food at the moment");
    }

    @Override
    public void refill() {

    }
}