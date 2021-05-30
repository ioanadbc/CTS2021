package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.Client;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client(100, "Mihai",19);
		Client client2 = (Client) client.copiaza();
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		
		  Bilet bilet1= new Bilet(0,"Echipa1","Echipa2","25.04.2021"); 
		  Bilet bilet2 = (Bilet) bilet1.copiaza(); 
		  bilet2.setCod(1); 
		  Bilet bilet3=(Bilet) bilet1.copiaza(); 
		  bilet3.setCod(2);
		  
		  System.out.println(bilet2.toString()); 
		  System.out.println(bilet3.toString());
		 
	}

}