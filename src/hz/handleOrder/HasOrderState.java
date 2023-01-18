public class HasOrderState implements State {
    Waiter waiter;

    public HasOrderState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void customerInteraction() {
        System.out.println("The waiter has your order, please wait");
    }
    
    public void kitchenInteraction() {
        System.out.println("Hey, here is a new order");
        waiter.setState(waiter.hasFoodState());
    }
}