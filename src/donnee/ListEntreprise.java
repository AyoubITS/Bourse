package donnee;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * 
 * @author Julien
 *
 */
public class ListEntreprise implements InterfaceEntreprise {
	
	 private static final ListEntreprise instance = new ListEntreprise();
	 
	 public ListEntreprise () {
		 System.out.println("Construction du singleton au premier appel");
	 }
	 
	 public static final ListEntreprise getInstance() {
		 return instance;
	 }
	 /**
	  * cr�e deux arrayList : une entreprise et une d'achat d'action.
	  */
	public static ArrayList<Entreprise> entreprises=new ArrayList<Entreprise>();

	private static ArrayList<AchatAction> AchatActionListe = new ArrayList<AchatAction>();
	/**
	 * @param entreprise
	 * m�thode qui ajoute une entreprise
	 */
	public void ajouter(Entreprise entreprise) {
		if(entreprises.contains(entreprise)) {
			System.out.println("Cette entreprise est d�j� ajouter");
		}
		else {
			entreprises.add(entreprise);
		}
	}
	/**
	 * @param nom1
	 * @return une entreprise suivant son nom
	 */
	public Entreprise RechercherNom(String nom1) throws NoSuchElementException{
		Entreprise resultat=null;
		for (Entreprise entreprise : entreprises) {
			if (entreprise.getNom().equals(nom1)) {
				resultat=entreprise;
			}
		}
		if(resultat == null) {
			throw new NoSuchElementException("Entreprise" + nom1 + "n'existe pas.");
		}
		else {
			return resultat;
		}
		
		}
	/**
	 * supprime une entreprise
	 */
	public void remove(Entreprise entreprise) {
		entreprises.remove(entreprise);
	}
	/**
	 * @return nombre d'entreprise
	 */
	public int NombreEntreprise() {
		return entreprises.size();
	}

	/**
	 * @param entreprise
	 * m�thode qui teste si l'entreprise est dans l'arrayList
	 */
	public boolean contains(Entreprise entreprise) {
		return entreprises.contains(entreprise);
	}
	
	/**
	 * @return entreprise
	 */
	public String toString() {
		String result = "";
		for (Entreprise entreprise : entreprises) {
			result += entreprise.toString() + "\n";
		}

		return result;
	}
	
	/**
	 * @return permet de tester plusieurs m�thodes
	 */
	public static void testEntreprise() {
		
		ListEntreprise singleton = ListEntreprise.getInstance();
		testOperations(singleton);
		get_valeuraction_entreprise("Total");
		
		
		
	}

/**
 * Cette m�thode nous permet d'ajouter nos entreprises a notre arrayList
 * @param entreprise
 */
	public static void testOperations(InterfaceEntreprise entreprise) {
		Entreprise e2 = new Entreprise("Total", 394000000,"gaz",45,100);
		Entreprise e3 = new Entreprise("Shell", 230000000,"gaz",11,100);
		Entreprise e4 = new Entreprise("BP",150000000,"gaz",555,100);
		Entreprise e5 = new Entreprise("Esso", 120000000,"gaz",55,100);
		Entreprise e6 = new Entreprise("Edf", 50000000,"gaz",12,100);
		Entreprise e7 = new Entreprise("Apple", 900000000,"informatique",295,100);
		Entreprise e8 = new Entreprise("Logitech", 85000000,"informatique",40,100);
		Entreprise e9 = new Entreprise("Hp inc.", 46000000,"informatique",22,100);
		Entreprise e10 = new Entreprise("Dell", 168000000,"informatique",52,100);
		Entreprise e11 = new Entreprise("Wester Digital Corporation", 179000000,"informatique",62,100);
		Entreprise e12 = new Entreprise("Air France KLM", 139000000,"transport",9,100);
		Entreprise e1 = new Entreprise("American Airlines", 165000000,"transport",30,100);
		Entreprise e13 = new Entreprise	("Delta Airlines", 31000000,"transport",57,100);
		Entreprise e14 = new Entreprise("Lufthansa", 28000000,"transport",14,100);
		Entreprise e15= new Entreprise("Air Canada", 80000000,"transport",31,100);
		Entreprise e16 = new Entreprise("Renault", 90000000,"automobile",34,100);
		Entreprise e17 = new Entreprise("Michelin", 241000000,"automobile",103,100);
		Entreprise e18 = new Entreprise("Ford Motor", 210000000,"automobile",11,100);
		Entreprise e19 = new Entreprise("Valeo", 650000000,"automobile",26,100);
		Entreprise e20 = new Entreprise("Peugeot PSA", 35000000,"automobile",19,100);
		try {
			entreprise.ajouter(e1);
			entreprise.ajouter(e2);
			entreprise.ajouter(e3);
			entreprise.ajouter(e4);
			entreprise.ajouter(e5);
			entreprise.ajouter(e6);
			entreprise.ajouter(e7);
			entreprise.ajouter(e8);
			entreprise.ajouter(e9);
			entreprise.ajouter(e10);
			entreprise.ajouter(e11);
			entreprise.ajouter(e12);
			entreprise.ajouter(e13);
			entreprise.ajouter(e14);
			entreprise.ajouter(e15);
			entreprise.ajouter(e16);
			entreprise.ajouter(e17);
			entreprise.ajouter(e18);
			entreprise.ajouter(e19);
			entreprise.ajouter(e20);
			
			System.out.println(e1.toString());
			System.out.println(e2.toString());
			System.out.println(e3.toString());
			System.out.println(e4.toString());
			System.out.println(e5.toString());
			System.out.println(e6.toString());
			System.out.println(e7.toString());
			System.out.println(e8.toString());
			System.out.println(e9.toString());
			System.out.println(e10.toString());
			System.out.println(e11.toString());
			System.out.println(e12.toString());
			System.out.println(e13.toString());
			System.out.println(e14.toString());
			System.out.println(e15.toString());
			System.out.println(e16.toString());
			System.out.println(e17.toString());
			System.out.println(e18.toString());
			System.out.println(e19.toString());
			System.out.println(e20.toString());
			System.out.println("\n Il y a " + entreprise.NombreEntreprise()+ " entreprises \n");
			
			
		}
		catch (NoSuchElementException e) {
			System.err.println(e.getMessage());
		}

}
	
	/**
	 * @return le capital modifier d'un secteur
	 * @param pourcentage
	 * @param secteur
	 */
	public void modifier_capital_secteur (double pourcentage, String secteur) {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if(ent.getSecteur().contentEquals(secteur)) {
				ent.setCapital(ent.getCapital()*pourcentage);
				System.out.println("Nouveau capital de " + ent.getNom() + " : " +ent.getCapital() );
			}
			
		}
		System.out.println("\n");
	}
	
	/**
	 * @return le prix modifier de l'action suivant un secteur
	 * @param pourcentage
	 * @param secteur
	 */
	public void modifier_prix_action_secteur (double pourcentage, String secteur) {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if(ent.getSecteur().contentEquals(secteur)) {
				ent.setCapital(ent.getValeuraction()*pourcentage);
				System.out.println("Nouveau prix de l'action de " + ent.getNom() + " : " +ent.getValeuraction() );
			}
			
		}
		System.out.println("\n");
	}
	
	/**
	 * @return le capital modifier d'une entreprise
	 * @param pourcentage
	 * @param entreprise
	 */
	public void modifier_capital_entreprise (double pourcentage, String entreprise) {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if (ent.getNom().contentEquals(entreprise)) {
				ent.setCapital(ent.getCapital()*pourcentage);
				System.out.println("Nouveau capital pour " + entreprise +" de " + ent.getCapital() + " euros (*" + pourcentage*100 + "%)" ); 
			}
		}
	}
	
	
	/**
	 * @return le prix modifier de la valeur de l'action apr�s un evenement ou achat d'un utilisateur
	 * @param pourcentage
	 * @param entreprise
	 */
	public void modifier_prix_action_entreprise (double pourcentage, String entreprise) {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if (ent.getNom().contentEquals(entreprise)) {
				ent.setValeuraction(ent.getValeuraction()*pourcentage);
				System.out.println("Nouveau prix d'action pour " + entreprise +" de " + ent.getValeuraction() + " euros (*" + pourcentage*100 + "%)" ); 
			}
		}
	}
	/**
	 * @return le pourcentage modifier de l'entreprise apr�s que l'utilisateur ait acheter des actions. 
	 * @param valeur3
	 * @param nom
	 */
	public void modifier_pourcentage_entreprise (double valeur3, String nom) {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if(ent.getNom().contentEquals(nom)) {
			
				ent.setPourcentagedetenuparen(ent.getPourcentagedetenuparen()-valeur3);
				
			}
		}
	}
	
	/**
	 * @return le nombre d'achat d'action acheter
	 * @param AchatAction
	 */
	public static void ajouterAchat(AchatAction AchatAction) {
			Iterator<AchatAction> it = AchatActionListe.iterator();
			while (it.hasNext()) {
				AchatAction aa = it.next();
				if(aa.getNomEntreprise().contentEquals(AchatAction.getNomEntreprise())) {
					aa.setNbAction(aa.getNbAction() + AchatAction.getNbAction()); 
					return ;
				}
			}
			AchatActionListe.add(AchatAction);
	}
	/**
	 * Methode permettant de vendre des actions pour l'utilisateur
	 */
	public void Vente() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous faire une vente cette semaine? (o/n)");
		String rep = sc.nextLine();
		if (rep.contentEquals("o")) {
			
			System.out.println("\n Voici les entreprises ou vous avez fait des achats d'action");
			Iterator<AchatAction> it = AchatActionListe.iterator();
			while (it.hasNext()) {
				
				AchatAction aa = it.next();
				System.out.println(aa.toString());
			}
			System.out.println("Quelle entreprise choisissez vous?");
			String entr = sc.nextLine();
			Iterator<AchatAction> iter = AchatActionListe.iterator();
			while(iter.hasNext()) {
				
				AchatAction ach = iter.next();
				if(ach.getNomEntreprise().contentEquals(entr))  {
					
					Iterator<Entreprise> ite = entreprises.iterator();
					while(ite.hasNext()) {
						
						Entreprise ent = ite.next();
						System.out.println("Combien d'actions voulez vous vendre?");
						String act = sc.nextLine();
						int i = Integer.parseInt(act.trim());
						if (i <= ach.getNbAction()) {
							
							ach.setNbAction(ach.getNbAction() - i);
							Utilisateur.setSoldeActuel(Utilisateur.getSoldeActuel() + i * ent.getValeuraction());
							System.out.println("Vous avez gagner "+ i + " * "+ ent.getValeuraction() + " = " + i*ent.getValeuraction() + " Nouveau Solde : "+ Utilisateur.getSoldeActuel()); 
							break;
						}
						else {
							System.out.println("Erreur vous n'avez que "+ ach.getNbAction()+" actions");
							break;
						}
					}
				}
			}
			
		}	
		
	}
	/**
	 * Methode permettant d''acheter des actions
	 * @return le nombre d'action achete par l'utilisateur
	 * @param nb_action
	 */
	public void Achat( int nb_action) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous faire une action cette semaine? (o/n)");
		String rep = sc.nextLine();
		if (rep.contentEquals("o")) {
			
			System.out.println("Quelle entreprise choisissez vous?");
			String entr = sc.nextLine();
			Iterator<Entreprise> it = entreprises.iterator();
			while(it.hasNext()) {

				Entreprise ent= it.next();
				if(ent.getNom().contentEquals(entr)) {
					
					if(nb_action*ent.getValeuraction() > Utilisateur.getSoldeActuel()) {
						System.out.println("Solde actuel insuffisant, prix de l'action total :" + nb_action*ent.getValeuraction() + " Solde actuel: " + Utilisateur.getSoldeActuel() );
					}
					else {
						Utilisateur.setSoldeActuel(Utilisateur.getSoldeActuel() - nb_action*ent.getValeuraction());
						AchatAction AchatAction = new AchatAction(entr,nb_action);
						ajouterAchat(AchatAction);
						ent.setCapital(ent.getCapital()-nb_action*ent.getValeuraction());
						System.out.println("Nouvel Achat effectu�: " + nb_action + " action(s) chez " + ent.getNom() + " a " + nb_action*ent.getValeuraction()+ "euros.   "  +"Nouveau Solde:"+ Utilisateur.getSoldeActuel());
					}
				}
			}
			System.out.println("Voulez vous faire d'autres actions cette semaine? o/n");
			String rep2 = sc.nextLine();
			if (rep2.contentEquals("o")) {
				Achat(5);
			}
		}
		else if(rep.contentEquals("n")) {
			System.out.println("Aucune action effectu�e cette semaine.");
		}
		else {
			System.out.println("Erreur, r�ponse attendue : o/n");
		}
	}
	
	/**
	 * teste la classe ListEntreprise
	 * @param args
	 */
	public static void main(String[]args){
		testEntreprise();
		
	
	}
	/**
	 * @return la valeur d'une action d'une entreprise
	 * @param String 
	 */
	public static  double get_valeuraction_entreprise(String entreprise) {
		Iterator<Entreprise> it = entreprises.iterator();
		double v1 = 0;
		while(it.hasNext()) {
			Entreprise ent= it.next();
			if (ent.getNom().contentEquals(entreprise)) {
			v1= ent.getValeuraction();
			
				 
			}
		}
		return v1;
	}
	
	/**
	 * 
	 * @return le nom d'une entreprise
	 */
	public String get_name_entreprise() {
		Iterator<Entreprise> it = entreprises.iterator();
		while(it.hasNext()) {
			Entreprise ent=it.next();
			return ent.getNom();
		}
		return null;
	}
}