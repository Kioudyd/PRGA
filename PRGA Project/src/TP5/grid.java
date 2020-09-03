package Varieras_Kouame_tp1;

public class grid {

	private int height;
	private int width;
	private String[][] grid;

	public grid(int height, int width) throws AssertionError {

		try {
			assert height >= 0 : "";
			assert width >= 0 : "";

			this.height = height;
			this.width = width;
			this.grid = new String[height + 1][width + 1 ];
//			for (int i = 0; i < this.grid.length; i++) {
//				for (int j = 0; j < grid[i].length; j++) {
//					this.grid[i][j] = null;
//				}
//			}
		} catch (AssertionError e) {
			throw new AssertionError();
		}
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public Boolean coordCorrectes(int lig, int col) {
		return lig > 0 && lig <= height && col > 0 && col <= width;
	}

	public String getCellule(int lig, int col) throws AssertionError {
		try {
			assert coordCorrectes(lig, col) : "";
			return this.grid[lig][col];
		} catch (AssertionError e) {
			throw new AssertionError();
		}
	}

	public void setCellule(int lig, int col, String ch) throws AssertionError {
		try {
			assert coordCorrectes(lig, col) : "";
			this.grid[lig][col] = ch;
		} catch (AssertionError e) {
			throw new AssertionError();
		}
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

}
