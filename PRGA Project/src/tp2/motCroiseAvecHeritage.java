package tp2;

public class motCroiseAvecHeritage extends Grille<Case>{
	
	@SuppressWarnings("unchecked")
	public motCroiseAvecHeritage(int height, int width){
		super(height,width);
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				super.setCellule(i, j, new Case());
			}
		}
	}
	
	public int getheight() {
		return super.getHeight();
	}

	public int getWidth() {
		return super.getWidth();
	}

	public boolean coordCorrectes(int lig, int col) {
		return super.coordCorrectes(lig, col);
	}

	public boolean estCaseNoire(int lig, int col) {
		assert super.coordCorrectes(lig, col) : "";
		return super.getCellule(lig, col).estNoir();
	}

	public void setCaseNoire(int lig, int col, boolean noire) {
		assert super.coordCorrectes(lig, col) : "";
		super.getCellule(lig, col).setEstNoir(noire);

	}

	public char getSolution(int lig, int col) {
		assert super.coordCorrectes(lig, col) : "";
		assert super.getCellule(lig, col) != null : "";
		return super.getCellule(lig, col).getSolution();
	}

	public void setSolution(int lig, int col, char sol) {
		assert super.coordCorrectes(lig, col) : "";
		assert super.getCellule(lig, col) != null : "";
		super.getCellule(lig, col).setSolution(sol);
		;
	}

	public char getProposition(int lig, int col) {
		assert super.coordCorrectes(lig, col) : "";
		assert super.getCellule(lig, col) != null : "";
		return super.getCellule(lig, col).getProposition();
	}

	public void setProposition(int lig, int col, char prop) {
		super.getCellule(lig, col).setProposition(prop);
	}

	public String getDefinition(int lig, int col, boolean horiz) {
		assert super.coordCorrectes(lig, col) : "";
		assert super.getCellule(lig, col) != null : "";
		if (horiz) {
			return super.getCellule(lig, col).getHorizontal();
		} else {
			return super.getCellule(lig, col).getVertical();
		}
	}

	public void setDefinition(int lig, int col, boolean horiz, String def) {
		if (horiz) {
			super.getCellule(lig, col).setHorizontal(def);
		} else {
			super.getCellule(lig, col).setVertical(def);
		}
	}

}
