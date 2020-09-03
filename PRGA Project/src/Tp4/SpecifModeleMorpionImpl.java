package Tp4;

public class SpecifModeleMorpionImpl implements SpecifModeleMorpions{
	
	private Etat etat;
	private int count = 0;
	
	@Override
	public Etat getEtatJeu() {
		return etat;
	}

	@Override
	public int getJoueur() {
		if(etat == Etat.J1_JOUE) return 1;
		else if(etat == Etat.J2_JOUE) return 2;
		else return 0;
	}

	@Override
	public int getVainqueur() {
		if(etat == Etat.J1_VAINQUEUR) return 1;
		else if(etat == Etat.J2_VAINQUEUR) return 2;
		else return 0;
	}

	@Override
	public int getNombreCoups() {
		return count;
	}

	@Override
	public boolean estFinie() {
		if(etat == Etat.J1_VAINQUEUR || etat == Etat.J2_VAINQUEUR || etat == Etat.MATCH_NUL ) return true;
		else return false;
	}

	@Override
	public boolean estCoupAutorise(int ligne, int colonne) {
		if(ligne <= TAILLE && colonne <= TAILLE)return true;
		else return false;
	}
	
	
	
	@Override
	public void jouerCoup(int ligne, int colonne) {
		assert !estFinie() : "La partie est finie";
		assert estCoupAutorise(ligne, colonne) : "Les coordonnés ne sont pas correctes";
		if(getJoueur() == 1) etat = Etat.J2_JOUE;
		if(getJoueur()==2) etat = Etat.J1_JOUE;
	}
	

}
