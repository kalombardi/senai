package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		float porcentagem, deduzir, descontoIrrf, salario;
		
		System.out.print("Digite seu salário: ");
		salario = entrada.nextFloat();
		
		if(salario <= 1903.98) {
			porcentagem = 0f;
			deduzir = 0f;
		}else if(salario < 2826.66) {
			porcentagem = 7.5f;
			deduzir = 142.8f;
		}else if(salario < 3751.06) {
			porcentagem = 15f;
			deduzir = 354.80f;
		}else if(salario < 4664.68) {
			porcentagem = 22.5f;
			deduzir = 636.13f;
		}else {
			porcentagem = 27.5f;
			deduzir = 869.36f;
		}
		
		descontoIrrf = salario * porcentagem / 100;
		System.out.printf("O desconto de IRRF será de R$ %.2f", descontoIrrf);
		
	}

}
