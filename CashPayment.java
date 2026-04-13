class CashPayment extends Payment {
    public CashPayment(double amount) { super(amount); }

    @Override
    public void processPayment() {
        this.status = "SUCCESS";
        System.out.println("Cash payment accepted at counter.");
    }
}

class EWalletPayment extends Payment {
    public EWalletPayment(double amount) { super(amount); }

    @Override
    public void processPayment() {
        this.status = "SUCCESS";
        System.out.println("E-Wallet API: Scanning QR code... Done.");
    }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) { super(amount); }

    @Override
    public void processPayment() {
        this.status = "SUCCESS";
        System.out.println("Verifying bank transfer via virtual account...");
    }
}