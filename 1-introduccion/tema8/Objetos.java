public class Objetos {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNombre("Fernando");
		persona1.setEdad(26);
		persona1.setTelefono(45342342);
		
		System.out.println("Nombre: " + persona1.getNombre() );
		System.out.println("Edad: " + persona1.getEdad());
		System.out.println("Telefono: " + persona1.getTelefono());
	}
}

class Persona {
	private String nombre;
	private int edad;
	private long telefono;
	
	/*Getters and setters*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
