package fr.agrondin.methodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GestionStock {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/the_animal_shop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
	private static final String DATABASE_LOGIN = "root"; // Intitulé de l'utilisateur connecté au serveur : 'root' par défaut
	private static final String DATABASE_SECRET = "Oldot@ku974"; // MDP du serveur mySQL
	
	/*
	 * ==== Methode Objet ====
	 */

	public static final void ajouterAnimal() {
		
		Scanner clavier  = new Scanner (System.in);
		String utilisateur;
		int utilisateurInt;
		boolean isRunning = true;

		try {
			Connection	connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO Animal ( Species, Name, Gender, Age, Sale, Price, Country) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement preparateur = connexion.prepareStatement(requete);
			
			while (isRunning == true ) {
				System.out.println("Voulez-vous ajouter un animal ? ");
				utilisateur = clavier.nextLine();
				clavier.reset();
				
				if (utilisateur.equalsIgnoreCase("oui") || utilisateur.charAt(0) == 'O'
						|| utilisateur.charAt(0) == 'o') {
					
			// ======= Espece =======
			System.out.println("Indiquez l'espèce de l'animal : ");
			utilisateur = clavier.nextLine();
			preparateur.setString(1, utilisateur);
			clavier.reset();
			//=========== Nom ========
			System.out.println("Indiquez le nom de l'animal : ");
			utilisateur = clavier.nextLine();
			preparateur.setString(2, utilisateur);
			clavier.reset();
			// ======= Gender ======
			System.out.println("Indiquez le genre de l'animal : ");
			utilisateur = clavier.nextLine();
			preparateur.setString(3, utilisateur);
			clavier.reset();
			// ====== Age =======
			System.out.println("Indiquez l'âge de l'animal : ");

			utilisateurInt = clavier.nextInt();
			preparateur.setInt(4, utilisateurInt);
			clavier.reset();
			// ====== Sale ====== 
			preparateur.setString(5, "available");
			// ====== Price =====
			System.out.println("Indiquez le prix de l'animal (99 999 max) : ");
			utilisateurInt = clavier.nextInt();
			preparateur.setInt(6, utilisateurInt);
			clavier.reset();
			// ===== Country ======
			System.out.println("Indiquez le pays de l'animal : ");
			clavier.nextLine();
			utilisateur = clavier.nextLine();
			preparateur.setString(7, utilisateur);
			clavier.reset();
			System.out.println("Votre animal a été ajouté correctement.");
			preparateur.execute();
			AfficherBaseDonne.afficherStock();
				}else if (utilisateur.equalsIgnoreCase("non") || utilisateur.charAt(0) == 'N'
						|| utilisateur.charAt(0) == 'n') {
					System.out.println("Retour au menu principal.");
					isRunning = false;
				}
			}
			preparateur.close();
			connexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public static final void supprimerAnimal() {
		Scanner clavierString = new Scanner(System.in);
		Scanner clavierInt = new Scanner (System.in);
		String utilisateur;
		int modification;
		boolean isRunning = true;

		try {
			Connection connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "DELETE FROM Animal WHERE Id = ?";
			PreparedStatement preparateur = connexion.prepareStatement(requete);

			while (isRunning == true) {
				System.out.println("Voulez-vous supprimer un animal ? OUI/NON ");
				utilisateur = clavierString.nextLine();
				clavierString.reset();
				if (utilisateur.equalsIgnoreCase("oui") || utilisateur.charAt(0) == 'O'
						|| utilisateur.charAt(0) == 'o') {
					System.out.println("Indiquez l'ID de l'animal que vous voulez supprimer.");
					modification = clavierInt.nextInt();
					clavierInt.reset();
					preparateur.setInt(1, modification);
					preparateur.execute();
					System.out.println();
					System.out.println("Votre animal a bien été supprimé.");
					AfficherBaseDonne.afficherStock();

				} else if (utilisateur.equalsIgnoreCase("non") || utilisateur.charAt(0) == 'N'
						|| utilisateur.charAt(0) == 'n') {
					System.out.println("Retour au menu principal.");
					isRunning = false;
				}
			}

			preparateur.close();
			connexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected static final void modifierAnimal() {
		try {
			Connection connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "UPDATE Animal SET ? WHERE ? = ? ";
			PreparedStatement preparateur = connexion.prepareStatement(requete);

			preparateur.execute();

			preparateur.close();
			connexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	/*
	* ===== Methode Classe ====
	*/
		

	public static void modifierName() {
		
	}	
	public static void modifierSp() {
		
	}	
	public static void modifierSale() {
		
	}
	public static void modifierAge() {
		
	}
	public static void modifierGender() {
		
	}
	public static void modifierPrice() {
		
	}
	public static void modifierCountry() {
		
	}

}
