package ex3;

public class ZoneCarnivore extends Zone {

	private static final Double MASSE_NOURRITURE = 10.0;

	@Override
	public Double getPoids() {
		return ZoneCarnivore.MASSE_NOURRITURE;
	}
	@Override
	public void addAnimal(String nomAnimal, String comportement) {
		listAnimaux.add(new Reptile(nomAnimal, comportement));
		
	}
}
