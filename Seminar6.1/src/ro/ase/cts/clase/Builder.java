package ro.ase.cts.clase;

public class Builder implements IBuilder{
	private boolean mancareInclusa;
	private boolean scaunErgonmic;
	private boolean bauturaRacoritaore;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public Builder() {
		super();
		this.mancareInclusa = false;
		this.scaunErgonmic = false;
		this.bauturaRacoritaore = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = 0;
	}
	public Builder(int codRezervare) {
		super();
		this.mancareInclusa = false;
		this.scaunErgonmic = false;
		this.bauturaRacoritaore = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = codRezervare;
	}

	
	public Builder setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public Builder setScaunErgonmic(boolean scaunErgonmic) {
		this.scaunErgonmic = scaunErgonmic;
		return this;
	}

	public Builder setBauturaRacoritaore(boolean bauturaRacoritaore) {
		this.bauturaRacoritaore = bauturaRacoritaore;
		return this;
	}

	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public Builder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}


	public Builder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(mancareInclusa, scaunErgonmic, bauturaRacoritaore,
				 muzicaAmbientala, genMuzica, codRezervare);
		return rezervare;
	}
	
}
