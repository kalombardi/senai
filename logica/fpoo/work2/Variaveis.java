/*
	Este programa é um exemplo e demonstração da segunda aula de fundamentos
	de programação orientada a objeto - FPOO
*/
public class Variaveis{
	public static void main(String[] args){
		//Exemplo do tipo byte
		byte byte1 = 65;
		byte byte2 = 66;
		int resultado = byte1 + byte2;
		System.out.println(resultado);
		
		//Exemplo do tipo char
		char char1 = 65;
		char char2 = 66;
		String result = char1 + " " + char2;
		System.out.println(result);
		
		System.out.println("A soma de dois bytes = " + resultado);
		System.out.println("A soma de dois caracteres = " + result);
	}
}