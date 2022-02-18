package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int numFilhos;
		double salario, salFamilia;
		double salFilho = 56.47;
		
		
		System.out.println("Digite aqui quantos filhos menores de 14 anos ou com invalidez/deficiência você possui e seu salário atual: ");
		numFilhos = entrada.nextInt();
		salario = entrada.nextDouble();
		
		if(salario > 1655.98) {
			System.out.println("Sinto muito, você não tem direito ao benefício.");
		}else {
			salFamilia = numFilhos * salFilho;
		System.out.println("Você tem direito a R$ " + salFamilia);
		System.out.println("Seu salário final será de R$ " + (salario + salFamilia));
		}
	}

}
