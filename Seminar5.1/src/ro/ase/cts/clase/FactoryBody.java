package ro.ase.cts.clase;

import ro.ase.cts.clase.Categorie;

public class FactoryBody implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		return new Body(pretDeBaza);
	}



}
