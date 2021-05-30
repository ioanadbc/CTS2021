package ro.ase.cts.main;
import ro.ase.cts.clasa.AdapterCreditClasa;
import ro.ase.cts.clasa.AdapterCreditObiecte;
import ro.ase.cts.clasa.InterfataCredit;
import ro.ase.cts.clasa.Leasing;

public class Main {

	public static void oferaInformatiiCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

public static void main(String[] args) {
	 // Auto-generated method stub
	Leasing leasing1=new Leasing();
	AdapterCreditObiecte adapterObiecte = new AdapterCreditObiecte(leasing1);
	//oferaInformatiiCredit(leasing1, "Ionel", 546.40f);
			oferaInformatiiCredit(adapterObiecte, "Ionel", 546.40f);	
			
			AdapterCreditClasa adapterClasa = new AdapterCreditClasa();
			oferaInformatiiCredit(adapterClasa, "Gigel", 324.50f);
}
}