package tp2;

import javax.swing.plaf.synth.SynthSeparatorUI;

import tp2.*;

public class motsCroises {

	private Grille<Case> grille;

	public motsCroises(int height, int width) {
		this.grille = new Grille<Case>(height, width);
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				grille.setCellule(i, j, new Case());
			}
		}
	}

	public int getheight() {
		return this.grille.getHeight();
	}

	public int getWidth() {
		return this.grille.getWidth();
	}

	public boolean coordCorrectes(int lig, int col) {
		return this.grille.coordCorrectes(lig, col);
	}

	public boolean estCaseNoire(int lig, int col) {
		assert this.grille.coordCorrectes(lig, col) : "";
		return this.grille.getCellule(lig, col).estNoir();
	}

	public void setCaseNoire(int lig, int col, boolean noire) {
		assert this.grille.coordCorrectes(lig, col) : "";
		this.grille.getCellule(lig, col).setEstNoir(noire);

	}

	public char getSolution(int lig, int col) {
		assert this.grille.coordCorrectes(lig, col) : "";
		assert this.grille.getCellule(lig, col) != null : "";
		return this.grille.getCellule(lig, col).getSolution();
	}

	public void setSolution(int lig, int col, char sol) {
		assert this.grille.coordCorrectes(lig, col) : "";
		assert this.grille.getCellule(lig, col) != null : "";
		this.grille.getCellule(lig, col).setSolution(sol);
		;
	}

	public char getProposition(int lig, int col) {
		assert this.grille.coordCorrectes(lig, col) : "";
		assert this.grille.getCellule(lig, col) != null : "";
		return grille.getCellule(lig, col).getProposition();
	}

	public void setProposition(int lig, int col, char prop) {
		Case ch = new Case();
		this.grille.getCellule(lig, col).setProposition(prop);
	}

	public String getDefinition(int lig, int col, boolean horiz) {
		assert this.grille.coordCorrectes(lig, col) : "";
		assert this.grille.getCellule(lig, col) != null : "";
		if (horiz) {
			return this.grille.getCellule(lig, col).getHorizontal();
		} else {
			return this.grille.getCellule(lig, col).getVertical();
		}
	}

	public void setDefinition(int lig, int col, boolean horiz, String def) {
		if (horiz) {
			this.grille.getCellule(lig, col).setHorizontal(def);
		} else {
			this.grille.getCellule(lig, col).setVertical(def);
		}
	}
	
	public String solution(){
		String res ="";
		for(int i=0;i<grille.getWidth();i++){
			res = res+i+": ";
			for(int j=0;j<grille.getHeight();j++){
				res = res + grille.getCellule(i, j).getSolution()+ " ";
			}
			res = res+ "\n";
		}
		return res;
	}

}
