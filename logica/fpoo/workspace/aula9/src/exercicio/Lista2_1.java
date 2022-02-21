package exercicio;

import java.io.IOException;
import java.util.Scanner;

public class Lista2_1 {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		mostra();
	}

	public static void mostra() {
		entrada = new Scanner(System.in);
		
		int[] indice = new int[5];
		indice[0] = 2;
		indice[1] = 4;
		indice[2] = 5;
		indice[3] = 6;
		indice[4] = 8;
		System.out.println("Indice\tValor"); /*fora do for senão repete*/
		
		for(int i = 0; i < indice.length; i++) { /*.length para percorrer todo o tamanho do vetor*/
			System.out.println(i + "\t" + indice[i]); /*i chama a "posição do indice e indice[i] chama o valor atribuido a ele"*/
			}
	}
}