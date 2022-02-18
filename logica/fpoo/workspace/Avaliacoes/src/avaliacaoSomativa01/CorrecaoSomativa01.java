package avaliacaoSomativa01;

import java.util.Scanner;

public class CorrecaoSomativa01 {
	public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int opcao = 0;
		
		while(opcao != 5) {
			mostrarOpcoes();
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					calcularHorasExtras();
					break;
				
				case 2:
					calcularApuracao();
					break;
				
				case 3:
					calcularMateriaPrima();
					break;
					
				case 4:
					calcularBlocos();
					break;
			}
		}
	}

	public static void calcularHorasExtras() {
		input = new Scanner(System.in);
		int opcao_horas = 0;
		
		while(opcao_horas != 2) {
			System.out.println("1. Calcular um novo funcionário");
			System.out.println("2. Voltar ao menu");
			opcao_horas = input.nextInt();
			if(opcao_horas == 1) { /*se a opção escolhida for 1, daí vai rodar o programa do calculo de HE*/
				System.out.println("Digite quantas horas foram trabalhadas: ");
				int total_horas = input.nextInt();
				
				System.out.println("Digite quantas horas extras foram trabalhadas: ");
				int horas_extras = input.nextInt();
				
				double salario = total_horas * 5.625;
				salario = salario + (horas_extras * (5.625 + 5.625*0.75));/*OU  horas_extras * 5.625*1.75  */
				
				System.out.printf("O salário é: R$ %.2f\n", salario);
			}
		}
	}
	
	public static void calcularApuracao(){
		input = new Scanner(System.in);
		
		String[] categorias = new String[3];
		categorias[0] = "Bateria";
		categorias[1] = "Samba-enredo";
		categorias[2] = "Fantasias";
		
		String[] nome_escolas = new String[5];
		int[] soma_escolas = new int[5];
		
		
	}
	
	public static void calcularMateriaPrima() {
		
	}
	
	public static void calcularBlocos() {
		
	}
	
	public static void mostrarOpcoes() {
		String[] vetor_opcoes = new String[5];
		vetor_opcoes[0] = "1. Horas Extras.";
		vetor_opcoes[1] = "2. Apuração.";
		vetor_opcoes[2] = "3. Matérias Primas.";
		vetor_opcoes[3] = "4. Blocos.";
		vetor_opcoes[4] = "5. Sair.";
		
		for(int i = 0; i < vetor_opcoes.length; i++) {
			System.out.println(vetor_opcoes[i]);
		}
		
	}
	
}
