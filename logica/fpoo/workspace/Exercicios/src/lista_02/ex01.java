package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class ex01 {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite aqui o lado a, b e c do seu tri�ngulo: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		if(a == b && a ==c) {
			System.out.println("Seu tri�ngulo � equil�tero.");
		}else if(a != b && a != c) {
			System.out.println("Seu tri�ngulo � escaleno.");
		}else {
			System.out.println("Seu tri�ngulo � is�sceles");
		}
			
	}

}


