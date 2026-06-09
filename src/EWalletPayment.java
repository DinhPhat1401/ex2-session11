import java.io.Serializable;

public class EWalletPayment extends Payment implements Refundable {
    public EWalletPayment(double amount) {
        super(amount);
    }
    @Override
    public void printAmount() {
        System.out.println("E-Wallet Payment Amount: " + amount);
    }

    @Override
    public void pay() {
        System.out.println("EWallet Payment Amount: " + amount);

    }

    @Override
    public void refund() {
        System.out.println("EWallet Refund Amount: " + amount);

    }
}
