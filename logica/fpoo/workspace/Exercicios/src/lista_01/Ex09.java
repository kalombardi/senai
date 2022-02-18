package lista_01;

import java.util.Scanner;

public class Ex09 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.println("Digite dois valores inteiros: ");
		v1 = entrada.nextInt();
		v2 = entrada.nextInt();
		
		System.out.print("A soma de " + v1 + " e " + v2 + " é = " + (v1+v2));

	}

}
