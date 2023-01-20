package com.hz;

public class HasOrderState implements State {
    Waiter waiter;

    Pizzas pizza;

    public HasOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "The waiter has your order, please wait":
                "De ober heeft uw bestelling, even geduld alstublieft.");
        waiter.write(ans);
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage() == "English")?
                "Hey there is a new order":"Hey hier is een nieuwe bestelling");
        waiter.write(ans);
        String pizzaType = waiter.getAnswer();
        if (pizzaType.contains("vegeterian")) {
            pizza = new VegeterianPizza("tomato");

        } else if (pizzaType.contains("vegan")) {
            pizza = new VeganPizza("tomato");

        } else if (pizzaType.contains("whole wheat")) {
            pizza = new WholeWheatPizza("tomato");

        } else {
            pizza = new RegularPizza("tomato");

        }

        String ans2 = ((waiter.getLanguage() == "English")?
                pizza.serve() + " *Kitchen voices*":pizza.serve() + " *Keuken geluiden*");
        waiter.write(ans2);

        String ans3 = ((waiter.getLanguage() == "English")?
                "Thank you I will take this to the client" : "Bedankt ik zal dit naar de gast brengen");
        waiter.write(ans3);

        waiter.setState(waiter.hasFoodState());
    }

    @Override
    public void refill() {

    }
}