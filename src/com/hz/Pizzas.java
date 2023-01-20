package com.hz;

public abstract class Pizzas {
    String type;
    String sauce;
    String cookingInstructions = "";
    // String sauce;

    public final String serve() {
        makingDough();
        addNewLine();
        makingSauce();
        addNewLine();
        addingCheese();
        addNewLine();
        addingToppings();
        addNewLine();
        Oven();
        addNewLine();

        return "**Kitchen staff** New order! one " + type + " Lets do it! " + cookingInstructions
                + "...all ready! waiter! *ding* *ding* ";
    }

    // default imlementations
    public void makingDough() {
        if (type == "classic whole wheat pizza") {
            cookingInstructions += " making whole wheat dough,";
        } else {
            cookingInstructions += " making the dough,";
        }

    }

    public void makingSauce() {
        cookingInstructions += " adding " + sauce + " sauce,";
    }

    public void Oven() {
        cookingInstructions += " OVEN TIME!";
    }

    // methods to be implemented by subclasses
    public abstract void addingCheese();

    public abstract void addingToppings();

    private void addNewLine() {
        cookingInstructions += "\n\r";
    }

}
