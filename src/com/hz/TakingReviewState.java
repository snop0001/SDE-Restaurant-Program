package com.hz;

public class TakingReviewState implements State {
    Waiter waiter;

    public TakingReviewState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans1 = ((waiter.getLanguage().equals("English"))?
                "Waiter: Hope you are enjoying your food, Any complaints?":
                "Ober: Ik hoop dat alles naar wens is, zijn er klachten?");
        waiter.write(ans1);
        boolean ans = waiter.readReview();
        if (ans) {
            String ans2 = ((waiter.getLanguage().equals("English"))?
                    "Waiter: We are glad to hear you enjoyed your meal, here is your bill":
                    "Ober: Fijn dat alles naar wens was, hier is de rekening");
            waiter.write(ans2);
            waiter.setState(waiter.hasPaymentState());
        } else {
            waiter.setState(waiter.hasComplainState());
        }
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "**Waiter is busy at the moment**":
                "**De ober is bezig op het moment**");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}