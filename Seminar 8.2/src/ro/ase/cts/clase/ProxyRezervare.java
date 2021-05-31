package ro.ase.cts.clase;

public class ProxyRezervare implements IRezervare{
	
	private static final int NR_MIN_PERSOANE = 4;
	private Rezervare rezervare;

	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}

	@Override
	public void anuntaRezervare() {
		if(rezervare.getNrPersoane()>=NR_MIN_PERSOANE) {
			rezervare.anuntaRezervare();
		}else {
			System.out.println("Persoanele se pot prezenta fizic la restaurant.");
		}
	}
}