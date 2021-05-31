package ro.ase.cts.clase;

public class Card implements ICard{
	private String detinatorCard;

	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}
	
	public String getDetinatorCard() {
		return detinatorCard;
	}
	
	@Override
	public void platesteOnline() {
		System.out.println(detinatorCard+" a platit online.");
	}

	@Override
	public void platesteFizic() {
		System.out.println(detinatorCard+" a platit fizic.");
	}
}