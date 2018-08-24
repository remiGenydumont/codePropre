package ex3;

import java.util.List;

public class Aquarium extends Zone {
	
	private static final Double MASSE_NOURRITURE = 0.2;

	@Override
	public Double getPoids() {
		return Aquarium.MASSE_NOURRITURE;
	}
	@Override
	public void addAnimal(String nomAnimal, String comportement) {
		listAnimaux.add(new Reptile(nomAnimal, comportement));
		
	}
}
