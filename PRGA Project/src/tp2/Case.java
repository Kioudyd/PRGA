package tp2;

public class Case {

	private char proposition, solution;
	private String horizontal, vertical;
	private boolean estNoir;

	public Case(char proposition, char solution, String horizontal, String vertical, boolean estNoir) {
		super();
		this.proposition = proposition;
		this.solution = solution;
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.estNoir = estNoir;
	}
	
	public Case(){
		
	}

	public char getProposition() {
		return proposition;
	}

	public void setProposition(char proposition) {
		this.proposition = proposition;
	}

	public char getSolution() {
		return solution;
	}

	public void setSolution(char solution) {
		this.solution = solution;
	}

	public String getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(String horizontal) {
		this.horizontal = horizontal;
	}

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public boolean estNoir() {
		return estNoir;
	}

	public void setEstNoir(boolean estNoir) {
		this.estNoir = estNoir;
	}

}
