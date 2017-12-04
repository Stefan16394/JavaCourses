package P02_services;

public class OnlineStoreOrder {

    private NotificationService notificationService;

    public OnlineStoreOrder(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void process() {
            this.notificationService.sendNotification();
        }

}
