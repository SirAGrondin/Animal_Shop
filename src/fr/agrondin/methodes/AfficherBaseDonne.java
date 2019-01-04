package fr.agrondin.methodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AfficherBaseDonne {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/the_animal_shop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
	private static final String DATABASE_LOGIN = "root"; // Intitulé de l'utilisateur connecté au serveur : 'root' par défaut
	private static final String DATABASE_SECRET = "Oldot@ku974"; // MDP du serveur mySQL
	/*
	 * ==== Methode Objet =====
	 */
	public static final void afficherStock() {
		try {
			Connection	connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "SELECT * FROM Animal";
			
			Statement executeur = connexion.createStatement();
			ResultSet resultat = executeur.executeQuery(requete);
			
			while (resultat.next()) {
				System.out.println(resultat.getString("Id")
						+ " || " + resultat.getString("Species")
						+ " || " + resultat.getString("Name")
						+ " || " + resultat.getString("Gender")
						+ " || " + resultat.getString("Sale")
						+ " || " + resultat.getString("Price")
						+ " || " + resultat.getString("Country"));
						
				System.out.println();
//				System.out.println("-------------------------------------------------------------");
//				System.out.println();
			}
			resultat.close();
			executeur.close();
			connexion.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	
	
	public static void trier() {
		
	}
	
	/*
	 * ==== Methode classes ===
	 */
	public static void trierId() {
		
	}
	public static void trierName() {
		
	}
	public static void trierSp() {
		
	}
	public static void trierSale() {
		
	}
	public static void trierAge() {
		
	}
	public static void trierGender() {
		
	}
	public static void trierPrice() {
		
	}
	public static void trierCountry() {
		
	}
}

