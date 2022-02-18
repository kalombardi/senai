package modelo;

import java.util.Scanner;

public class Media {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int nota1, nota2, result;

		//entrada
		System.out.print("Digite sua primeira nota: ");
		nota1 = entrada.nextInt();
		System.out.print("Digite sua segunda nota: ");
		nota2 = entrada.nextInt();
		
		//processamento
		result = (nota1 + nota2) / 2;
		
		if(result>=8) {
			System.out.println("Parabéns, pode comemorar :)");
		}else {
			System.out.println("Não foi dessa vez, tente denovo ano que vem!!!");
		}

	}

}
