package data;

public class TableroMinas {
	Casillas[][] casillas;
	int fileNum;
	int columnNum;
	int numMines;
	
	public TableroMinas(int fileNum, int columnNum, int numMines) {
		this.fileNum = fileNum;
		this.columnNum = columnNum;
		this.numMines = numMines;
		inicializarCasillas();
	}
	public void inicializarCasillas() {
		casillas = new Casillas[this.fileNum][this.columnNum];
		for(short i = 0; i < casillas.length; i++) {
			for(short j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casillas(i, j);
			}
		}
		generatedMines();
	}
	public void generatedMines() {
		int minasGeneradas = 0;
		while(minasGeneradas != numMines){
			int tempFile = (int)(Math.random() * casillas.length);
			int tempColum = (int)(Math.random() * casillas[0].length);
			if(!casillas[tempFile][tempColum].isMine()) { //
				casillas[tempFile][tempColum].setMine(true);
				minasGeneradas++;
			}
		}
	}
	public void printTablero() {
		for(int i = 0; i < casillas.length; i++) {
			System.out.println();
			for(int j = 0; j < casillas[i].length; j++) {
				System.out.print(casillas[i][j].isMine() ? "*" : "O");
				System.out.print("\t");
			}
		}
		System.out.println();
	}
}










