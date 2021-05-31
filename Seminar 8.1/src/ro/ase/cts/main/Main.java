package ro.ase.cts.main;

import ro.ase.cts.clase.FabricaRezervari;
import ro.ase.cts.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(1,3,"12.09");
		Rezervare rezervare2 = new Rezervare(3,5,"16.09");
		Rezervare rezervare3 = new Rezervare(4,5,"12.09");
		
		FabricaRezervari factory = new FabricaRezervari();
		factory.getClient("marina@gmail.com").afisareInformatii(rezervare1);
		factory.getClient("marina@gmail.com").afisareInformatii(rezervare2);
		factory.getClient("cosmina@gmail.com").afisareInformatii(rezervare3);
	}

}