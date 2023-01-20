package com.hz;

public class HasFoodState implements State {
    Waiter waiter;

    public HasFoodState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter: There is your food, enjoy!":
                "Ober: Alstublieft, uw eten");
        waiter.write(ans);
        if (waiter.getCount() > 0) {
            waiter.count = waiter.getCount() - 1;
        }
        waiter.setState(waiter.takingReviewState());
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "**Waiter is delivering food at the moment**":
                "**De ober is aan het bedienen op het moment**");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}