package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int numFilhos;
		double salario, salFamilia;
		double salFilho = 56.47;
		
		
		System.out.println("Digite aqui quantos filhos menores de 14 anos ou com invalidez/defici�ncia voc� possui e seu sal�rio atual: ");
		numFilhos = entrada.nextInt();
		salario = entrada.nextDouble();
		
		if(salario > 1655.98) {
			System.out.println("Sinto muito, voc� n�o tem direito ao benef�cio.");
		}else {
			salFamilia = numFilhos * salFilho;
		System.out.println("Voc� tem direito a R$ " + salFamilia);
		System.out.println("Seu sal�rio final ser� de R$ " + (salario + salFamilia));
		}
	}

}
