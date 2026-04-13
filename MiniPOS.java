import java.util.ArrayList;
import java.util.List;

class MiniPOS {
    private List<Payment> history = new ArrayList<>();
    private NotificationService notifier;
    public void setNotificationMethod(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void checkout(Payment payment) {
        try {
            if (payment.amount <= 0) throw new Exception("Invalid amount!");

            payment.processPayment();
            history.add(payment);

            if (notifier != null) {
                notifier.send("Payment of $" + payment.amount + " was " + payment.status);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void showHistory() {
        System.out.println("\n--- TRANSACTION HISTORY ---");
        for (Payment p : history) {
            System.out.println(p.getDetails());
        }
    }
}