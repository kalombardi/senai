package classicos;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Acumula {
	public static Random rand;
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		System.out.println("O algoritmo de acumulação");
		System.out.print("simples, retornou = ");
		System.out.println(simples(5));
		System.out.println("Total = " + aleatorio(5));
		System.out.println("!5 = " + fatorial(5));
	}

	public static int simples(int iteracoes) {
		int x = 0;
		for(int i = 0; i < iteracoes; i++)
			x+=i; // x++ ele só conta quantos numeros tem dento desse "intervalo"
		return x;
	}
	
	public static int aleatorio (int iteracoes) {
		rand = new Random();
		int x = 0;
		int r = 0;
		for(int i = 0; i < iteracoes; i++) {
			r = rand.nextInt(10);
			System.out.println("Aleatorio = " + r);
			x+=r; // um numero aleatorio + o acumulado anterior
			System.out.println("Acumulado = " + x);
		}
		return x;
	}
	
	public static int fatorial (int n) {
		int x = 1;
		for(int i = 1; i <= 5; i++)
			x*=i;
		return x;
		
	}
}