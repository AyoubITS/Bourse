package gui;


import java.awt.Color; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import donnee.ListEntreprise;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;



@SuppressWarnings("serial")
/**
 * 
 * @author Julien
 * GUI2 est la classe nous permettant d'acheter et vendre des actions
 *
 */
public class GUI2 extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField txtAchat;
	private JTextField txtVente;
	static ListEntreprise singleton = ListEntreprise.getInstance();
	private DefaultListModel<String> listModelEntreprise = new DefaultListModel<>();
	private DefaultListModel<String> listModelVente = new DefaultListModel<>();
	@SuppressWarnings("unused")
	private DefaultListModel<String> listModel2 = new DefaultListModel<>();
	private DefaultListModel<String> listModel2000 = new DefaultListModel<>();
	private DefaultListModel<String> listModel_vente_entreprise = new DefaultListModel<>();
	private DefaultListModel<String> listModel_vente_nbaction = new DefaultListModel<>();
	private JButton b1 = new JButton("Choisir ");
	private JButton bValiderAchat = new JButton("Valider Achat");
	double portefeuille=2000;
	private JTextField txtActionPossd;
	

	/**
	 * Lancer l'application.
	 */
	@SuppressWarnings("static-access")
	
	public static void main(String[] args) {
		
		singleton.testEntreprise();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creer la fenetre.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GUI2() {
		setFont(new Font("Corbel", Font.PLAIN, 22));
		setTitle("Simulateur de Bourse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 650);
		contentPane = new JPanel();
		contentPane.setToolTipText("Valider choix");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * On cr�er un bouton pour revenir � l'interface pr�c�dente
		 */
		JButton b1ereinterface = new JButton("Revenir � l'interface pr�c�dente");
		 b1ereinterface.addActionListener(new ActionListener() {
			 /**
			  * @param e 
			  * ce param�tre permet de lancer l'action pour revenir a l'interface pr�c�dente
			  */
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI a =new GUI();
				a.setVisible(true);
			}
		});
		 b1ereinterface.setFont(new Font("Gadugi", Font.PLAIN, 21));
		 b1ereinterface.setBounds(0, 0, 1284, 31);
		getContentPane().add( b1ereinterface);
		contentPane.add( b1ereinterface);
		
		/**
		 * On cr�er notre ListModel ou l'on remplis les entreprises.
		 */
		JList listEntreprise = new JList(listModelEntreprise);
		listModelEntreprise.addElement("Total");
		listModelEntreprise.addElement("Shell");
		listModelEntreprise.addElement("BP");
		listModelEntreprise.addElement("Esso");
		listModelEntreprise.addElement("Edf");
		listModelEntreprise.addElement("Apple");
		listModelEntreprise.addElement("Logitech");
		listModelEntreprise.addElement("Hp inc.");
		listModelEntreprise.addElement("Dell");
		listModelEntreprise.addElement("Wester Digital Corporation");
		listModelEntreprise.addElement("Air France KLM");
		listModelEntreprise.addElement("American Airlines");
		listModelEntreprise.addElement("Delta Airlines");
		listModelEntreprise.addElement("Lufthansa");
		listModelEntreprise.addElement("Air Canada");
		listModelEntreprise.addElement("Renault");
		listModelEntreprise.addElement("Michelin");
		listModelEntreprise.addElement("Ford Motor");
		listModelEntreprise.addElement("Valeo");
		listModelEntreprise.addElement("Peugeot PSA");
		
		/**
		 * On cr�er notre ListModelVente avec le nombre d'actions que l'on peut vendre
		 */
		listModelVente.addElement("1");
		listModelVente.addElement("2");
		listModelVente.addElement("3");
		listModelVente.addElement("4");
		listModelVente.addElement("5");
		listModelVente.addElement("6");
		listModelVente.addElement("7");
		listModelVente.addElement("8");
		listModelVente.addElement("9");
		listModelVente.addElement("10");
		
		/**
		 * On annonce a l'utilisateur qu'il commence avec 2000 euros.
		 */
		listModel2000.addElement("Vous commencez avec 2000 euros");
		
		listEntreprise.setFont(new Font("Tahoma", Font.PLAIN, 11));
		listEntreprise.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Liste Entreprise", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		listEntreprise.setToolTipText("Liste Entreprise");
		listEntreprise.setBounds(0, 42, 134, 509);
		listEntreprise.add(b1);
		getContentPane().add(listEntreprise);
		
		/**
		 * On cr�er notre bouton pour choisir notre entreprise a afficher
		 */
		JButton b1 = new JButton("Choisir ");
		b1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		b1.setBounds(0, 552, 134, 59);
		getContentPane().add(b1);
		
		/**
		 * On cr�er un JTextField pour pr�senter la partie Achat
		 */
		txtAchat = new JTextField();
		txtAchat.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		txtAchat.setHorizontalAlignment(SwingConstants.CENTER);
		txtAchat.setText("Achat");
		txtAchat.setBounds(1006, 30, 278, 27);
		contentPane.add(txtAchat);
		txtAchat.setColumns(10);
		
		/**
		 * On cr�er une Jlist pour afficher le choix des entreprises pour acheter , on rajoute une JScrollPane pour une meilleure visibilit�.
		 */
		JList list_choix_entreprise_achat = new JList(listModelEntreprise);
		JScrollPane p1=new JScrollPane(list_choix_entreprise_achat);
		p1.setBorder(new TitledBorder(null, "Choix entreprise", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p1.setBounds(1006, 57, 142, 231);
		contentPane.add(p1);
		
		/**
		 * On cr�er une Jlist pour d�cider du nombre d'action que l'on achetera.
		 */
		JList list_achat_action = new JList(listModelVente);
		list_achat_action.setBorder(new TitledBorder(null, "NbAction", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list_achat_action.setBounds(1150, 57, 133, 231);
		contentPane.add(list_achat_action);
		
		
		/**
		 * On cr�er une JTextField pour pr�senter la partie Vente.
		 */
		txtVente = new JTextField();
		txtVente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtVente.setHorizontalAlignment(SwingConstants.CENTER);
		txtVente.setToolTipText("");
		txtVente.setText("Vente");
		txtVente.setBounds(1006, 320, 278, 31);
		contentPane.add(txtVente);
		txtVente.setColumns(10);
		
		/**
		 * On cr�er notre Jlist pour la vente de nos entreprise avec une JscollPane pour plus de visibilit�
		 */
		JList list_vente_entreprise = new JList(listModel_vente_entreprise);
		JScrollPane p3=new JScrollPane( list_vente_entreprise);
		p3.setBorder(new TitledBorder(null, "Choix entreprise", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p3.setBounds(1006, 352, 142, 231);
		contentPane.add(p3);
		
		/**
		 * On cr�er notre Jlist pour la vente du nb action
		 */
		JList list_vente_action = new JList(listModelVente);
		list_vente_action.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "NbAction", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		list_vente_action.setBounds(1150, 352, 134, 231);
		contentPane.add(list_vente_action);
		
		
		bValiderAchat.setBounds(1006, 286, 278, 31);
		contentPane.add(bValiderAchat);
		
		bValiderAchat.addActionListener(new ActionListener() {
			/**
			 * @param e 
			 * permet de lancer notre action pour valider l'achat
			 */
			
			public void actionPerformed(ActionEvent e) {
				
				String entreprise;
				String nb_action;
				entreprise = list_choix_entreprise_achat.getSelectedValue().toString();
				nb_action= list_achat_action.getSelectedValue().toString();
				double valeur3 = Double.parseDouble(nb_action);
				@SuppressWarnings("static-access")
				double val_action= singleton.get_valeuraction_entreprise(entreprise);
				double prix_finale= valeur3*val_action;
				singleton.modifier_pourcentage_entreprise (valeur3, entreprise);
				
				
				if(prix_finale <= getPortefeuille()) {
					setPortefeuille(getPortefeuille()- prix_finale);
					@SuppressWarnings("unused")
					String result=String.valueOf(val_action);
					
					listModel2000.addElement("Entreprise :  " +list_choix_entreprise_achat.getSelectedValue().toString()+ ", vous avez : " + list_achat_action.getSelectedValue().toString()+ " action(s), il vous reste " + getPortefeuille()+ "euros");
					
					listModel_vente_nbaction.addElement(nb_action);
					listModel_vente_entreprise.addElement(entreprise);
				}
				else {
					String expression1="Vous n'avez pas assez d'argent malheuresement";
					listModel2000.addElement(expression1);
				}
				
			}
		});
		
		
		JButton bValider_vente = new JButton("Valider vente");
		bValider_vente.addActionListener(new ActionListener() {
			/**
			 * @param e
			 * permet de lanncer la vente de nos actions
			 */
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				 String entreprise;
	                String nb_action;


	                double nbaction_final=0;
	                entreprise =  list_vente_entreprise.getSelectedValue().toString();

	                for (int i1=0; i1<listModel_vente_entreprise.getSize();i1++) {
	                if(entreprise ==listModel_vente_entreprise.elementAt(i1)) {
	                String nb_action1=listModel_vente_nbaction.elementAt(i1);
	                double valeur_nb_action1=Double.parseDouble(nb_action1);
	                nb_action=list_vente_action.getSelectedValue().toString();
	                double valeur3 = Double.parseDouble(nb_action);

	                double val_action= singleton.get_valeuraction_entreprise(entreprise);
	                double prix_finale= valeur3*val_action;
	                setPortefeuille(getPortefeuille()+prix_finale);
	                listModel2000.addElement("Entreprise :  " + list_vente_entreprise.getSelectedValue().toString()+ ", vous vendez : " +list_vente_action.getSelectedValue().toString()+ " action(s), il vous reste " + getPortefeuille()+ "euros");
	for (int i=0; i<listModel_vente_entreprise.getSize();i++) {

	                    if(entreprise == listModel_vente_entreprise.elementAt(i)) {
	                        nbaction_final= valeur_nb_action1-valeur3;
	                        String result_nb_action = String.valueOf(nbaction_final);
	                        listModel_vente_nbaction.remove(i);
	                        listModel_vente_nbaction.add(i, result_nb_action);
	                        double valeur4 = Double.parseDouble(result_nb_action);
	                    if(valeur4 == 0) {

	                        listModel_vente_nbaction.remove(i);
	                        listModel_vente_entreprise.remove(i);
	                    }

	                    }
	                }



	                    }
	                }
	            }
	        });
	        bValider_vente.setBounds(1006, 580, 278, 31);
	        contentPane.add(bValider_vente);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Graphique (A venir)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(136, 30, 869, 293);
		contentPane.add(panel);
		
		/**
		 * Cr�er notre bouton qui va lancer la simulation
		 */
		JButton bPlay = new JButton("Play");
		bPlay.setBounds(136, 320, 412, 31);
		contentPane.add(bPlay);
		
		/**
		 * Cr�er notre bouton pause.
		 */
		JButton bPause = new JButton("Pause");
		bPause.setBounds(547, 320, 458, 31);
		contentPane.add(bPause);
		
		/**
		 * Cr�er notre JList ou on affichera l'historique de nos achats avec unne JScrollPane pour une meilleure visibilit�.
		 */
		JList list_historique_achat = new JList(listModel2000);
		JScrollPane p6=new JScrollPane(list_historique_achat);
		p6.setBorder(new TitledBorder(null, "Historique Achat/Vente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p6.setBounds(557, 372, 448, 239);
		contentPane.add(p6);
		
		
		/**
		 * Cr�er un separateur pour une meilleure visibilit�.
		 */
		JSeparator separator = new JSeparator();
		separator.setBounds(538, 352, 20, 259);
		contentPane.add(separator);
		
		
		/**
		 * Cr�er un JTextField pour pr�senter la partie action poss�d� par l'utilisateur
		 */
		txtActionPossd = new JTextField();
		txtActionPossd.setHorizontalAlignment(SwingConstants.CENTER);
		txtActionPossd.setText("Action poss�d� par l'utilisateur");
		txtActionPossd.setBounds(136, 381, 427, 31);
		contentPane.add(txtActionPossd);
		txtActionPossd.setColumns(10);
		
		/**
		 * On cr�er deux JList avec deux JScrollPane ,une  avec le nom des entreprises ou l'on aura acheter, et l'autre avec le nombre d'actions poss�d�s.
		 */
		JList list_6 = new JList(listModel_vente_entreprise);
		JScrollPane p7=new JScrollPane(list_6);
		p7.setBorder(new TitledBorder(null, "Entreprise", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p7.setBounds(144, 411, 207, 200);
		contentPane.add(p7);
		
		JList list_8 = new JList(listModel_vente_nbaction);
		JScrollPane p8=new JScrollPane(list_8);
		p8.setBorder(new TitledBorder(null, "NbAction", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p8.setBounds(350, 411, 207, 200);
		contentPane.add(p8);
		
		
	}
	
	/**
	 * 
	 * @return valeur portefeuille
	 */
	public double getPortefeuille() {
		return portefeuille;
	}
	
	 /**
	  * Change la valeur du portefeuille
	  * @param portefeuille
	  */
	public void setPortefeuille(double portefeuille) {
		this.portefeuille = portefeuille;
	}
}