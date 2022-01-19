package donnee;
/**
 * @author Julien
 *La classe AchatAction nous permet d'acheter des actions.
 */

public class AchatAction {
	private String nomEntreprise;
	private int nbAction;
	
	/**
	 * 
	 * @param nomEntreprise
	 * @param nbAction
	 */
	public AchatAction(String nomEntreprise, int nbAction) {
		this.nomEntreprise= nomEntreprise;
		this.nbAction= nbAction;
	}
	
	/**
	 * 
	 * @return le nom de l'entreprise
	 */
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	
	/**
	 * m�thode qui change le nom de l'entreprise
	 * @param nomEntreprise
	 */
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	/**
	 * 
	 * @return le nombre d'action poss�d�
	 */
	public int getNbAction() {
		return nbAction;
	}
	
	/**
	 * m�thode qui change le nombre d'action poss�d�
	 * @param nbAction
	 */
	public void setNbAction(int nbAction) {
		this.nbAction = nbAction ;
	}

	@Override
	/**
	 * Retourne l'entreprise et le nombre d'action poss�d�.
	 */
	public String toString() {
		return getNbAction() + "Action(s) sur l'entreprise :" + getNomEntreprise();
	}
}
