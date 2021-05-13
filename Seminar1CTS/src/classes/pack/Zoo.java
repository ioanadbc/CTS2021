package classes.pack;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals;
	private Zookeper zookeper;
	
	public Zoo(List<Animal> animals, Zookeper zookeper) {
		super();
		this.animals = animals;
		this.zookeper = zookeper;
	}

	
	
	public Zoo() {
		super();
		animals=new ArrayList<Animal>();
		zookeper=new Zookeper("Gigi");
	}



	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeper getZookeper() {
		return zookeper;
	}

	public void setZookeper(Zookeper zookeper) {
		this.zookeper = zookeper;
	}

	

    public void feedAllAnimals() {
		for(Animal a : animals) {
			zookeper.feed(a);
		}
	}
	public void AddAnimal(Animal a) {
		animals.add(a);
	}
}
