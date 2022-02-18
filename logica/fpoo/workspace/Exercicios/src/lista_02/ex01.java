package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class ex01 {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite aqui o lado a, b e c do seu triângulo: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		if(a == b && a ==c) {
			System.out.println("Seu triângulo é equilátero.");
		}else if(a != b && a != c) {
			System.out.println("Seu triângulo é escaleno.");
		}else {
			System.out.println("Seu triângulo é isósceles");
		}
			
	}

}


