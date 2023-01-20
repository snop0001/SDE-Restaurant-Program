package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Waiter waiter = new Waiter(10);

        // conversation
        EnglishConversationBuilder builder = new EnglishConversationBuilder();

        ConversationDirector director = new ConversationDirector(builder);

//        director.ChangeBuilder(new DutchConversationBuilder());

        String conversation = director.makeWelcomeConversation();

        writer.writeLine(conversation);
        waiterInteraction(waiter);

    }
    public static void waiterInteraction(Waiter waiter) {
        // changing from idle
        waiter.state.customerInteraction();
        while (!(waiter.state instanceof IdleState)) {
            if (waiter.getCount() > 0) {
                waiter.customerInteraction();
                waiter.kitchenInteraction();
            } else {
                waiter.refill(10);
            }
        }

    }
}
