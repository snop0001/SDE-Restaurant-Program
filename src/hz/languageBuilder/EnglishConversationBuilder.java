public class EnglishConversationBuilder implements ConversationBuilder {
    private String _conversation = "";

    public void addressSir(String name) {
        _conversation += "Hello Mr." + name + "!";
        this.addNewLine();
    }

    public void addressMadam(String name) {
        _conversation += "Hello Ms." + name + "!";
        this.addNewLine();
    }

    public void welcomeMessage() {
        _conversation += "and welcome to Pizza Pizzeria!";
        this.addNewLine();
    }

    public void guestsAmount(int num) {
        _conversation += "Oh I see you are " + num + " guests today";
        this.addNewLine();
    }

    public void showTable() {
        _conversation += "Let me take you to your table";
        this.addNewLine();
    }

    public void enjoy() {
        _conversation += "Here you go! Hope you will enjoy your meal!";
        this.addNewLine();
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