package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
	public static Scanner entrada;
	public static void main(String[] args) throws IOException{
		entrada = new Scanner(System.in);
		
		int codigoPeca1, numPecas1, codigoPeca2, numPecas2; 
        double valUnit1, valUnit2, valPagar;

//      System.out.println("cod pecas1");
        codigoPeca1 = entrada.nextInt();
//      System.out.println("num pecas1");
        numPecas1 = entrada.nextInt();
//      System.out.println("val pecas1");
        valUnit1 = entrada.nextDouble();

//      System.out.println("cod pecas2");
        codigoPeca2 = entrada.nextInt();
//      System.out.println("num pecas2");
        numPecas2 = entrada.nextInt();
//      System.out.println("val pecas2");
        valUnit2 = entrada.nextDouble();
        
        valPagar = (numPecas1 * valUnit1) + (numPecas2 * valUnit2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", valPagar);
        System.out.println("");

	}

}
