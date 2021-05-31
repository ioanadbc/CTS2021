package ro.ase.cts.clase;

public class Cash implements ModPlata {

	
	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("Se plateste suma cash suma de "+sumaPlatita+" RON");
	}
	
}