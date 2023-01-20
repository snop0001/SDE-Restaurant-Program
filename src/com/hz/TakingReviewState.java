package com.hz;

public class TakingReviewState implements State {
    Waiter waiter;

    public TakingReviewState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        waiter.write("Hope you are enjoying your food, Any complaints?");
        boolean ans = waiter.readReview();
        if (ans) {
            waiter.write("We are glad to hear you enjoyed your meal, here is your bill");
            waiter.setState(waiter.hasPaymentState());
        } else {
            waiter.setState(waiter.hasComplainState());
        }
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("Waiter is busy at the moment");
    }

    @Override
    public void refill() {

    }
}