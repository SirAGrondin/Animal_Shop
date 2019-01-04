package fr.agrondin.projet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.agrondin.methodes.AfficherBaseDonne;
import fr.agrondin.methodes.GestionStock;

public class Project {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/the_animal_shop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
	private static final String DATABASE_LOGIN = "root"; // Intitulé de l'utilisateur connecté au serveur : 'root' par défaut
	private static final String DATABASE_SECRET = "Oldot@ku974"; // MDP du serveur mySQL
	
	public static void main(String[] args) {
		AfficherBaseDonne.afficherStock();
		GestionStock.ajouterAnimal();
		
//		GestionStock.supprimerAnimal();
//		System.out.println("===========");
//		utiliserSelect();

		
//		GestionStock gestion = new GestionStock();


	}
}


