import java.util.UUID;

abstract class Payment {
    protected double amount;
    protected String transactionId;
    protected String status;

    public Payment(double amount) {
        this.amount = amount;
        this.transactionId = UUID.randomUUID().toString().substring(0, 8);
        this.status = "PENDING";
    }

    public abstract void processPayment();

    public String getDetails() {
        return "ID: " + transactionId + " | Amount: $" + amount + " | Status: " + status;
    }
}
