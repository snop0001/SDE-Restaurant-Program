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
        this.waiter = new Waiter(pizzas);
        this.refill = pizzasRefill;
        if (language == "English") {
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
            this.waiter.customerInteraction();
            this.waiter.kitchenInteraction();
            this.waiter.refill(this.refill);
        }
    }

}
