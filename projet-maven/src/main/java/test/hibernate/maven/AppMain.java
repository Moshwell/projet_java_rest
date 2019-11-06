package test.hibernate.maven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMain {
	static User userObj;
	static Session sessionObj;
	static SessionFactory sessionFectoryObj;
	
	private static SessionFactory buildSessionFactory() {

/****** Création d'un fichier de configuration pour le Mapping d'Hibernate ******/
		
		Configuration confiObj = new Configuration();
		confiObj.configure("hibernate.cfg.xml");
		return sessionFectoryObj;
		

	}
}
