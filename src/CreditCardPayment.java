public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void printAmount() {
        System.out.println("Credit Card Payment Amount: " + amount);

    }

    @Override
    public void pay() {
        System.out.println("Credit Card Payment Amount: " + amount);

    }

    @Override
    public void refund() {
        System.out.println("Refunding credit card payment of: " + amount);

    }
}
