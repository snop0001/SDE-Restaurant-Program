package com.hz;

public class HasOrderState implements State {
    Waiter waiter;

    Pizzas pizza;

    public HasOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void customerInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "**The waiter has your order, please wait**":
                "**De ober heeft uw bestelling, even geduld alstublieft.**");
        waiter.write(ans);
    }

    @Override
    public void kitchenInteraction() {
        String ans = ((waiter.getLanguage().equals("English"))?
                "Waiter to kitchen: Hey there is a new order":
                "Ober aan de keuken: Hey hier is een nieuwe bestelling");
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

        String ans2 = ((waiter.getLanguage().equals("English"))?
                pizza.serve() + " *Kitchen voices*":pizza.serve() + " *Keuken geluiden*");
        waiter.write(ans2);

        String ans3 = ((waiter.getLanguage().equals("English"))?
                "Waiter to kitchen: Thank you I will take this to the client" :
                "Ober aan de keuken: Bedankt ik zal dit naar de gast brengen");
        waiter.write(ans3);

        waiter.setState(waiter.hasFoodState());
    }

    @Override
    public void refill() {

    }
}