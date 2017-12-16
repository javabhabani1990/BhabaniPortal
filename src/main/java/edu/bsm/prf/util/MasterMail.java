package edu.bsm.prf.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MasterMail {

	public static void send(String destination, String subjectMsg,
			String bodyMsg) {

		System.out.println("Master mail started");

		String to = destination;
		String subject = subjectMsg;
		String body = bodyMsg;

		System.out.println("to : " + to);
		System.out.println("subject : " + subject);
		System.out.println("body : " + body);

		Properties prop = new Properties();
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.user", "technology.adv.laboratory@gmail.com");
		prop.put("mail.smtp.password", "bhabani123");
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(prop, null);
		MimeMessage mime = new MimeMessage(session);

		try {

			InternetAddress mailTo = new InternetAddress(to);
			InternetAddress mailFrom = new InternetAddress(
					"technology.adv.laboratory@gmail.com");

			mime.addRecipient(Message.RecipientType.TO, mailTo);

			/*
			 * Address[] cc = new Address[] { new
			 * InternetAddress("javabhabani@gmail.com"), new
			 * InternetAddress("tech.bhabani@gmail.com")};
			 * mime.addRecipients(Message.RecipientType.CC, cc);
			 * 
			 * System.out.println("emaild cc1 "+cc[0]);
			 * System.out.println("emaild cc2 "+cc[1]);
			 */

			mime.setFrom(mailFrom);

			mime.setSubject(subject);

			mime.setText(body);

			Transport t = session.getTransport("smtp");
			t.connect("smtp.gmail.com", "technology.adv.laboratory@gmail.com",
					"bhabani123");
			t.sendMessage(mime, mime.getAllRecipients());

			t.close();

			System.out.println("Mail sent");

		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

}
