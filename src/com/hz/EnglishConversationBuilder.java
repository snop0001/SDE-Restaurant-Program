package com.hz;

public class EnglishConversationBuilder implements ConversationBuilder {
    private String _conversation = "";

    public void addressSir(String name) {
        _conversation += "Waiter: Hello Mr." + name + "!";
        this.addNewLine();
    }

    public void addressMadam(String name) {
        _conversation += "Waiter: Hello Ms." + name + ",";
    }

    public void welcomeMessage() {
        _conversation += "welcome to Pizza Pizzeria! I will be helping you out tonight";
        this.addNewLine();
    }

    public void guestsAmount(int num) {
        _conversation += "Waiter: Okay great, I heard you are with " + num + " guests";
        this.addNewLine();
    }

    public void showTable() {
        _conversation += "Waiter: Let me take you to your table";
        this.addNewLine();
    }

    public void enjoy() {
        _conversation += "Waiter: Here you go! Hope you will enjoy your meal!";
        this.addNewLine();
    }

    public void reset() {
        _conversation = "";
    }

    public String getConversation() {
        return _conversation;
    }

    private void addNewLine() {
        _conversation += "\n\r";
    }
}