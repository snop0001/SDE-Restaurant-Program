public class Waiter {

    State idleState;
    State takingOrderState;
    State hasOrderState;
    State noMorePizzasSate;
    State hasComplainState;
    State hasFoodState;
    State hasPaymentState;
    State hasNoPaymentState;
    State takingOrderState;
    State takingReviewState;
    
    State state;
    int count = 0;
    
    public Waiter(int pizzasAmount) {

        idleState = new idleState(this);
        hasOrderState = new hasOrderState(this);
        noMorePizzasState = new noMorePizzasSate(this);
        hasComplainState = new hasComplainState(this);
        hasFoodState = new hasFoodState(this);
        hasPaymentState = new hasPaymentState(this);
        hasNoPaymentState = new hasNoPaymentState(this);
        takingOrderState = new takingOrderState(this);
        takingReviewState = new takingReviewState(this);

        this.count = pizzasAmount;
        if(pizzasAmount > 0) {
            state = idleState;
        } else {
            state = noMorePizzasState;
        }

    }

    public void customerInteraction() {
        state.customerInteraction();
    }

    public void kitchenInteraction() {
        state.kitchenInteraction();
    }

    public State getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("We have pizzas again! In particular, we have " + this.count + " pizzas left.")
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State idleState() {
        return idleState;
    }
    
    public State hasOrderState() {
        return hasOrderState;
    }

    public State noMorePizzasSate() {
        return noMorePizzasSate;
    }

    public State hasComplainState() {
        return hasComplainState;
    }

    public State hasFoodState() {
        return hasFoodState;
    }

    public State hasPaymentState() {
        return hasPaymentState;
    }

    public State hasNoPaymentState() {
        return hasNoPaymentState;
    }

    public State takingOrderState() {
        return takingOrderSate;
    }

    public State takingReviewState() {
        return takingReviewState;
    }


}