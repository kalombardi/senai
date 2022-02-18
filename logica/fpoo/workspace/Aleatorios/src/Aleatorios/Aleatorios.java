package Aleatorios;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
	
	public static Scanner scan;
	public static void main(String[] args) throws IOException{
		scan = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 4) {
			System.out.print("1 - Números Inteiros\n2 - Números Reais\n3 - Nomes\n4 - Sair\n");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				GerarInteiro();
				break;
			case 2:
				GerarReal();
				break;
			case 3:
				GerarNome();
				break;
			case 4:
				System.out.println("Obrigado :)");
				break;
			default:
				System.out.println("XXXXX  ACORDA MANO, Opção Inválida XXXXX");
				break;
			}
		}
	}


	public static void GerarInteiro() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Digite quantos numeros INTEIROS deseja gerar ");
		int qntd = scan.nextInt();
		
		int[] numeros = new int[qntd];
		
		for(int i = 0; i < qntd; i++) {
			numeros[i] = rand.nextInt(100);
			System.out.println(numeros[i]);
		}
	}
	
	public static void GerarReal() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Digite quantos numeros REAIS deseja gerar ");
		int qntd = scan.nextInt();
		
		double[] numeros = new double[qntd];
		
		for(int i = 0; i < qntd; i++) {
			numeros[i] = rand.nextDouble() * 100;
			System.out.printf("%.2f\n", numeros[i]);
		}
	}

	public static void GerarNome() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos NOMES deseja gerar, até 11 ");
		int qntd = scan.nextInt();
		
		String[] nomes = {"Karina","Leticia","Luiz","Fabio","Douglas","Jeni","Aline","Raquel","Rodrigo","Yuri","Laila"};
		
		for(int i = 0; i < qntd; i++) {
			int aleatorio = rand.nextInt(nomes.length);
			System.out.println(nomes[aleatorio]);
		}
	}
}
