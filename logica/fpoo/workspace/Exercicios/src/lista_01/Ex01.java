package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);
		
		int a, b, c, resultado;
		
		System.out.print("Digite um número para A: ");
		a = entrada.nextInt();
		System.out.print("Digite outro número para B: ");
		b = entrada.nextInt();
		System.out.print("Digite mais um número para C: ");
		c = entrada.nextInt();
		
		resultado = (a+b)/c;
		
		System.out.println("O resultado é = "+ resultado);

	}

}
