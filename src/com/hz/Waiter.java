package com.hz;

public class Waiter {

    State idleState;
    State takingOrderState;
    State hasOrderState;
    State hasNoMorePizzasSate;
    State hasComplainState;
    State hasFoodState;
    State hasPaymentState;
    State hasNoPaymentState;
    State takingReviewState;

    State state;
    int count = 0;

    String language;

    ConsoleReader reader;
    ConsoleWriter writer;
    NoComplainsBooleanAdapter complaintsAdapter;
    OrderBooleanAdapter orderAdapter;

    public Waiter(int pizzasAmount, String language) {

        reader = new ConsoleReader();
        writer = new ConsoleWriter();
        complaintsAdapter = new NoComplainsBooleanAdapter(reader);
        orderAdapter = new OrderBooleanAdapter(reader);
        idleState = new IdleState(this);
        hasOrderState = new HasOrderState(this);
        hasNoMorePizzasSate = new HasNoMorePizzasSate(this);
        hasComplainState = new HasComplainState(this);
        hasFoodState = new HasFoodState(this);
        hasPaymentState = new HasPaymentState(this);
        takingOrderState = new TakingOrderState(this);
        takingReviewState = new TakingReviewState(this);

        this.language = language;
        this.count = pizzasAmount;
        if (pizzasAmount > 0) {
            state = idleState;
        } else {
            state = hasNoMorePizzasSate;
        }

    }

    public void customerInteraction() {
        state.customerInteraction();
    }

    public void kitchenInteraction() {
        state.kitchenInteraction();
    }

    public int getCount() {
        return this.count;
    }

    public String getLanguage() { return this.language; }

    public String getAnswer() {
        return orderAdapter.getAnswerGiven();
    }

    public void write(String sentence) {
        writer.writeLine(sentence);
    }

    public boolean readReview() {
        return complaintsAdapter.readLine();
    }

    public boolean readOrder() {
        return orderAdapter.readLine();
    }

    void refill(int count) {
        this.count += count;
        System.out.println("We have pizzas again! In particular, we have " + this.count + " pizzas left.");
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

    public State hasNoMorePizzasSate() {
        return hasNoMorePizzasSate;
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

    public State takingOrderState() {
        return takingOrderState;
    }

    public State takingReviewState() {
        return takingReviewState;
    }

}