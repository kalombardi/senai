package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class fgts {

	public static void main(String[] args) throws IOException{
		Scanner leia = new Scanner(System.in);
		int comprimento = 3;
		
		String[] nomes = new String[comprimento];
		double[] salario = new double[comprimento];
		
		for(int i = 0; i < comprimento; i++) {
			System.out.print("Nome[" + i + "]: ");
			nomes[i] = leia.next();
			
			System.out.print("Salário[" + i + "]: ");
			salario[i] = leia.nextDouble();
		}
		
			for(int i = 0; i < comprimento; i++) {
			System.out.println("Nome: " + nomes[i]);
			System.out.println("Salário: R$ " + salario[i]);
			System.out.printf("Depósito FGTS: %.2f\n", salario[i] * 0.08);
			}

	}

}