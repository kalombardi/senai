package modelo;

import java.util.Scanner;

public class exp2 {
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		
		
		System.out.print("Digite valor de a: ");
		a = entrada.nextDouble();
		
		System.out.print("Digite valor de b: ");
		b = entrada.nextDouble();
		
		System.out.print("Digite valor de c: ");
		c = entrada.nextDouble();
		
		delta = (b*b)-(4 * a * c);
		
		
		if (delta<0){
			System.out.print("Não possui raízes reais");			
		}else {
			r1 = (-b + Math.sqrt(delta))/(2*a);
			r2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("As raízes são: %.4f e %.4f", r1, r2);
		}

	}

}
