package ro.ase.cts.clase;

public class ComandaDepunere extends Command{

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());
	}

}