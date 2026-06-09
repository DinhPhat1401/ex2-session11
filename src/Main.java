import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new CashPayment(100.0));
        payments.add(new CashPayment(200.0));
        payments.add(new CreditCardPayment(150.0));
        payments.add(new CreditCardPayment(200.0));
        payments.add(new EWalletPayment(50.0));
        payments.add(new EWalletPayment(20.0));

        for (Payment payment : payments) {
            payment.pay();
            if(payment instanceof Refundable refun) {
                refun.refund();
            }
            System.out.println("-----------------------------");
        }
    }
}