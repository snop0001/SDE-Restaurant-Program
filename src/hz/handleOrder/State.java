public interface State {
    private ConsoleReader reader = new ConsoleReader();
    private ConsoleWriter writer = new ConsoleWriter();

    public void customerInteraction();
    public void kitchenInteraction();
}