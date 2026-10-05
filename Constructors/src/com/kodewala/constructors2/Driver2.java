package com.kodewala.constructors2;

public class Driver2 {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("sms");
		notificationService.sendNotification("email");
		notificationService.sendNotification("whatsApp");
		notificationService.sendNotification("abc");

	}

}
