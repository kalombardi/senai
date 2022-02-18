package avaliacaoFormativa01;

import java.io.IOException;
import java.util.Scanner;

public class AvaliacaoFormativa01 {
		public static Scanner scan;
		
		static String nome;
		static double salario;
		static double descontoInss, porcentagemInss;
		static double descontoIrrf, porcentagemIrrf, deduzirIrrf;
		static double resultInss = salario - descontoInss;
		
		public static void main(String[] args) throws IOException{
			scan = new Scanner (System.in);
			
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
			
			System.out.print("Digite seu salário: ");
			salario = scan.nextDouble();
			
			int opcao = 0;
			while (opcao!= 4) {
				System.out.println("1 - INSS");
				System.out.println("2 - IRRF");
				System.out.println("3 - FGTS");
				System.out.println("4 - SAIR");
				System.out.print("Escolha uma opção: ");
				opcao = scan.nextInt();
				switch (opcao) {
				case 1:
					inss();
					break;
				
				case 2:
					irrf();
					break;
					
				case 3:
					System.out.println("Funcionário: " + nome);
					System.out.printf("A alíquota aplicada é 8%%\n");
					System.out.printf("O valor a ser depositado de FGTS é de: R$ %.2f \n", (salario * 0.08));
					break;
				
				case 4:
					double resultInss = salario - descontoInss;
					System.out.println("------------------RELATÓRIO FINAL------------------");
					System.out.println("Funcionário: " + nome);
					System.out.println("Salário Base: " + salario);
					System.out.println("------------------INSS------------------");
					System.out.printf("A alíquota aplicada é %.2f%% \n", porcentagemInss);
					System.out.printf("O desconto de INSS é R$ %.2f\n", descontoInss);
					System.out.printf("Seu salário - INSS será de R$ %.2f\n", salario - descontoInss);
					System.out.println("------------------IRRF------------------");
					System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagemIrrf);
					System.out.printf("O desconto de IRRF é de R$ %.2f\n", descontoIrrf);
					System.out.printf("Seu salário líquido será de R$ %.2f\n", resultInss - descontoIrrf);
					System.out.println("------------------FGTS------------------");
					System.out.printf("A alíquota aplicada é 8%% \n");
					System.out.printf("O valor a ser depositado de FGTS é de R$ %.2f", (salario * 0.08));
					break;
				
				default:
					System.out.println("Opção Inválida");
					break;
				}
			}
		}
			
			public static void inss() {
			scan = new Scanner(System.in);
			
			if(salario > 7087.22) {
				porcentagemInss = 0f;
			}else if(salario > 3641.03) {
				porcentagemInss = 14f;
			}else if(salario > 2427.35){
				porcentagemInss = 12f;
			}else if(salario > 1212.01){
				porcentagemInss = 9f;
			} else {
				porcentagemInss = 7.5f;		
			}
			if(porcentagemInss == 0f)
				descontoInss = 992.21;
			else
				descontoInss = salario * porcentagemInss / 100;	
			
			System.out.println("Funcionário: " + nome);
			System.out.printf("A alíquota aplicada é %.2f%% \n", porcentagemInss);
			System.out.printf("O desconto de INSS é %.2f\n", descontoInss);
			System.out.printf("Você vai receber %.2f\n", salario - descontoInss);	
		}
			
			public static void irrf() {
				scan = new Scanner(System.in);
				double resultInss = salario - descontoInss;

				if(resultInss < 1903.98) {
					porcentagemIrrf = 0f;
					deduzirIrrf = 0f;
				}else if(resultInss < 2826.66) {
					porcentagemIrrf = 7.5f;
					deduzirIrrf = 142.8f;
				}else if(resultInss < 3751.06){
					porcentagemIrrf = 15f;
					deduzirIrrf = 354.8f;
				}else if(resultInss < 4664.68){
					porcentagemIrrf = 22.5f;
					deduzirIrrf = 636.13;
				}else {
					porcentagemIrrf = 27.5f;
					deduzirIrrf = 869.36;
				}	
				descontoIrrf = resultInss * porcentagemIrrf / 100 - deduzirIrrf;
				
				System.out.println("Funcionário: " + nome);
				System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagemIrrf);
				System.out.printf("O desconto de IRRF é de R$ %.2f\n", descontoIrrf);
				System.out.printf("Você vai receber %.2f\n", resultInss - descontoIrrf);	
			}
}