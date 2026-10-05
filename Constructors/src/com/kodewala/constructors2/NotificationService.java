package com.kodewala.constructors2;

public class NotificationService {

	public void sendNotification(String _type) {
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		}else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
		}else if(_type.equalsIgnoreCase("whatsApp")) {
			sendWhatsAppNotification();
		}else {
			System.out.println("Invalid Service.");
		}
	}
	
	private void sendSMS() {
		System.out.println("SMS service calling...");
	}
	
	private void sendEmail() {
		System.out.println("Email service calling...");
	}
	
	private void sendWhatsAppNotification() {
		System.out.println("Whatsapp service calling...");
	}
}
