package ex3;

public class SavaneAfricaine extends Zone {

	@Override
	public Double getPoids(){
		return 0.0;
	}
	@Override
	public void addAnimal(String nomAnimal, String comportement) {
		listAnimaux.add(new Reptile(nomAnimal, comportement));
		
	}

}
