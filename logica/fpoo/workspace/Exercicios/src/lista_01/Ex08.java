package lista_01;

import java.util.Scanner;

public class Ex08 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		int v1, v2, r;
		
		System.out.print("Digite dois números para fazer a divisão: ");
		v1 = entrada.nextInt();
		v2 = entrada.nextInt();
		
		r = v1 % v2;
		
		System.out.println("O resto da divisão entre " + v1 + " e " + v2 + " é: " + r);
		
		

	}

}
