package com.hz;

public interface ConversationBuilder {

    void addressSir(String name);

    void addressMadam(String name);

    void welcomeMessage();

    void guestsAmount(int num);

    void showTable();

    void enjoy();

    void reset();

    String getConversation();
}