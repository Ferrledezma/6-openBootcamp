

public class Tema9 {
	public static void main(String[] args) {
		//cliente
		Cliente cliente = new Cliente();
		cliente.setEdad(20);
		cliente.setNombre("Daniel");
		cliente.setTelefono((long)341232132);
		cliente.setCredito((double)20000.45);
		System.out.println("Cliente");
		System.out.printf("Edad: %d \nNombre: %s \nTelefono: %d \nCredito: %.2f", cliente.getEdad(), cliente.getNombre(), cliente.getTelefono(), cliente.getCredito());
		
		//trabajador
		Trabajador trabajador = new Trabajador();
		trabajador.setEdad(24);
		trabajador.setNombre("Maria");
		trabajador.setTelefono((long)12321132);
		trabajador.setSalario(1000.93);
		System.out.println("\nTrabajador");
		System.out.printf("\nEdad: %d \nNombre: %s \nTelefono: %d \nCredito: %.2f", trabajador.getEdad(), trabajador.getNombre(), trabajador.getTelefono(), trabajador.getSalario());
		
	}
}

class Persona1 {
	private int edad;
	private String nombre;
	private long telefono;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
}

class Cliente extends Persona1 {
	private double credito;
	public double getCredito() {
		return this.credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona1 {
	private double Salario;

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
