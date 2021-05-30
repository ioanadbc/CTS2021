package ro.ase.cts.clase;

import ro.ase.cts.clase.Categorie;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Durere(pretDeBaza);
	}

	

}