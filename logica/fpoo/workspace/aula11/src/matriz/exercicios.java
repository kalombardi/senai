package matriz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class exercicios {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		System.out.println("Aqui você verá 27 números aletórios de 0 à 100 utilizando [27]:\n");
		ex01();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Aqui você verá 27 números aletórios de 0 à 100 utilizando [3][9]:");
		ex02();
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		System.out.print("Aqui você verá 27 números aletórios de 0 à 100 utilizando [3][3][3]:");
		ex03();
		System.out.println();
		System.out.println("---------------FIM DO PROGRAMA, OBRIGADA E VOLTE SEMPRE!!!---------------");
	}
	
	public static void ex01() {
		entrada = new Scanner(System.in);
		Random rand = new Random();
				
		int[] n = new int[27];
		
		for(int i = 0; i < 27; i++) {
			n[i] = rand.nextInt(100);
			System.out.print(n[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void ex02() {
		entrada = new Scanner(System.in);
		Random rand = new Random();
				
		int n[][] = new int[3][9];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 9; j++)
				n[i][j] = rand.nextInt(100);
		
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 9; j++)
				System.out.print(n[i][j] + " ");
		}
		System.out.println();
	}
	
	public static void ex03() {
		entrada = new Scanner(System.in);
		Random rand = new Random();
				
		int n[][][] = new int[3][3][3];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				for(int k = 0; k < 3; k++)
				n[i][j][k] = rand.nextInt(100);
		
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 3; j++) {
				System.out.println();
			for(int k = 0; k < 3; k++)
				System.out.print(n[i][j][k] + " ");
			}
		}
	}
}