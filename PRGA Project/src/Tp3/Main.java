package Tp3;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		ChargerGrille chargerGrille = new ChargerGrille();
		try {
			System.out.println(chargerGrille.extraireGrille(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
