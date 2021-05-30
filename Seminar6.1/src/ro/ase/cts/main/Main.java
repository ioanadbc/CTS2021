package ro.ase.cts.main;

import ro.ase.cts.clase.Builder;
import ro.ase.cts.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Builder builder = new Builder();
		builder.setBauturaRacoritaore(true);
		builder.setMancareInclusa(true);
		
		Rezervare rez1 = builder.setCodRezervare(20).build();
		Rezervare rez2 = builder.setCodRezervare(21).build();
		System.out.println(rez1.toString());
		System.out.println(rez2.toString());
	}
}