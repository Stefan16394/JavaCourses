package P02_services;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
