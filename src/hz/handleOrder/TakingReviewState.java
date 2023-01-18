public class takingReviewState implements State {
    Waiter waiter;

    public takingReviewState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void customerInteraction() {
        this.writer.write("Are you enjoying your food? Any complaints?");
        this.reader.readLine();
        //add if statements for adapter to get either a good or bad answer and change the state accordingly
        waiter.setState(waiter.hasPaymentState());
    }

    public void kitchenInteraction() {
        System.out.println("Waiter is busy at the moment");
    }
}