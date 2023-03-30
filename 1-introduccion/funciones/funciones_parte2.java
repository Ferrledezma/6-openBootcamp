public class CodeJava {
	public static void main(String[] args) {
		Coche auto = new Coche();
		auto.incrementarPuertas();
		System.out.println("Puertas: " + auto.cantPuertas);
	}
}

class Coche {
	public int cantPuertas = 0;
	public void incrementarPuertas() {
		this.cantPuertas++;
	}
}