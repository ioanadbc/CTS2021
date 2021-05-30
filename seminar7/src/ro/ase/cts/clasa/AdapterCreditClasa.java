package ro.ase.cts.clasa;

public class AdapterCreditClasa extends Leasing implements InterfataCredit{

	public AdapterCreditClasa() {
		super();
	}
	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
	}

}