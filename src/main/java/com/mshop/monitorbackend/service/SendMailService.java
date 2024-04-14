package com.mshop.monitorbackend.service;

import java.io.IOException;



import com.mshop.monitorbackend.entity.MailInfo;
import jakarta.mail.MessagingException;

public interface SendMailService {

	void run();

	void queue(String to, String subject, String body);

	void queue(MailInfo mail);

	void send(MailInfo mail) throws MessagingException, IOException;

}
