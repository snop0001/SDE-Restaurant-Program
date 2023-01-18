public class TakingOrderState implements State {
    Waiter waiter;

    public TakingOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void customerInteraction() {
        System.out.println("What do you want to order?");
        waiter.setState(waiter.hasOrderState());
    }

    public void kitchenInteraction() {
        System.out.println("There is no order yet");
    }
}