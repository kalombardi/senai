package exercicios;

import java.util.Scanner;

public class ExInss {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		double salario, desconto;
		int porcentagem;
		
		System.out.print("Digite seu sal�rio: ");
		salario = entrada.nextDouble();
		
		if(salario>2000) {
			desconto = salario * 11 / 100;
			porcentagem = 11;
		}else if(salario<1200) {
			desconto = salario * 8 / 100;
			porcentagem = 8;
		}else {
			desconto = salario * 9 / 100;
			porcentagem = 9;
		} 
		
		System.out.printf("A al�quota para seu sal�rio � %d%%\n", porcentagem);
		System.out.printf("O desconto do INSS ser� de R$%.2f \n", desconto);
		System.out.printf("O sal�rio final ser� de R$%.2f \n", (salario - desconto));	

	}

}
