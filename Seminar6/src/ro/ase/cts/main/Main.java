package ro.ase.cts.main;

import ro.ase.cts.clase.Builder;
import ro.ase.cts.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare = new Builder().setCodRezervare(2).setBauturaRacoritaore(true).build();
		System.out.println(rezervare.toString());
		Rezervare rezervare1 = new Builder().setCodRezervare(3).setMuzicaAmbientala(true).build();
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2 = new Builder(4).setScaunErgonmic(true).build();
		System.out.println(rezervare2.toString());
	}

}