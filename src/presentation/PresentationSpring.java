package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Imet;

public class PresentationSpring {

	public static void main(String[] args) {
		/*
		 * Demande à Spring de lire config.xml. De config.xml il va faire dao, il va
		 * faire matier et apres il va faire l'injection des dépendaances avec
		 * <property> - implements le method set
		 */
		ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

		Imet metier=(Imet) springContext.getBean("metier");
		System.out.println(metier.calcul());
	}
}
