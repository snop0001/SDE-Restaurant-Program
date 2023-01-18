public class EngishConversationBuilder implements  ConversationBuilder {
    private String _conversation = "";

    public void addressSir (String name) {
        _conversation += "Hello Mr." + name + "!";
        this.addNewline();
    }

    public void addressMadam (String name) {
        _conversation += "Hello Ms." + name + "!";
        this.addNewline();
    }

    public void welcomeMessage () {
        _conversation += "and welcome to Pizza Pizzeria!";
        this.addNewline();
    }

    public void guestsAmount (int num ) {
        _conversation += "Oh I see you are " + num + " guests today";
        this.addNewline();
    }

    public void showTable () {
        _conversation += "Let me take you to your table";
        this.addNewline();
    }

    public void showTable () {
        _conversation += "Here you go! Hope you will enjoy your meal!";
        this.addNewline();
    }

    public void reset() {
        _conversation = "";
    }

    public String getEmail() {
        return _conversation;
    }

    private void addNewLine() {
        _conversation += "\n\r";
    }
}