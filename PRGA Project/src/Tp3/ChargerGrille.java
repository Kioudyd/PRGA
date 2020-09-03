package Tp3;

import java.sql.*;

import java.util.*;

import Varieras_Kouame_tp1.motsCroises;
import tp2.IterateurMots;

public class ChargerGrille {

	private Map<Integer, String> grille;
	private Connection connexion;

	public ChargerGrille() {
		try {
			grille = new HashMap<>();
			connexion = connecterBD();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection connecterBD() throws SQLException {
		Connection connect;
		connect = DriverManager.getConnection("jdbc:mysql://mysql.istic.univ-rennes1.fr:3306/base_bousse",
				"user_akouame", "akouame");
		return connect;
	}

	// Retourne la liste des grilles disponibles dans la B.D.
	// Chaque grille est décrite par la concaténation des valeurs
	// respectives des colonnes nom_grille, hauteur et largeur.
	// L’élément de liste ainsi obtenu est indexé par le numéro de
	// la grille (colonne num_grille).
	// Ainsi "Français débutants (7x6)" devrait être associé à la clé 10
	public Map<Integer, String> grillesDisponibles() throws SQLException {
		String req = "SELECT num_grille, nom_grille, hauteur, largeur FROM TP5_GRILLE";
		PreparedStatement statement = connexion.prepareStatement(req);
		ResultSet result = statement.executeQuery();
		String format = "";
		while (result.next()) {
			int number = result.getInt("num_grille");
			String name = result.getString("nom_grille");
			int largeur = result.getInt("largeur");
			int hauteur = result.getInt("hauteur");
			format = name + " " + largeur + " " + hauteur;
			grille.put(number, format);
		}
		return grille;
	}

	public motsCroises extraireGrille(int numGrille) throws SQLException {
		String req = "SELECT hauteur, largeur FROM TP5_GRILLE WHERE num_grille = ?";
		PreparedStatement statement = connexion.prepareStatement(req);
		statement.setInt(1, numGrille);
		ResultSet result = statement.executeQuery();
		String format = "";
		while (result.next()) {
			int hauteur = result.getInt("hauteur");
			int largeur = result.getInt("largeur");
			format = hauteur + " " + largeur;
		}
		
		String[] parts = format.split(" ");
		String height = parts[0];
		String width = parts[1];
		int hauteur = Integer.parseInt(height);
		int largeur = Integer.parseInt(width);
		motsCroises grid = new motsCroises(hauteur, largeur);
		return grid;
	}
}
