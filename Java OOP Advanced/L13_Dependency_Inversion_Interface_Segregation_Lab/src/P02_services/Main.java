package P02_services;

public class Main {
    public static void main(String[] args) {
        CompositeNotificationService notificationService=new CompositeNotificationService(new EmailNotificationService(true),
                new SmsNotificationService(),new EmailNotificationService(false));
        OnlineStoreOrder os=new OnlineStoreOrder(notificationService);
        os.process();
    }
}
