package Varieras_Kouame_tp1;

import Varieras_Kouame_tp1.*;

public class motsCroises {
	
	private grid solution;
	private grid proposition;
	private grid horizontal;
	private grid vertical;
	
	public motsCroises(int height, int width){
		this.solution = new grid(height, width);
		this.proposition = new grid(height, width);
		this.horizontal = new grid(height, width);
		this.vertical = new grid(height, width);
	}
	
	public int getheight(){
		return this.solution.getHeight();
	}
	
	public int getWidth(){
		return this.solution.getWidth();
	}
	
	public boolean coordCorrectes(int lig, int col){
		return this.solution.coordCorrectes(lig, col);
	}
	
	public boolean estCaseNoire(int lig, int col){
		assert this.solution.coordCorrectes(lig,col) : "";
		return this.solution.getCellule(lig, col) == null;
	}
	
	public void setCaseNoire(int lig, int col, boolean noire){
		assert this.solution.coordCorrectes(lig,col) : "";
		if(noire){
			this.solution.setCellule(lig, col, null);
		}
		else {
			this.solution.setCellule(lig, col, "");
		}
	}
	
	public char getSolution(int lig, int col){
		assert this.solution.coordCorrectes(lig, col) : "";
		assert this.solution.getCellule(lig, col)!= null : "";
		return this.solution.getCellule(lig, col).charAt(0);
	}
	
	public void setSolution(int lig, int col, char sol){
		assert this.solution.coordCorrectes(lig, col) : "";
		assert this.solution.getCellule(lig, col)!= null : "";
		this.solution.setCellule(lig, col,String.valueOf(sol)) ;
	}
	
	public char getProposition(int lig, int col){
		assert this.proposition.coordCorrectes(lig, col) : "";
		assert this.proposition.getCellule(lig, col)!= null : "";
		return proposition.getCellule(lig, col).charAt(0);
	}
	
	public void setProposition(int lig, int col, char prop){
		this.proposition.setCellule(lig, col, String.valueOf(prop));
	}
	
	public String getDefinition(int lig, int col, boolean horiz){
		assert this.proposition.coordCorrectes(lig, col) : "";
		assert this.proposition.getCellule(lig, col)!= null : "";
		if(horiz){
			return this.horizontal.getCellule(lig, col);
		}
		else {
			return this.vertical.getCellule(lig, col);
		}
	}
	
	public void setDefinition(int lig, int col, boolean horiz, String def){
		if(horiz){
			this.horizontal.setCellule(lig, col, def);
		}
		else {
			this.vertical.setCellule(lig, col, def);
		}
	}
	
	
}

