package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected Double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private Double decouvert;

	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(Double solde, Double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(Double montant){
		this.solde += montant;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(Double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}

	/** Getter for solde
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public Double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}
}
