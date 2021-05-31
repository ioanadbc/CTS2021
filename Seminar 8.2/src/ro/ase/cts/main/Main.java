package ro.ase.cts.main;

import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.ProxyRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		IRezervare rezervarePentruDouaPersoane = new Rezervare(3, 2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();

	}

}