package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);
		
		int a, b, c, resultado;
		
		System.out.print("Digite um n�mero para A: ");
		a = entrada.nextInt();
		System.out.print("Digite outro n�mero para B: ");
		b = entrada.nextInt();
		System.out.print("Digite mais um n�mero para C: ");
		c = entrada.nextInt();
		
		resultado = (a+b)/c;
		
		System.out.println("O resultado � = "+ resultado);

	}

}
