package com.hz;

import com.hz.RestaurantFacade;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        writer.writeLine(
                "Welcome Player! Before we can start with the Restaurant Simulator, we need to ask you some questions...");
        writer.writeLine("How many pizzas do you want to start with?");
        int pizzaAmount = Integer.parseInt(reader.readLine());
        writer.writeLine("How many pizzas do you want per refill each time?");
        int refillAmount = Integer.parseInt(reader.readLine());
        writer.writeLine("And lastly, in what language would you like to play? (English/Dutch)");
        String language = reader.readLine();
        String setLanguage = "";
        if (language.equals("English") || language.equals("Dutch")) {
            setLanguage = language;
        } else {
            writer.writeLine("Please choose English or Dutch");
            setLanguage = reader.readLine();
        }

        RestaurantFacade facade = new RestaurantFacade(pizzaAmount, setLanguage, refillAmount);

        facade.introConversation();
        facade.waiterInteraction();
    }

}
