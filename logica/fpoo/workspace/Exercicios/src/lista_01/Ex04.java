package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int velocidade = 900;
		int distancia, tempoTotal;
		
		System.out.print("Digite a dist�ncia que voc� deseja percorrer: ");
		distancia = entrada.nextInt();
		
		tempoTotal = distancia / velocidade;
		
		System.out.println("Voc� levar� " + tempoTotal + " horas para percorrer os " + distancia + "km.");

	}

}
