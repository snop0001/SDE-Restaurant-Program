package com.hz;

public class RestaurantFacade {
    String language;

    Waiter waiter;

    ConsoleWriter writer;

    ConversationDirector director;

    ConversationBuilder builder;

    int refill;

    public RestaurantFacade(int pizzas, String language, int pizzasRefill) {
        this.writer = new ConsoleWriter();
        this.waiter = new Waiter(pizzas, language);
        this.refill = pizzasRefill;
        if (language.equals("English")) {
            this.builder = new EnglishConversationBuilder();
        } else {
            this.builder = new DutchConversationBuilder();
        }

        this.director = new ConversationDirector(builder);

    }

    public void introConversation() {
        String conversation = director.makeWelcomeConversation();

        writer.writeLine(conversation);
    }

    public void waiterInteraction() {
        // changing from idle
        this.waiter.state.customerInteraction();
        while (!(this.waiter.state instanceof IdleState)) {
            takingOrder();
            if (this.waiter.state instanceof HasNoMorePizzasSate) {
                noPizzas();
            } else {
                food();
                review();
            }
        }

    }

    public void takingOrder() {
        this.waiter.customerInteraction();
    }

    public void noPizzas() {
        this.waiter.customerInteraction();
        this.waiter.refill(this.refill);
    }

    public void food() {
        this.waiter.kitchenInteraction();
        this.waiter.customerInteraction();
    }

    public void review() {
        this.waiter.customerInteraction();
        this.waiter.customerInteraction();
    }

}
