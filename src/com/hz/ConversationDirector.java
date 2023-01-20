package com.hz;

public class ConversationDirector {

    private ConversationBuilder _builder;
    private ConsoleReader reader = new ConsoleReader();
    private ConsoleWriter writer = new ConsoleWriter();

    public ConversationDirector(ConversationBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(ConversationBuilder builder) {
        _builder = builder;
    }

    public String makeWelcomeConversation() {
        String name;
        int guestAmount;
        _builder.reset();
        if(_builder instanceof EnglishConversationBuilder) {
            writer.writeLine("Host: Good evening, can I get your name please?");
            name = reader.readLine();
            writer.writeLine("Host: With how many people are you here tonight " + name + "?");
            guestAmount = Integer.parseInt(reader.readLine());
            writer.writeLine("Host: waiter, can you please help " + name + " tonight?");
        } else {
            writer.writeLine("Gastheer: Goedenavond, wat is uw naam?");
            name = reader.readLine();
            writer.writeLine("Gastheer: En met hoeveel mensen bent u hier vanavond, " + name + "?");
            guestAmount = Integer.parseInt(reader.readLine());
            writer.writeLine("Host: ober, zou u alstublieft " + name + " kunnen helpen vanavond?");
        }


        _builder.addressMadam(name);
        _builder.welcomeMessage();
        _builder.guestsAmount(guestAmount);
        _builder.showTable();
        _builder.enjoy();

        return _builder.getConversation();
    }
}