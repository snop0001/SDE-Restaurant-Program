public class HasFoodState implements State {
    Waiter waiter;

    public HasFoodState(Waiter waiter) {
        this.waiter = waiter;
    }

    public void customerInteraction() {
        System.out.println("Hey, here is your food");
        waiter.setState(waiter.takingReviewState());
    }

    public void kitchenInteraction() {
        System.out.println("Waiter is delivering food at the moment");
    }
}