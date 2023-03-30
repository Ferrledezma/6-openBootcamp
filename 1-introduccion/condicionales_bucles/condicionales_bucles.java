import java.util.Scanner;
public class CodeJava {
	public static void main(String[] args) {
		//condicional else if
		System.out.println("Condicional if");
		int numerolf  = 0;
		if(numerolf < 0) System.out.printf("El numero: %d es NEGATIVO", numerolf);
		else if(numerolf > 0) System.out.printf("El numero: %d es POSITIVO", numerolf);
		else System.out.printf("El numero: %d es igual a 0", numerolf);
		
		//bucle while
		System.out.println("\nBucle while");
		int num = 0;
		while(num < 3) {
			System.out.println(num);
			num++;
		}
		
		//bucle do while
		System.out.println("\nBucle do while");
		do {
			System.out.println(num);
		} while(num < 3);
		
		// bucle for
		System.out.println("\nBucle for");
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		//condicional switch
		System.out.println("\nCondicional switch");
		String estacion = "verando";
		switch(estacion) {
		case "verano":
			System.out.println("\nEstacion: " + estacion);
			break;
		case "otonio":
			System.out.println("\nEstacion: " + estacion);
			break;
		case "invierno":
			System.out.println("\nEstacion: " + estacion);
			break;
		case "primavera":
			System.out.println("\nEstacion: " + estacion);
			break;
		}
	}
}





