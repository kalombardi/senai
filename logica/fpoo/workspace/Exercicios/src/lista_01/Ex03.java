package lista_01;

import java.util.Scanner;

public class Ex03 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		int n;
		
		System.out.print("Digite um n�mero: ");
		n = entrada.nextInt();
		
		System.out.println(n + " - 1 = " + (n-1));
		System.out.println(n + " + 1 = " + (n+1));

	}

}
