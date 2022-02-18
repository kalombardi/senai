package exercicios_lacos;

import java.io.IOException;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		
		int menu = 0;
		
		while (menu != 4) {
			System.out.println("Escolha uma opção do menu: ");
			System.out.println("1. Bom dia\n2. Boa tarde\n3. Boa noite\n4. Sair");
			menu = entrada.nextInt();
			
			switch (menu) {
				case 1:
					System.out.println("Bom dia gente boa!!!");
					break;
				case 2:
					System.out.println("Boa tarde galera!!!");
					break;
				case 3:
					System.out.println("Boa noite, bora dormir zzzzz");
					break;
				case 4:
					System.out.println("Valeu então, até a próxima");
					break;
				default:
					System.out.println("Acorda, essa opção nem existe, dããã...");
					break;
			
			}

		}

	}
}
