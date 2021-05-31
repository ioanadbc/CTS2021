package ro.ase.cts.main;

import ro.ase.cts.clase.Cont;
import ro.ase.cts.clase.ContCredit;
import ro.ase.cts.clase.ContCurent;
import ro.ase.cts.clase.ContEconomii;
import ro.ase.cts.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1500, "Marina", null);
		Cont contEconomii=new ContEconomii(2500, "Marina", null);
		Cont contCredit=new ContCredit(3200, "Marina", null);
		Cont contIndisponibil=new ContIndisponibil("Marina");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		//contCurent.plateste(500);
		//contCurent.plateste(1600);
		//contCurent.plateste(3000);
		contCurent.plateste(3500);
	
	}

}