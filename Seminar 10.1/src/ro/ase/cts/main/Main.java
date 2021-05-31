package ro.ase.cts.main;

import ro.ase.cts.clase.ComandaConstruire;
import ro.ase.cts.clase.ComandaDepunere;
import ro.ase.cts.clase.ComandaRetragere;
import ro.ase.cts.clase.ContBancar;
import ro.ase.cts.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi = new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstruire(new ContBancar("Marina"), 500));
		managerComenzi.invoca(new ComandaRetragere(new ContBancar("Andreea"), 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaDepunere(new ContBancar("Cosmina"), 100));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}