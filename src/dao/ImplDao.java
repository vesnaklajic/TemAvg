package dao;

public class ImplDao implements Idao {

	@Override
	public double getTemperature() {
		/*
		 * Se connecter à la BD pour récupérer la température
		 */
		double data = 56;
		return data;
	}

}
