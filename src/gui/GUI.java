package gui;
import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import donnee.Entreprise;
import donnee.Evenement;
import donnee.ListEntreprise;
import donnee.Simulation;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import org.jfree.chart.ChartPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.data.category.DefaultCategoryDataset;



/**
 * GUI est la classe repr�sentant la premi�re fen�tre de notre interface graphique
 * 
 * @author Julien Veysseyre
 * @version 3.0
 */
@SuppressWarnings("serial")

public class GUI extends JFrame {
	private DefaultListModel<String> listModelEntreprise = new DefaultListModel<>();
	private DefaultListModel<String> listModelFav = new DefaultListModel<>();
	private DefaultListModel<String> listModel2 = new DefaultListModel<>();
	private DefaultListModel<String> listModel3 = new DefaultListModel<>();
	
	

	private JButton bAjoutFavori= new JButton("Ajouter Favori");
	private JButton bSuppFavori= new JButton("Supprimer");
	
	static ListEntreprise singleton = ListEntreprise.getInstance();
	

	
	/**
	 * Lancer notre interface.
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		singleton.testEntreprise();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creer notre fen�tre.
	 */
	public GUI() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		setAlwaysOnTop(true);
		setFont(new Font("Corbel", Font.PLAIN, 18));
		setTitle("Simulateur de Bourse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 650);
		getContentPane().setLayout(null);
		
		JButton bAchatVente = new JButton("Acc�der � Achat/Vente");
		bAchatVente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GUI2 a =new GUI2();
				a.setVisible(true);
			}
		});
		
	
		
		bAchatVente.setFont(new Font("Gadugi", Font.PLAIN, 21));
		bAchatVente.setBounds(0, 0, 1284, 31);
		getContentPane().add(bAchatVente);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JList listEntreprise= new JList(listModelEntreprise);
		listEntreprise.setSelectionMode(
		         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		
		
		/**
		 *On ajoute nos entreprises a notre listModelEntreprise
		 */
		
		listModelEntreprise.addElement("Total");
		listModelEntreprise.addElement("Shell");
		listModelEntreprise.addElement("BP");
		listModelEntreprise.addElement("Esso");
		listModelEntreprise.addElement("EDF");
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
		
		
		
		
		listEntreprise.setFont(new Font("Tahoma", Font.PLAIN, 11));
		listEntreprise.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Liste Entreprise", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		listEntreprise.setToolTipText("Liste Entreprise");
		listEntreprise.setBounds(0, 42, 134, 418);
		getContentPane().add(listEntreprise);
		
		
		/**
		 * On cr�e notre bouton qui va lancer notre simulation.
		 */
		JButton bPlay = new JButton("Play");
		
		bPlay.addActionListener(new ActionListener() {
			/**
			 * @param e
			 * Permet de lancer notre action
			 * Nous permettra d'afficher notre graphique
			 */
			public void actionPerformed(ActionEvent e) {				
				
				Random rand = new Random();
				int randomElement = rand.nextInt(6);
				if (randomElement == 0) {
					listModel2.addElement("Evenement de cette semaine : "+ Evenement.evenementAleatoireGaz()+ ", secteur touch� : GAZ - 30%");
					singleton.modifier_capital_secteur(0.7,"gaz");
					singleton.modifier_prix_action_secteur(0.7, "gaz");
			
				}
				else if (randomElement == 1) {
					listModel2.addElement("Evenement de cette semaine : "+ Evenement.evenementAleatoireTransport()+ ", secteur touch� : TRANSPORT - 30%");
					singleton.modifier_capital_secteur(0.7,"transport");
					singleton.modifier_prix_action_secteur(0.7, "transport");
					
				}
				else if(randomElement == 2) {
					listModel2.addElement("Evenement de cette semaine : "+ Evenement.evenementAleatoireAutomobile()+ ", secteur touch� : AUTOMOBILE +30%");
					singleton.modifier_capital_secteur(1.3,"gaz");
					singleton.modifier_prix_action_secteur(1.3, "gaz");
				}
				else if(randomElement == 3) {
					listModel2.addElement("Evenement de cette semaine : "+Evenement.evenementAleatoireAutomobileNegatif()+ ", secteur touch� : AUTOMOBILE - 30%");
					singleton.modifier_capital_secteur(0.7,"automobile");
					singleton.modifier_prix_action_secteur(0.7, "automobile");
				}
				else if(randomElement ==4) {
					listModel2.addElement("Evenement de cette semaine : "+Evenement.evenementAleatoireInformatique()+ ", secteur touch� : INFORMATIQUE +30%");
					singleton.modifier_capital_secteur(1.3,"informatique");
					singleton.modifier_prix_action_secteur(1.3, "informatique");
				}
				else if(randomElement ==5) {
					System.out.println("Evenement de cette semaine : "+ Evenement.evenementAleatoireInformatiqueNegatif()+ ", secteur touch� : INFORMATIQUE - 30%");
					singleton.modifier_capital_secteur(0.7,"informatique");
					singleton.modifier_prix_action_secteur(0.7, "informatique");
				}
				
				Iterator<Entreprise> it = ListEntreprise.entreprises.iterator();
				
				while(it.hasNext()) {
					Entreprise ent = it.next();
					double pourcentage = Simulation.generer_pourcentage(0.80,1.2);
					singleton.modifier_capital_entreprise(pourcentage, ent.getNom());
					singleton.modifier_prix_action_entreprise(pourcentage, ent.getNom());
					
				}
				for (int i=0; i<listModel3.getSize();i++) {
					String entrepriseAfficher = listModel3.elementAt(i);
					listModel2.addElement(entrepriseAfficher);
					@SuppressWarnings("static-access")
					double val_action= singleton.get_valeuraction_entreprise(entrepriseAfficher);
					String nombre = String.valueOf(val_action);
					listModel2.addElement(nombre);
				}
				
			}
			
			});
		bPlay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bPlay.setBounds(133, 369, 523, 18);
		getContentPane().add(bPlay);
		 
		/**
		 * Cr�e un separateur pour une meilleure visibilit�.
		 */
		
		JSeparator sep = new JSeparator();
		sep.setBounds(133, 389, 1151, 10);
		getContentPane().add(sep);
		
		/**
		 * Cr�er une Jlist qui contiendra nos entreprises favorites, on rajoute une meilleure visibilit� avec la JscrollPane.
		 */
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JList listFav = new JList(listModelFav);
		JScrollPane pFav=new JScrollPane(listFav);
		pFav.setBorder(new TitledBorder(null, "Favori", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pFav.setBounds(143, 398, 513, 143);
		getContentPane().add(pFav);
		
		
		
		 bSuppFavori.addActionListener(
		         new ActionListener() {
		            @SuppressWarnings({ })
		            /**
					 * @param e
					 * Permet de lancer notre action
					 * Nous permettra de supprimer de nos favori
					 */
					public void actionPerformed( ActionEvent e )
		            {
		            	
		            	listModelFav.removeElement(listFav.getSelectedValue());
		            }
		         }
		         );
		 
		 
		bAjoutFavori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * @param e
				 * Permet de lancer notre action
				 * Nous permettra de suppprimer de nos favoris.
				 */
				listModelFav.addElement(listFav.getSelectedValue().toString());
				
			}
		});
	
		/**
		 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
		 */
		bSuppFavori.setBounds(199, 541, 165, 70);
		getContentPane().add(bSuppFavori);
		
		/**
		 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
		 */
		bAjoutFavori.setBounds(0, 455, 134, 75);
		getContentPane().add(bAjoutFavori);
		
		/**
		 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
		 */
		
		JButton bchoisir1 = new JButton("Choisir");
		bchoisir1.addActionListener(new ActionListener() {
			
			/**
			 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
			 */
			public void actionPerformed(ActionEvent e) {
			String entrepriseSelect=listEntreprise.getSelectedValue().toString();
			listModel3.addElement(entrepriseSelect);
			JFreeChart lineChart=ChartFactory.createLineChart("Cours de l'action","Semaine numero", "Valeur Action",  createDataset(),PlotOrientation.VERTICAL, true, true, false);
			ChartPanel chartPanel = new ChartPanel(lineChart);
			chartPanel.setBounds(167,44,1093,299);
			//setContentPane(chartPanel);
			chartPanel.setMouseWheelEnabled(true);
			add(chartPanel);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			}
			  private DefaultCategoryDataset createDataset( ) {
			      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
			      dataset.addValue( 45 , "Total" , "1" );
			      dataset.addValue( 50 , "Total" , "2" );
			      dataset.addValue( 60 , "Total" ,  "3" );
			      dataset.addValue( 67 , "Total" , "4" );
			      dataset.addValue( 55 , "Total" , "5" );
			      dataset.addValue( 40 , "Total" , "6" );
			      dataset.addValue( 30 , "Total" , "7" );
			      dataset.addValue( 42 , "Total" , "8" );
			      dataset.addValue( 52 , "Total" , "9" );
			      dataset.addValue( 41 , "Total" , "10" );
			      return dataset;
			   }
			  
			  
			
		});
		
				
		/**
		 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
		 */
		bchoisir1.setBounds(0, 530, 134, 70);
		getContentPane().add(bchoisir1);
		
		
		/**
		 * On ajoute notre bouton a notre Panel, on le redimensionne a l'aide de setBounds.
		 */
		JButton bchoisir2 = new JButton("Choisir");
		bchoisir2.setBounds(364, 541, 177, 70);
		getContentPane().add(bchoisir2);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		/**
		 * On cr�e notre List news avec une JscrollPane pour plus de visibilit�, celle ci nous permettra d'afficher toute les news n�cessaire � l'augmentation ou la baisse des actions d'une entreprise.
		 */
		JList listNews = new JList(listModel2);
		JScrollPane pNews=new JScrollPane(listNews);
		pNews.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "News", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		pNews.setBounds(677, 403, 607, 197);
		getContentPane().add(pNews);
		
		//JPanel graphique = new JPanel();
		//graphique.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		//graphique.setBounds(167, 44, 1093, 299);
		//getContentPane().add(graphique);
		
		
	}
	
		}


