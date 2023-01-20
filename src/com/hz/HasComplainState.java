package com.hz;

public class HasComplainState implements State {
    Waiter waiter;

    public HasComplainState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter: I am sorry to hear you are dissatisfied, lets give you something else":
                "Ober: Het spijt me dat u niet tevreden bent, we kunnen u iets anders aanbieden.");
        waiter.write(ans);
        waiter.setState(waiter.takingOrderState());
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "**Waiter is checking up on customers**":
                "**De ober is bezig met gasten**");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}