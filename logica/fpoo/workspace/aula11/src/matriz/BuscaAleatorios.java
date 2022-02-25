package matriz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatorios {
	
	static Random rand = new Random();
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		System.out.print("Digite quantos números deseja:");
		int n = entrada.nextInt();
		int dados[] = numerosAleatorios(n);
		
		System.out.print("Digite o número que deseja buscar:");
		int b = entrada.nextInt();
		mostrarDados(dados);
		boolean resultado = buscaSimples(dados,b);
		System.out.println("A busca obteve sucesso? " + resultado);
	}
	
	private static boolean buscaSimples(int[] dados, int b) {
		for(int i = 0; i < dados.length; i++)
			if(dados[i] == b)
				return true;
		return false;
	}
	
	private static void mostrarDados(int[] dados) {
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
	}
	
	private static int[] numerosAleatorios(int n) {
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = rand.nextInt(1000);
		}	
		return x;
	}
}
