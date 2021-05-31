package ro.ase.cts.main;

public class Main {
	ICard card1= new Card("Marina");
	card1.platesteFizic();
	card1.platesteOnline();
	
	DecoratorContactLess decorator = new ConcretDecorator(card1);
	decorator.platesteContactLess();
}
