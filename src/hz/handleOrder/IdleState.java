public class idleState implements State {
    Waiter waiter;

    public idleState(Waiter waiter) {
        this.waiter = waiter;
    }

}