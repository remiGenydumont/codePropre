package ex3;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final Double MASSE_NOURRITURE = 0.1;

	@Override
	public Double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	public void addAnimal(String nomAnimal, String comportement) {
		listAnimaux.add(new Reptile(nomAnimal, comportement));
		
	}
}
