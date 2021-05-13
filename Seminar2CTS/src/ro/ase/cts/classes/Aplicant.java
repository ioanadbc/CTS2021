package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afiseazaStatus(Proiect proiect) {
		System.out.println("Aplicantul "+nume+" "+prenume);
		if (punctaj >proiect.getPragAcceptare()) {
			System.out.println(" a fost acceptat.");
		}
		else {
			System.out.println(" nu a fost acceptat.");
		}
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nr_proiecte, String[] vect) {
		this.nrProiecte = nr_proiecte;
		this.denumiriProiecte = vect;

	}
	
	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumiriProiecte=");
		builder.append(Arrays.toString(denumiriProiecte));
		builder.append("]");
		return builder.toString();
	}
	
	


}
