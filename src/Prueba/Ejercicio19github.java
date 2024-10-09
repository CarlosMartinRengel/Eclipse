package Prueba;

import java.util.Scanner;

public class Ejercicio19github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String codigoPais, pais;
		
		System.out.println("Introduce el código de un país");
		codigoPais = teclado.next();
		
		pais = switch (codigoPais) {
		case "ESP" -> "España";
		case "POR" -> "Portugal";
		case "FR" -> "Francia";
		case "IT" -> "Italia";
		case "NOR" -> "Noruega";
		case "AL" -> "Alemania";
		case "ING" -> "Inglaterra";
		case "FIN" -> "Finlandia";
		case "POL" -> "Polonia";
		case "CA" -> "Cánada";
		default -> "Introduce un país válido";
		};
		
		System.out.println(pais);
		teclado.close();
	}

}