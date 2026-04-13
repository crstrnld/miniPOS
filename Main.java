public class Main {
    public static void main(String[] args) {
        MiniPOS myStore = new MiniPOS();
        myStore.setNotificationMethod(new SMSNotification());
        myStore.checkout(new CashPayment(50.0));
        myStore.setNotificationMethod(new PushNotification());
        myStore.checkout(new EWalletPayment(120.5));
        myStore.setNotificationMethod(new EmailNotification());
        myStore.checkout(new BankTransferPayment(2500.0));
        myStore.showHistory();
    }
}