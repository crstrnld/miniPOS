interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    public void send(String message) {
        System.out.println("[EMAIL] Sending: " + message);
    }
}
class SMSNotification implements NotificationService {
    public void send(String message) {
        System.out.println("[SMS] Sending: " + message);
    }
}

class PushNotification implements NotificationService {
    public void send(String message) {
        System.out.println("[PUSH] Sending: " + message);
    }
}