package data;
public class Casillas {
	private int file;
	private int column;
	private boolean mine;
	
	//Constructor
	public Casillas(int file, int column) { //Se puede eliminar y sigue funcionando
		this.file = file;
		this.column = column;
	}
	
	//Getters and setters
	public int getFile() { //Se puede eliminar y sigue funcionando
		return file;
	}
	public void setFile(int file) {
		this.file = file;
	}
	
	public int getColumn() { //Se puede eliminar y sigue funcionando
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public boolean isMine() {
		return mine;
	}
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	
}