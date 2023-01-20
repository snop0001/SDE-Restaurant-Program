package com.hz;

public class TakingOrderState implements State {
    Waiter waiter;

    public TakingOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        int count = waiter.getCount();
        if (count > 0) {
            String ans1 = ((waiter.getLanguage() == "English")?
                    "What would you like to order? We have vegan, vegeterian, classic and whole wheat classic":
                    "Wat wilt u bestellen? We hebben vegan, vegetarisch, classic en volkoren classic");
            waiter.write(ans1);
            boolean ans = waiter.readOrder();
            if (ans) {
                waiter.setState(waiter.hasOrderState());
            } else {
                waiter.write("Sorry we dont have this today");
            }

        } else {
            String ans1 = ((waiter.getLanguage() == "English")?
                    "Sorry we are having delays in the kitchen so waiting times may be longer":
                    "Excuses, we hebben wat vertraging in de keuken, het kan iets langer duren.");
            waiter.write(ans1);
            waiter.setState(waiter.hasNoMorePizzasSate());
        }
    }

    @Override
    public void kitchenInteraction() {
        waiter.write("There is no order yet");
    }

    @Override
    public void refill() {

    }
}