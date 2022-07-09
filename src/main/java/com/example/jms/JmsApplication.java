package com.example.jms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) throws Exception {

		/* Estas lineas solo se necesitan si se requiere que
		Spring boot levante un servidor activemq en el arranque

		ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
				.setPersistenceEnabled(false)
				.setJournalDirectory("target/data/journal")
				.setSecurityEnabled(false)
				.addAcceptorConfiguration("invm", "vm://0"));

		server.start();*/

		SpringApplication.run(JmsApplication.class, args);
	}

}
