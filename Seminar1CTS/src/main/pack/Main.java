package main.pack;

import classes.pack.*;

public class Main {
	
	public static void main(String[] args) {
		
		Zookeper keper=new Zookeper("Dani");
		Zoo zoo=new Zoo();
		zoo.setZookeper(keper);
		
		Giraffe giraffe=new Giraffe("Girafa",10);
		Giraffe secondGiraffe= new Giraffe("GirafaDoi",15,200);
		
		zoo.AddAnimal(giraffe);
		zoo.AddAnimal(secondGiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra z1=new Zebra("Zebra1",7);
		Zebra z2=new Zebra("Zebra z2", 9, 150);
		
		zoo.AddAnimal(z1);
		zoo.AddAnimal(z2);
		
		zoo.feedAllAnimals();

	}

}
