package ro.ase.cts.main;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Cash;
import ro.ase.cts.clase.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Dorobantu");
		client.setModPlata(new Cash());
		client.plateste(150);
		
		client.setModPlata(new Card(500));
		client.plateste(350);
		client.plateste(200);
	}

}