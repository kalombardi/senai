package exercicios;

import java.util.Scanner;

public class Exidade {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int i;
		
		System.out.print("Digite aqui sua idade: ");
		i = entrada.nextInt();
		
		if (i>=18) {
			System.out.print("Voc� j� � maior de idade, falou independente!!!");
		}else {
			System.out.print("Voc� � menor de idade, nada de carro ainda...");
		}
		
		
	}

}
