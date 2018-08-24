package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private Double tauxRemuneration;

	public LivretA(Double solde, Double tauxRemuneration) {
		super(solde, 0.0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
		solde = solde +(solde*tauxRemuneration/100);
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public Double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(Double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
