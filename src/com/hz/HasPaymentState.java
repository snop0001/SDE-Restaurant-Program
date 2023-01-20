package com.hz;

public class HasPaymentState implements State {
    Waiter waiter;

    public HasPaymentState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter: Thank you, have a good evening!":
                "Ober: Bedankt, fijne avond!");
        waiter.write(ans);
        waiter.setState(waiter.idleState());
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "**Waiter is busy at the moment**":
                "**De ober is bezig momenteel**");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}