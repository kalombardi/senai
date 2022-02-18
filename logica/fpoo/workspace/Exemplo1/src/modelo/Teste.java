package modelo;

import java.util.Scanner;

public class Teste {

	public static Scanner entrada;
	
	public static void main(String[] args) {
	entrada = new Scanner(System.in);
	int val1, val2, val3, result;
	
	System.out.print("Digite um valor inteiro: ");
	val1 = entrada.nextInt();
	System.out.print("Digite outro valor inteiro: ");
	val2 = entrada.nextInt();
	System.out.print("Digite mais um valor: ");
	val3 = entrada.nextInt();
		
	result = val1 + val2 - val3;
	
	System.out.println("O resultado é "+result);

	}

}
