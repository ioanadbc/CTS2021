package ro.ase.cts.clase;

import ro.ase.cts.clase.Categorie;

public class FactoryRaceala implements FactoryCategorie{

	@Override
		public Categorie creareCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Raceala(pretDeBaza);
	}

	



}