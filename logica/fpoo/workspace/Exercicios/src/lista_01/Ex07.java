package lista_01;

import java.util.Scanner;

public class Ex07 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		int m, v, d;
		
		System.out.println("Aqui vou te ajudar a calcular a densidade, vamos l??");
		System.out.print("Ent?o digite a massa por favor: ");
		m = entrada.nextInt();
		
		System.out.print("?timo, agora preciso do volume: ");
		v = entrada.nextInt();
		
		d = m / v;
		
		System.out.print("Ent?o com massa " + m + " e volume " + v + " a densidade ser? " + d);
		
		

	}

}
