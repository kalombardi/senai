package modelo;

import java.io.IOException;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		
		int comprimento = 3;
		
		String[] nomes = new String[comprimento];
		int[] idades = new int[comprimento];
		
		for(int i = 0; i < comprimento; i++) {
			System.out.print("Nome[" + i + "]: ");
			nomes[i] = scan.next();
			
			System.out.print("Idade[" + i + "]: ");
			idades[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < comprimento; i++) {
			if(idades[i] < 10) {
				System.out.println(nomes[i] + " acabou de chegar.");
			}else if(idades[i] <= 20) {
				System.out.println(nomes[i] + " quase lá.");
			}else {
				System.out.println(nomes[i] + " já tá passadinho hein...");
			}
		}

	}

}
