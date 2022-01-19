package donnee;

public class Personne {
	private String nom;
	private double soldeActuel=2000;
	private int pourcentagedetenuparlapersonne;
	
	
	public Personne(String nom,double soldeActuel) {
		this.nom=nom;
		this.soldeActuel=soldeActuel;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSoldeActuelle() {
		return soldeActuel;
	}
	public void setSoldeActuelle(double soldeActuel) {
		this.soldeActuel = soldeActuel;
	}

	public int getPourcentagedetenuparlapersonne() {
		return pourcentagedetenuparlapersonne;
	}

	public void setPourcentagedetenuparlapersonne(int pourcentagedetenuparlapersonne) {
		this.pourcentagedetenuparlapersonne = pourcentagedetenuparlapersonne;
	}

}


