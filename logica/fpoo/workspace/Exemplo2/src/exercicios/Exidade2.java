package exercicios;

import java.util.Scanner;

public class Exidade2 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int anoNascimento, anoAtual, idade;
		
		System.out.print("Digite que ano tu nasceu: ");
		anoNascimento = entrada.nextInt();
		
		System.out.print("Ah, mas tamb�m me fala, que ano estamos mesmo? ");
		anoAtual = entrada.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		if(idade>=18) {
			System.out.print("Opa, tu j� � de maior hein, falou independente");
		}else {
			System.out.print("Ixi, tu ainda � de menor...nada de carro pra tu...");
		}
		

	}

}
