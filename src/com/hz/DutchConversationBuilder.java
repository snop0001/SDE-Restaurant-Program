package com.hz;

public class DutchConversationBuilder implements ConversationBuilder {
    private String _conversation = "";

    public void addressSir(String name) {
        _conversation += "Ober: Goedendag meneer " + name + "!";
        this.addNewLine();
    }

    public void addressMadam(String name) {
        _conversation += "Ober: Goedendag mevrouw " + name + ",";
    }

    public void welcomeMessage() {
        _conversation += " welkom bij Pizza Pizzeria! Ik zal uw ober zijn voor vanavond";
        this.addNewLine();
    }

    public void guestsAmount(int num) {
        _conversation += "Ober: Oh super, ik hoor dat u met " + num + " personen zijn vandaag";
        this.addNewLine();
    }

    public void showTable() {
        _conversation += "Ober: Laat me u naar uw tafel brengen";
        this.addNewLine();
    }

    public void enjoy() {
        _conversation += "Ober: Geniet van uw eten!";
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