package exercicios;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class sobrenome {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.println("Digite quantos NOMES deseja gerar, até 09 ");
		int qntd = entrada.nextInt();
		
		String[] nomes = {"Karina","Fabio","Douglas","Jeni","Aline","Raquel","Rodrigo","Yuri","Laila"};
		String[] sobrenomes = {"Lombardi","Basso","Fernandes","Isolina","Loira","Sadan","Zeus","Moreira","Teimosa"};
		
		for(int i = 0; i < qntd; i++) {
			int aleatorioNomes = rand.nextInt(nomes.length);
			int aleatorioSobrenomes = rand.nextInt(sobrenomes.length);
			System.out.println(nomes[aleatorioNomes] + " " + sobrenomes[aleatorioSobrenomes]);
		}
	}
}