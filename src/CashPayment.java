public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void printAmount() {
        System.out.println("Cash Payment Amount: " + amount);
    }

    @Override
    public void pay() {
        System.out.println("Processing cash payment of: " + amount);

    }
}
