package tp2;

import tp2.IterateurMots;

public class Grille<E> {
	private int height, width;
	private E[][] grid;

	@SuppressWarnings("unchecked")
	public Grille(int height, int width) throws AssertionError {

		assert height > 0 : "";
		assert width > 0 : "";
		this.height = height;
		this.width = width;
		this.grid = (E[][]) new Object[height + 1][width + 1];
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public boolean coordCorrectes(int lig, int col) {
		return lig > 0 && lig <= height && col > 0 && col <= width;
	}

	public E getCellule(int lig, int col) throws AssertionError {
		assert coordCorrectes(lig, col) : "";
		return this.grid[lig][col];
	}

	public void setCellule(int lig, int col, E ch) {
		assert coordCorrectes(lig, col) : "";
		this.grid[lig][col] = ch;

	}

	public String toString() {
		String res = "";
		for (int i = 0; i < this.grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				res += i + "," + j + "|";
			}
			res += "\n";
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	public IterateurMots iterateurMots(boolean horizontal, int num) {
		E[] tab;
		if (horizontal) {
			tab = grid[num];
		}

		else {
			tab = (E[]) new Object[getHeight()];
			for (int i = 0; i < this.getHeight(); i++) {
				tab[i] = grid[i][num - 1];
			}

		}
		return new IterateurMots(tab);

	}

}