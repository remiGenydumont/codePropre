package ex3;

import java.util.List;

public abstract class Zone {

	protected List<Animal> listAnimaux;
	
	public abstract void addAnimal(String nomAnimal, String comportement);
	
	public void afficherListeAnimaux(){
		for (Animal animal: listAnimaux){
			System.out.println(animal);
		}
	}
	public int compterAnimaux(){
		return listAnimaux.size();
	}
	
	public abstract Double getPoids();
	
	public Double calculerKgsNourritureParJour(){
		return listAnimaux.size() * getPoids();
	}
}
