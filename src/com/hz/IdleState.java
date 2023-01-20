package com.hz;

public class IdleState implements State {
    Waiter waiter;

    public IdleState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "waiting for new customer":
                "Wachtend op nieuwe gasten");
        waiter.write(ans);
        waiter.setState(waiter.takingOrderState());

    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "waiting for new customer":
                "Wachtend op nieuwe gasten");
        waiter.write(ans);
    }

    @Override
    public void refill() {

    }

}