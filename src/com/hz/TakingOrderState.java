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
            String ans1 = ((waiter.getLanguage().equals("English"))?
                    "Waiter: What would you like to order? We have vegan, vegeterian, classic and whole wheat classic":
                    "Ober: Wat wilt u bestellen? We hebben vegan, vegetarisch, classic en volkoren classic");
            waiter.write(ans1);
            boolean ans = waiter.readOrder();
            if (ans) {
                waiter.setState(waiter.hasOrderState());
            } else {
                waiter.write("Sorry we dont have this today");
            }

        } else {
            String ans1 = ((waiter.getLanguage().equals("English"))?
                    "Waiter: Sorry we are having delays in the kitchen so waiting times may be longer":
                    "Ober: Excuses, we hebben wat vertraging in de keuken, het kan iets langer duren.");
            waiter.write(ans1);
            waiter.setState(waiter.hasNoMorePizzasSate());
        }
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter: There is no order yet":
                "Ober: Excuses, we hebben wat vertraging in de keuken, het kan iets langer duren.");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }
}