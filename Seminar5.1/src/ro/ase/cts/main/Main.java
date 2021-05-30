package ro.ase.cts.main;

import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.FactoryBody;
import ro.ase.cts.clase.FactoryCategorie;

public class Main {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryBody();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie=factoryCategorie.creareCategorie(14);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 10);
	}

}