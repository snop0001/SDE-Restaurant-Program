public class DutchConversationBuilder implements ConversationBuilder {
    private String _conversation = "";

    public void addressSir(String name) {
        _conversation += "Goedendag meneer " + name + "!";
        this.addNewLine();
    }

    public void addressMadam(String name) {
        _conversation += "Goedendag mevrouw " + name + "!";
        this.addNewLine();
    }

    public void welcomeMessage() {
        _conversation += "en welkom bij Pizza Pizzeria!";
        this.addNewLine();
    }

    public void guestsAmount(int num) {
        _conversation += "Oh ik zie dat jullie met " + num + " personen zijn vandaag";
        this.addNewLine();
    }

    public void showTable() {
        _conversation += "Laat me u naar uw tafel brengen";
        this.addNewLine();
    }

    public void enjoy() {
        _conversation += "Geniet van uw eten!";
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