package com.hz;

public class TakingReviewState implements State {
    Waiter waiter;

    public TakingReviewState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans1 = ((waiter.getLanguage() == "English")?
                "Hope you are enjoying your food, Any complaints?":
                "Ik hoop dat alles naar wens is, zijn er klachten?");
        waiter.write(ans1);
        boolean ans = waiter.readReview();
        if (ans) {
            String ans2 = ((waiter.getLanguage() == "English")?
                    "We are glad to hear you enjoyed your meal, here is your bill":
                    "Fijn dat alles naar wens was, hier is de rekening");
            waiter.write(ans2);
            waiter.setState(waiter.hasPaymentState());
        } else {
            waiter.setState(waiter.hasComplainState());
        }
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "Waiter is busy at the moment":
                "De ober is bezig op het moment");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}