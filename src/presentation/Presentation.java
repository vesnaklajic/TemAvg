package presentation;

import dao.ImplDao;
import metier.ImplMet;

public class Presentation {

	public static void main(String[] args) {
		/*
		 * Injection des dépendance par instanciation statique ("new").
		 * Creation d'objet  d'une manière statique 
		 */
		//instance de la classe Impldao, sinon valeur de dao=NULL par default
		ImplDao dao=new ImplDao();
		//instance de une classe ImplMet
		ImplMet met = new ImplMet();
		//obtenir le lien entre le dao et met
		//ca c'est le princip de injection des dépendance pasque "met" depende de "dao"
		met.setDao(dao);
		System.out.println(met.calcul());
	}
}
