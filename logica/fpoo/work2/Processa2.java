import java.util.Scanner;


public class Processa2{

	public static Scanner leia;
	
	public static void main(String[] args){
		leia = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite um numero inteiro: ");
		int v1 = leia.nextInt(); //faz a leitura do teclado
		
		//Sa�da
		System.out.printf("Voc� digitou %d \n", v1);
		 
	}
}