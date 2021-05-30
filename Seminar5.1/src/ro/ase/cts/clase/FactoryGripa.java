package ro.ase.cts.clase;

import ro.ase.cts.clase.Categorie;

public class FactoryGripa implements FactoryCategorie {

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		return new Gripa(pretDeBaza);
	}

	

}