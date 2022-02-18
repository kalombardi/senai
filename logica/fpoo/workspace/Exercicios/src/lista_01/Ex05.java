package lista_01;

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int caminhaoTon = 18;
		int alqueireTon = 250;
		int caminhoesPossui, alqueiresPossui;
		int totalLaranjas, viagens, carga;
		
		System.out.print("Digite quantos caminhões você possui: ");
		caminhoesPossui = entrada.nextInt();
		
		System.out.print("Digite quantos alqueires de laranja você possui: ");
		alqueiresPossui = entrada.nextInt();
		
		
		totalLaranjas = alqueiresPossui * alqueireTon;
		carga = caminhoesPossui * caminhaoTon;
		
		viagens = (int) Math.ceil(totalLaranjas / carga);
		
		System.out.println("Você precisará de " + viagens + " viagens para transportar suas laranjas.");
		
	}

}
