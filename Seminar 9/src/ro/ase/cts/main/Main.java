package ro.ase.cts.main;

import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.StareLibera;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(12);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		//masa.setStareMasa(new StareLibera());
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		masa.elibereazaMasa();
		
	}

}