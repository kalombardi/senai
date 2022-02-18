package exercicios_lacos;

import java.util.Scanner;
import java.io.IOException;

public class ListaLacos {

	public static void main(String[] args) throws IOException{
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 11) {
			System.out.println("Digite uma opção: ");
			System.out.println("1-Programa1\t5-Programa5\t9-Programa9");
			System.out.println("2-Programa1\t6-Programa6\t10-Programa10");
			System.out.println("3-Programa1\t7-Programa7\t11-Sair");
			System.out.println("4-Programa1\t8-Programa8");
			opcao = leia.nextInt();
			switch (opcao) {
			
			case 1:
				for (int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
				
			case 2:
				for (int i = 200; i > 0; i--) {
					System.out.println(i);
				}break;
				
			case 3:
				System.out.print("Digite um valor inteiro: ");
				int valor = leia.nextInt();
				for (int i = 0; i< valor; i++) {
					System.out.println(i);
				}break;
			
			case 4:
				System.out.println("Digite dois números inteiros: ");
				int v1 = leia.nextInt();
				int v2 = leia.nextInt();
				for (int i = v1; i < v2; i++) {
					System.out.println(i);
				}break;
				
			case 5:
				System.out.println("Digite dois números inteiros: ");
				int n1 = leia.nextInt();
				int n2 = leia.nextInt();
				for (int i = n1; i <= n2; i++){
					if (i % 2 == 0){
						System.out.println(i);
					}
				}break;
			
			case 6:
				int i1 = 0, i2 = 0;
				while(i2<=100) {
					i1 +=i2;
					i2++;
				}System.out.println(i1);
				break;
			
			case 7: 
				System.out.println("Digite dois números inteiros: ");
				int entrada1 = leia.nextInt();
				int entrada2 = leia.nextInt();
				
				int soma = 0;
				for (int i = entrada1; i <= entrada2; i++) {
					soma += i;
				}System.out.println(soma);
				break;
				
			case 8:
				System.out.println("Digite dois números inteiros: ");
				int num1 = leia.nextInt();
				int num2 = leia.nextInt();
				
				int s = 0;
				for (int i = num1; i < num2; i++){
					if (i % 2 == 0){
						s += i;
					}
				}System.out.println(s);
				break;
				
			case 9:
				System.out.println("Digite 15 valores: ");
				int acumulador = 0;
				
				for(int i = 0; i < 15; i++) {
					acumulador += leia.nextInt();
				}System.out.println(acumulador);
				break;
			
			case 10:
				for (int i = 11; i < 250; i++) {
					if(i % 2 == 0) {
					System.out.println(i);
					}
				}
				break;
				
			case 11:
				System.out.println("Até Logo.");
				break;
			
			default:
				System.out.println("Opção Inválida.");
				break;
			}
			
		}

	}

}
