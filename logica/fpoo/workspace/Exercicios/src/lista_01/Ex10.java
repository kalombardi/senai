package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int k = 10, m2;
		double custoUni = 130.00;
		double metros = 3.7;
		
		System.out.print("Digite quantos m� deseja revestir: ");
		m2 = entrada.nextInt();
		
		int pacotes = (int) Math.ceil(m2 / metros);
		double custo = pacotes * custoUni;
		
		System.out.printf("Voc� precisar� de %d pacotes.\n", pacotes);
		System.out.printf("O que custar� R$ %.2f.", custo);
		
		
	}

}
