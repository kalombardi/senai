package avaliacaoSomativa01;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ExplicacaoVetor {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		imprimirVetor();
	}
	
	public static void imprimirVetor() {
		String[] nomes = new String[4];
		nomes[0] = "Karina";
		nomes[1] = "Aline";
		nomes[2] = "Jeni";
		nomes[3] = "Raquel";
		
		String[] sobrenomes = new String[4];
		sobrenomes[0] = "Lombardi";
		sobrenomes[1] = "Fernandes";
		sobrenomes[2] = "Isolina";
		sobrenomes[3] = "Willians";
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < nomes.length; i++) {
			int numero_aleatorio  = aleatorio.nextInt(nomes.length);/*tem o tamanho do vetor nomes*/
			
			System.out.print(nomes[numero_aleatorio] + " ");
			System.out.println(sobrenomes[numero_aleatorio]);
		}
	}
}
