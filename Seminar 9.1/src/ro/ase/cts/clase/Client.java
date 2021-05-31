package ro.ase.cts.clase;

public class Client {
	private String numeClient;
	private ModPlata modPlata;
	
	public Client(String numeClient, ModPlata modPlata) {
		super();
		this.numeClient = numeClient;
		this.modPlata = modPlata;
	}

	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata = new Cash();
	}
	
	public void plateste(double suma) {
		System.out.println(numeClient+" trebuie sa realizeze o plata");
		modPlata.plateste(suma);
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	
}