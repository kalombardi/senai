package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		Scanner leia = new Scanner(System.in);
		
		int velocidade, distancia, tempoTotal;
		
		System.out.print("Digite a velocidade que seu carro atinge: ");
		velocidade = leia.nextInt();
		
		System.out.print("Digite qual a distancia em km voc� deseja percorrer: ");
		distancia = leia.nextInt();
		
		tempoTotal = distancia/ velocidade;
		
		System.out.println("O tempo que voc� levar� para percorrer este trajeto ser� de: " + tempoTotal + " horas.");

	}

}
