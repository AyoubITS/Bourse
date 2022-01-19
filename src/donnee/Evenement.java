package donnee;
import java.util.Arrays; 
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Julien
 *Evenement est la classe qui modifiera la valeur du prix des actions en fonction d'�v�nement.
 *Dans notre interface elle s'affichera sous forme de news.
 */
public class Evenement {
	/**
	 * Cr�er des Evenements avec modification de la valeur d'action.
	 * Cr�er le singleton.
	 */
	private String evenement ;
	ListEntreprise singleton = ListEntreprise.getInstance();
	public String getEvenement() {
		/**
		 * retourne l'evenement.
		 */
		return evenement;
	}

	public void setEvenement(String evenement) {
		/**
		 * Modifie l'evenement.
		 */
		this.evenement = evenement;
	}
	
	/**
	 * Modifie le prix de l'action pour le secteur Gaz avec l'aide d'un evenement.
	 */
	public static String evenementAleatoireGaz() {
	Random rand = new Random();
	List <String> liste = Arrays.asList("evenement g�opolitique","crise petroli�re","pic pollution");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * Modifie le prix de l'action pour le secteur Transport avec l'aide d'un evenement.
	 */
	public static String evenementAleatoireTransport() {
	Random rand = new Random();
	List <String> liste = Arrays.asList("coronavirus","catastrophe naturelle","guerre");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * Modifie le prix de l'action pour le secteur Automobile avec l'aide d'un evenement.
	 */
	public static String evenementAleatoireAutomobile() {	
	Random rand = new Random();
	List <String> liste = Arrays.asList("sortie nouveau v�hicule","salon de l'automobile");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * Modifie le prix de l'action n�gativement pour le secteur Automobile avec l'aide d'un evenement.
	 */
	public static String evenementAleatoireAutomobileNegatif() {	
	Random rand = new Random();
	List <String> liste = Arrays.asList("d�faut moteur","Augmentation pollution mondiale");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * Modifie le prix de l'action pour le secteur Informatique avec l'aide d'un evenement.
	 */
	public static String evenementAleatoireInformatique() {
	Random rand = new Random();
	List <String> liste = Arrays.asList("salon jeu vid�o","salon presentation t�l�phone");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * Modifie le prix de l'action n�gativement pour le secteur Informatique avec l'aide d'un evenement.
	 */
	
	public static String evenementAleatoireInformatiqueNegatif() {
	Random rand = new Random();
	List <String> liste = Arrays.asList("attaque informatique mondiale","D�faut processeur");
	String randomElement = liste.get(rand.nextInt(liste.size()));
	return randomElement;
	}
	
	/**
	 * M�thode qui va g�nerer al�atoirement un evenement ou plusieurs pour tel ou tel secteurs.
	 */
	
	public static void EvenementSecteurAleatoire() {
		ListEntreprise singleton = ListEntreprise.getInstance();
		Random rand = new Random();
		int randomElement = rand.nextInt(6);
		if (randomElement == 0) {
			System.out.println("Evenement de cette semaine : "+ evenementAleatoireGaz()+ ", secteur touch� : GAZ - 30%");
			singleton.modifier_capital_secteur(0.7,"gaz");
	
		}
		else if (randomElement == 1) {
			System.out.println("Evenement de cette semaine : "+ evenementAleatoireTransport()+ ", secteur touch� : TRANSPORT - 30%");
			singleton.modifier_capital_secteur(0.7,"transport");
			
		}
		else if(randomElement == 2) {
			System.out.println("Evenement de cette semaine : "+ evenementAleatoireAutomobile()+ ", secteur touch� : AUTOMOBILE +30%");
			singleton.modifier_capital_secteur(1.3,"gaz");
		}
		else if(randomElement == 3) {
			System.out.println("Evenement de cette semaine : "+ evenementAleatoireAutomobileNegatif()+ ", secteur touch� : AUTOMOBILE - 30%");
			singleton.modifier_capital_secteur(0.7,"automobile");
		}
		else if(randomElement ==4) {
			System.out.println("Evenement de cette semaine : "+evenementAleatoireInformatique()+ ", secteur touch� : INFORMATIQUE +30%");
			singleton.modifier_capital_secteur(1.3,"informatique");
		}
		else if(randomElement ==5) {
			System.out.println("Evenement de cette semaine : "+ evenementAleatoireInformatiqueNegatif()+ ", secteur touch� : INFORMATIQUE - 30%");
			singleton.modifier_capital_secteur(0.7,"informatique");
		}
	}
	
	/**
	 * M�thode qui modifie les �v�nements semaine par semaine.
	 */
	public static void semaine() {
		for (int i =1; i < 6; i++) {
			ListEntreprise singleton = ListEntreprise.getInstance();
			System.out.println("Semaine" + i + "\n");
			EvenementSecteurAleatoire();
			Simulation.simul_entreprise();
			singleton.Achat(5);
			singleton.Vente();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Teste la classe evenement.
	 */
	public static void main(String[]args){
		ListEntreprise.testEntreprise();
		semaine();
		
	}
}