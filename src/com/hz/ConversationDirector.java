package com.hz;

public class ConversationDirector {

    private ConversationBuilder _builder;

    public ConversationDirector(ConversationBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(ConversationBuilder builder) {
        _builder = builder;
    }

    public String makeWelcomeConversation() {
        _builder.reset();
        _builder.addressMadam("Els");
        _builder.welcomeMessage();
        _builder.guestsAmount(2);
        _builder.showTable();
        _builder.enjoy();

        return _builder.getConversation();
    }
}