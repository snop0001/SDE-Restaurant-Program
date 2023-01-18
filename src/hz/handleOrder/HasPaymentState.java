public class hasPaymentState implements State {
    Waiter waiter;

    public hasPaymentState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void customerInteraction() {
        this.writer.write("Thank you, have a good evening!");
        waiter.setState(waiter.idleState());
    }

    public void kitchenInteraction() {
        System.out.println("Waiter is busy at the moment");
    }
}