package com.csdepartment.mvc.controller;

import java.net.Authenticator;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.websocket.Session;



public class JavaMail {
	

	Properties emailProperties;
	javax.mail.Session mailSession;
	MimeMessage emailMessage;
	
	public JavaMail() throws AddressException, MessagingException {
		
		this.setMailServerProperties();
		this.createEmailMessage();
		this.sendEmail();
	}
	
	public void setMailServerProperties() {

		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");

	}
	public void createEmailMessage() throws AddressException,
	MessagingException {
		String[] toEmails = { "andrei.cr30@gmail.com" };
		String emailSubject = "Java Email";
		String emailBody = "This is an email sent by JavaMail api.";

		mailSession = javax.mail.Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);

		for (int i = 0; i < toEmails.length; i++) {
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
		}

		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");//for a html email
//emailMessage.setText(emailBody);// for a text email

}
	public void sendEmail() throws AddressException, MessagingException {

		String emailHost = "smtp.gmail.com";
		String fromUser = "cristeaandrei81";//just the id alone without @gmail.com
		String fromUserEmailPassword = "lucieprost";

		Transport transport = mailSession.getTransport("smtp");

		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
		System.out.println("Email sent successfully.");
	}
    

}
