package ro.ase.cts.main;

import ro.ase.cts.clase.ClinicaVeterinara;

public class Program {

	public static void main(String[] args) {
		ClinicaVeterinara clinica1= ClinicaVeterinara.getInstance();
		ClinicaVeterinara clinica2=ClinicaVeterinara.getInstance();
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
