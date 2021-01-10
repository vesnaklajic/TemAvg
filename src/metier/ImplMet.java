package metier;

import dao.Idao;

public class ImplMet implements Imet{
private Idao dao;
	@Override
	public double calcul() {
		double temp=dao.getTemperature();
		double res=temp/24;
	return res;
	}
	public Idao getDao() {
		return dao;
	}
	public void setDao(Idao dao) {
		this.dao = dao;
	}

}
