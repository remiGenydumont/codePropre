package ex3;

public abstract class Animal  {
	private String noms;
	private String comportements;
	
	public Animal(String noms, String comportements) {
		super();
		this.noms = noms;
		this.comportements = comportements;
	}
	
	@Override
	public String toString() {
		return "Animal [noms=" + noms + ", comportements=" + comportements + "]";
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public String getComportements() {
		return comportements;
	}
	public void setComportements(String comportements) {
		this.comportements = comportements;
	}
	
}
